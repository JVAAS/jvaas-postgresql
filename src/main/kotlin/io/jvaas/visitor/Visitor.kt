package io.jvaas.visitor

import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParser.*
import io.jvaas.gen.SQLParserBaseVisitor
import io.jvaas.mapper.SQLToKotlinTypeMapper
import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase
import io.jvaas.type.Column
import io.jvaas.type.Model
import io.jvaas.type.Query
import io.jvaas.type.Table
import io.jvaas.visitor.Extractor.Companion.walkFamilyTree

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
		lastSQL = Extractor(ctx).extractSQL(debug = false)
		super.visitStatement(ctx)
	}

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
									kotlinName = columnDefContextToken.text.snakeToLowerCamelCase(),
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

		lastTable.columns.forEach { column ->
			column.kotlinType = SQLToKotlinTypeMapper.map(column.type, column.nullable)
		}

		super.visitDefineColumns(ctx)
	}


	override fun visitInsertStmtForPsql(ctx: SQLParser.InsertStmtForPsqlContext?) {

		model.queries.add(Query(
			sql = lastSQL ?: "",
			name = lastFun ?: "unknown"
		))
		lastFun = null

		var tableName: String? = null
		var table: Table? = null
		var insertValues: Boolean = false
		val columns = mutableListOf<Column>()
		val values = mutableListOf<String>()
		var currentValue = ""

		Extractor(ctx).walkLeaves walkLeaves@{ leaf ->

			if (leaf.text == "VALUES") {
				insertValues = true
				return@walkLeaves
			}

			if (table == null) {
				leaf.walkFamilyTree { fam ->
					if (fam.payload is IdTokenContext) {
						tableName = fam.text
						table = getTableFromString(tableName)
						return@walkLeaves
					}
				}
			} else if (!insertValues) {
				leaf.walkFamilyTree { fam ->
					if (fam.payload is IdTokenContext) {
						columns.add(getColumnFromString(table, fam.text))
					}
				}
			} else if (insertValues) {

				//println(leaf.text)
				//println(leaf.parent.payload::class)

				if (leaf.parent.payload is ValuesValuesContext) {
					if (currentValue.isNotEmpty()) {
						values.add(currentValue)
						currentValue = ""
					}
				} else {
					currentValue += leaf.text
				}
			}
		}

		if (columns.size != values.size) {
			throw Exception("Columns.size == ${columns.size} AND Values.size == ${values.size} for query\n$lastSQL")
		}

		values.forEachIndexed { i, value ->
			if (value == "?") {
				lastQuery.columns.add(columns[i])
			}
		}

		println(columns)
		println(values)

		super.visitInsertStmtForPsql(ctx)
	}

	// UPDATE
	override fun visitUpdateStmtForPsql(ctx: SQLParser.UpdateStmtForPsqlContext?) {

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
					lastQuery.columns.add(column)
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

				leaf.walkFamilyTree { fam ->
					if (fam.payload is IdTokenContext) {
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
					lastQuery.columns.add(column)
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

}