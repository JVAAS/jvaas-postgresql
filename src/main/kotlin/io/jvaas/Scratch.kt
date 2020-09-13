package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParser.*
import io.jvaas.gen.SQLParserBaseVisitor
import io.jvaas.types.Column
import io.jvaas.types.Model
import io.jvaas.types.Table
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Visitor(val model: Model) : SQLParserBaseVisitor<Unit>() {

	override fun visitCreate_table_statement(ctx: SQLParser.Create_table_statementContext?) {
		var createTableVisited = false
		ctx?.children?.forEach { child ->
			if (child.payload.javaClass == Schema_qualified_nameContext::class.java) {
				model.tables.add(Table(name = child.text))
				createTableVisited = true
			}
		}
		super.visitCreate_table_statement(ctx)
	}

	override fun visitDefine_columns(ctx: SQLParser.Define_columnsContext?) {
		ctx?.children?.forEach { columnDefinition ->
			if (columnDefinition.payload.javaClass == Table_column_defContext::class.java) {
				(0 until columnDefinition.childCount).map {
					columnDefinition.getChild(it)
				}.forEach { columnDefContext ->
					(0 until columnDefContext.childCount).map {
						columnDefContext.getChild(it)
					}.forEach { columnDefContextToken ->
						when (columnDefContextToken) {
							is IdentifierContext -> {
								model.lastTable.columns.add(Column(name = columnDefContextToken.text))
							}
							is Data_typeContext -> {
								model.lastColumn.type = columnDefContextToken.text
							}
							is Constraint_commonContext -> {
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
			super.visitDefine_columns(ctx)
		}


	}
}

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {

		// create new model to track visits of
		val model = Model()

		// read sample SQL file to generate sample Kotlin classes from
		val sql = javaClass.getResourceAsStream("/samples/setup.sql")

		val lexer = SQLLexer(CharStreams.fromStream(sql))
		val parser = SQLParser(CommonTokenStream(lexer))
		Visitor(model = model).visit(parser.sql())

		// confirm that model contains all the data
		model.tables.forEach { table ->
			println(table)
			println("")
		}


	}
}
