package io.jvaas.visitor

import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParserBaseVisitor
import io.jvaas.type.Column
import io.jvaas.type.Model
import io.jvaas.type.Query
import io.jvaas.type.Table
import org.antlr.v4.runtime.tree.ParseTree
import java.util.*

class Visitor(val model: Model) : SQLParserBaseVisitor<Unit>() {

	var lastFun: String? = null

	fun getSQL(children: List<ParseTree>? = null): String {
		return children?.map { it.text }?.joinToString(" ") ?: ""
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
							is SQLParser.IdentifierContext -> {
								model.lastTable.columns.add(Column(name = columnDefContextToken.text))
							}
							is SQLParser.DataTypeContext -> {
								model.lastColumn.type = columnDefContextToken.text
							}
							is SQLParser.ConstraintCommonContext -> {
								columnDefContextToken.children.forEach { columnDefContextTokenConstraint ->
									if (columnDefContextTokenConstraint.text == "notnull") {
										model.lastColumn.nullable = false
									} else if (columnDefContextTokenConstraint.text.startsWith("default")) {
										model.lastColumn.default =
											columnDefContextTokenConstraint.text.replaceFirst("default", "")
									}
								}
							}
							else -> println(columnDefContextToken.payload::class.java)
						}
					}
				}
			}
			super.visitDefineColumns(ctx)
		}
	}



	override fun visitInsertStmtForPsql(ctx: SQLParser.InsertStmtForPsqlContext?) {


//		ctx?.children?.forEach { child ->
//			println(child.payload.javaClass)
//			println(child.text)
//		}
//
//		println(ctx?.children)

		super.visitInsertStmtForPsql(ctx)
	}

	// UPDATE
	override fun visitUpdateStmtForPsql(ctx: SQLParser.UpdateStmtForPsqlContext?) {
		model.queries.add(Query(
			sql = getSQL(ctx?.children),
			name = lastFun ?: UUID.randomUUID().toString().replace("-", "")
		))
		super.visitUpdateStmtForPsql(ctx)
	}

	// UPDATE SET
	override fun visitUpdateSet(ctx: SQLParser.UpdateSetContext?) {
		println("SET")
		ctx?.children?.forEach {
			println(it.payload::class.java)
			println(it.text)
			println()
		}
		super.visitUpdateSet(ctx)
	}

}