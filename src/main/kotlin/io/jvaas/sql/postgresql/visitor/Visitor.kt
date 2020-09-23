package io.jvaas.sql.postgresql.visitor

import io.jvaas.sql.postgresql.gen.SQLParser
import io.jvaas.sql.postgresql.gen.SQLParser.*
import io.jvaas.sql.postgresql.gen.SQLParserBaseVisitor
import io.jvaas.sql.postgresql.type.Column
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import io.jvaas.sql.postgresql.type.Table
import io.jvaas.sql.postgresql.visitor.Extractor.Companion.walkFamilyTree

class Visitor(val model: Model) : SQLParserBaseVisitor<Unit>() {

	var lastFun: String? = null
	var lastSQL: String? = null

	val lastTable
		get() = model.tables.last()

	val lastColumn
		get() = model.tables.last().columns.last()

	val lastQuery
		get() = model.queries.last()

	fun getTableFromString(tableName: String?): Table {

		if (tableName == null || tableName.isEmpty()) {
			throw Exception("Empty tableName received")
		}

		return model.tables.firstOrNull {
			it.name.equals(tableName, ignoreCase = true)
		} ?: throw Exception("Invalid Table '$tableName' for sql\n\t$lastSQL\n")
	}

	fun getColumnFromString(table: Table?, columnName: String?): Column {

		if (columnName == null || columnName.isEmpty()) {
			throw Exception("Empty columnName received")
		}

		return table?.columns?.firstOrNull {
			it.name.equals(columnName, ignoreCase = true)
		} ?: throw Exception("Invalid Column '$columnName' for sql\n\t$lastSQL\n")
	}

	override fun visitStatement(ctx: SQLParser.StatementContext?) {
		lastSQL = Extractor(ctx).extractSQL().toString()
		super.visitStatement(ctx)
	}

	// COMMENT
	override fun visitLineComment(ctx: SQLParser.LineCommentContext?) {
		val parts = ctx?.text?.split(" ")
		var foundFun = false
		parts?.forEach { part ->
			if (part.trim() == "fun") {
				foundFun = true
			} else if (foundFun) {
				lastFun = part.trim()
			}
		}
		super.visitLineComment(ctx)
	}

	// CREATE
	override fun visitCreateTableStatement(ctx: SQLParser.CreateTableStatementContext?) {
		var createTableVisited = false
		ctx?.children?.forEach { child ->
			if (child.payload.javaClass == SQLParser.SchemaQualifiedNameContext::class.java) {
				model.tables.add(Table(name = child.text))
				createTableVisited = true
			}
		}
		super.visitCreateTableStatement(ctx)
	}

	// COLUMN
	override fun visitDefineColumns(ctx: SQLParser.DefineColumnsContext?) {
		ctx?.children?.forEach { columnDefinition ->
			if (columnDefinition.payload.javaClass == SQLParser.TableColumnDefContext::class.java) {
				(0 until columnDefinition.childCount).map {
					columnDefinition.getChild(it)
				}.forEach { columnDefContext ->
					(0 until columnDefContext.childCount).map {
						columnDefContext.getChild(it)
					}.forEach { columnDefContextToken ->
						when (columnDefContextToken) {
							is IdentifierContext -> {
								lastTable.columns.add(Column(
									name = columnDefContextToken.text,
									table = lastTable
								))
							}
							is SQLParser.DataTypeContext -> {
								lastColumn.type = columnDefContextToken.text
							}
							is SQLParser.ConstraintCommonContext -> {
								columnDefContextToken.children.forEach { columnDefContextTokenConstraint ->
									if (columnDefContextTokenConstraint.text.equals("notnull", ignoreCase = true)) {
										lastColumn.nullable = false
									} else if (columnDefContextTokenConstraint.text.startsWith("default")) {
										lastColumn.default =
											columnDefContextTokenConstraint.text.replaceFirst("default", "")
									}
								}
							}
							else -> println(columnDefContextToken.payload::class.java)
						}
					}
				}
			}
		}

		super.visitDefineColumns(ctx)
	}

	// INSERT
	override fun visitInsertStmtForPsql(ctx: SQLParser.InsertStmtForPsqlContext?) {

		val debug = true

		model.queries.add(Query(
			sql = lastSQL ?: "",
			name = lastFun ?: "unknown"
		))
		lastFun = null

		var table: Table? = null
		var tableName: String? = null

		val insertColumns = mutableListOf<Column>()
		val insertValues = mutableListOf<String>()
		val conflictColumns = mutableListOf<Column>()

		var lastColumn: String? = null

		var insertColumn = false
		var insertValue = false

		Extractor(ctx).walkLeaves walkLeaves@{ leaf ->

			var identifierContext = false
			var conflictActionContext = false
			var insertColumnsContext = false
			var valuesValuesContext = false
			var functionCallContext = false

			if (debug) {
				println(leaf.text)
			}

			leaf.walkFamilyTree { fam ->

				if (debug) {
					println(fam.payload::class)
				}

				identifierContext = identifierContext or (fam.payload is IdentifierContext)
				conflictActionContext = conflictActionContext or (fam.payload is ConflictActionContext)
				insertColumnsContext = insertColumnsContext or (fam.payload is InsertColumnsContext)
				valuesValuesContext = valuesValuesContext or (fam.payload is ValuesValuesContext)
				functionCallContext = functionCallContext or (fam.payload is FunctionCallContext)
			}

			if (debug) {
				println()
			}

			if (identifierContext && tableName == null) {
				tableName = leaf.text
				table = getTableFromString(tableName)
				return@walkLeaves
			} else if (insertColumnsContext && !insertColumn) {
				insertColumn = true
				return@walkLeaves
			} else if (valuesValuesContext && !insertValue) {
				insertColumn = false
				insertValue = true
				return@walkLeaves
			} else if (conflictActionContext) {
				insertColumn = false
				insertValue = false
			}

			if (insertColumn) {
				if (identifierContext) {
					insertColumns.add(getColumnFromString(table, leaf.text))
				}
			} else if (insertValue) {
				if (valuesValuesContext) {
					if (functionCallContext) {
						if (lastFun == null) {
							lastFun = leaf.text
						} else {
							lastFun += leaf.text
						}
					} else {
						if (lastFun != null) {
							insertValues.add(lastFun ?: "")
							lastFun = null
						}
						if (leaf.text != ",") {
							insertValues.add(leaf.text)
						}
					}
				}
			} else if (!insertColumn && !insertValue) {
				if (lastFun != null) {
					insertValues.add(lastFun ?: "")
					lastFun = null
				}

				if (conflictActionContext) {
					if (identifierContext) {
						lastColumn = leaf.text
					} else if (leaf.text == "?") {
						conflictColumns.add(getColumnFromString(table, lastColumn))
					}
				}
			}
		}

		// remove last bracket that's picked up during INSERT INTO ( ... ) VALUES ( ... ) <<--
		if (insertValues.isNotEmpty()) {
			insertValues.removeLast()
		}

		if (insertColumns.size != insertValues.size) {
			throw Exception("Columns.size == ${insertColumns.size} AND Values.size == ${insertValues.size} for query\n$lastSQL")
		}

		if (debug) {
			println("=======")
			println(lastSQL)
			println("=======")
			println(tableName)
			println("=======")
			println(insertColumns)
			println(conflictColumns)
			println("=======")
			println(insertValues)
			println("=======")
		}

		// extract columns matching ? symbols
		insertValues.forEachIndexed { i, value ->
			if (value == "?") {
				lastQuery.inputColumns.add(insertColumns[i])
			}
		}

		// add conflict columns
		lastQuery.inputColumns.addAll(conflictColumns)

		super.visitInsertStmtForPsql(ctx)
	}

	// UPDATE
	override fun visitUpdateStmtForPsql(ctx: SQLParser.UpdateStmtForPsqlContext?) {

		val debug = false

		model.queries.add(Query(
			sql = lastSQL ?: "",
			name = lastFun ?: "unknown"
		))
		lastFun = null

		var tableName: String? = null
		var table: Table? = null

		var setColumn: String? = null
		var setToken: String? = null
		var setValue: String? = null
		var where: Boolean = false
		val columnValues = mutableListOf<String>()

		Extractor(ctx).walkLeaves walkLeaves@{ leaf ->

			if (leaf.text == "WHERE") {
				where = true
				setColumn = null
				setValue = null
			}

			if (where) {
				if (leaf.text == "?") {
					val column = getColumnFromString(table, setColumn)
					lastQuery.inputColumns.add(column)
				} else {
					leaf.walkFamilyTree { fam ->
						if (fam.payload is IdentifierContext) {

							setColumn = fam.text
							//println(">>>> $setColumn")

							return@walkLeaves
						}

					}
				}
			} else if (tableName == null) {

				// extract table name
				if (debug) {
					println(leaf.text)
				}

				leaf.walkFamilyTree { fam ->

					if (debug) {
						println(fam.payload::class)
					}

					if (tableName == null && fam.payload is IdentifierContext) {
						tableName = fam.text

						table = getTableFromString(tableName)
						return@walkLeaves
					}
				}
			} else if (setColumn == null) {

				// extract column name

				leaf.walkFamilyTree { fam ->
					if (fam.payload::class in listOf(
							IdTokenContext::class,
							IdentifierContext::class,
						)
					) {
						setColumn = fam.text
						return@walkLeaves
					}
				}
			} else if (setColumn != null && setToken == null) {
				if (leaf.text == "=") {
					setToken = "="
				}
			} else if (setColumn != null && setToken != null && setValue == null) {

				val column = getColumnFromString(table, setColumn)
				if (leaf.text == "?") {
					lastQuery.inputColumns.add(column)
					columnValues.add(setColumn ?: "setColumn can't be null")
				}

				setColumn = null
				setToken = null
				setValue = null

				return@walkLeaves
			}
		}

		//lastQuery.columns.add(columnValues)
		//println(columnValues)
		//Extractor(ctx).dumpTree()

		super.visitUpdateStmtForPsql(ctx)
	}

	// SELECT
	override fun visitSelectStmt(ctx: SelectStmtContext?) {

		val debug = false

		// make sure we're extracting a valid SELECT query
		// and not a VALUES query
		if (lastFun == null) {
			super.visitSelectStmt(ctx)
			return
		}

		// add new query
		model.queries.add(Query(
			sql = lastSQL ?: "",
			name = lastFun ?: "unknown"
		))
		lastFun = null

		var inputColumn: String? = null
		var outputColumn: String? = null
		val inputColumns = mutableListOf<String>()
		val outputColumns = mutableListOf<String>()
		val columns = mutableListOf<String>()

		val tableNames = mutableListOf<String>()
		val tableNameAliases = mutableMapOf<String, String>()
		var selectScope: Boolean = false
		var fromScope: Boolean = false

		Extractor(ctx).walkLeaves { leaf ->

			var selectSublistContext: Boolean = false
			var schemaQualifiedNameContext: Boolean = false
			var aliasClauseContext: Boolean = false
			var identifierContext: Boolean = false
			var indirectionVarContext: Boolean = false

			if (leaf.text.equals("SELECT", ignoreCase = true)) {
				selectScope = true
			} else if (leaf.text.equals("FROM", ignoreCase = true)) {
				selectScope = false
				fromScope = true
			}

			if (debug) {
				println(leaf.text)
			}
			leaf.walkFamilyTree { fam ->
				when (fam.payload) {
					is SelectSublistContext -> selectSublistContext = true
					is SchemaQualifiedNameContext -> schemaQualifiedNameContext = true
					is AliasClauseContext -> aliasClauseContext = true
					is IdentifierContext -> identifierContext = true
					is IndirectionVarContext -> indirectionVarContext = true
				}
				if (debug) {
					println(fam.payload::class)
				}
			}

			if (aliasClauseContext) {
				if (identifierContext) {
					tableNameAliases[leaf.text] = tableNames.last()
				}
			} else {
				if (selectScope) {
					if (selectSublistContext) {
						if (outputColumn == null) {
							outputColumn = leaf.text
						} else {
							outputColumn += leaf.text
						}
					} else if (outputColumn != null) {
						outputColumns.add(outputColumn ?: "")
						outputColumn = null
					}
				} else if (fromScope) {
					if (schemaQualifiedNameContext) {
						tableNames.add(leaf.text)
					}

					if (indirectionVarContext) {
						if (inputColumn == null) {
							inputColumn = leaf.text
						} else {
							inputColumn += leaf.text
						}
					} else if (inputColumn != null) {
						columns.add(inputColumn ?: "")
						inputColumn = null
					}

					if (leaf.text == "?") {
						inputColumns.add(columns.last())
					}

				}
			}

			if (debug) {
				println()
			}


		}

		if (inputColumn != null) {
			inputColumns.add(inputColumn ?: "")
		}
		if (outputColumn != null) {
			outputColumns.add(outputColumn ?: "")
		}

		listOf(inputColumns, outputColumns).forEachIndexed { index, col ->
			col.forEach { column ->
				var tableName: String? = null
				var columnName: String? = null
				if (column.contains(".")) {
					val parts = column.split(".").toMutableList()
					columnName = parts.removeLast()
					tableName = tableNameAliases[parts.removeLast()]
				} else {
					columnName = column
					if (tableNames.size != 1) {
						throw Exception("""
						Not sure which table column=${column} matches with,
						aliases=${tableNameAliases},
						query=${lastSQL}
					""".trimIndent())
					}
					tableName = tableNames.first()
				}

				// extract tables and columns
				if (index == 0) {
					lastQuery.inputColumns.add(getColumnFromString(
						table = getTableFromString(tableName),
						columnName = columnName
					))
				} else if (index == 1) {
					lastQuery.outputColumns.add(getColumnFromString(
						table = getTableFromString(tableName),
						columnName = columnName
					))
				}
			}
		}

		if (debug) {
			println("==================")
			println("--------")
			println(lastSQL)
			println("--------")
			println(inputColumn)
			println("columns = " + columns.joinToString(separator = " | "))
			println("outputColumns = " + outputColumns.joinToString(separator = " | "))
			println("inputColumns = " + inputColumns.joinToString(separator = " | "))
			println(tableNames.joinToString(separator = " | "))
			println(tableNameAliases)
			println("==================")
		}

		super.visitSelectStmt(ctx)
	}


}