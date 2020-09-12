package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParser.Schema_qualified_nameContext
import io.jvaas.gen.SQLParser.Table_column_defContext
import io.jvaas.gen.SQLParserBaseVisitor
import io.jvaas.types.Model
import io.jvaas.types.Table
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Visitor(val model: Model) : SQLParserBaseVisitor<Unit>() {

	override fun visitCreate_table_statement(ctx: SQLParser.Create_table_statementContext?) {
		var createTableVisited = false
		ctx?.children?.forEach { child ->
			when (child.payload.javaClass) {
				Schema_qualified_nameContext::class.java -> {
					model.tables.add(Table(name = child.text))
					createTableVisited = true
				}
			}
		}
		super.visitCreate_table_statement(ctx)
	}

	override fun visitDefine_columns(ctx: SQLParser.Define_columnsContext?) {
		println(ctx?.text)
		ctx?.children?.forEach { child ->
			println()
			when (child.payload.javaClass) {
				Table_column_defContext::class.java -> {
					val child0 = child.getChild(0)
					for (i in 0 until child0.childCount) {
						val childi = child0.getChild(i)
						println(childi.text)
					}
				}
			}
		}
		super.visitDefine_columns(ctx)
	}


}

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {


		val sql1 =
			// language=SQL
			"""
			CREATE TABLE account (
				id           uuid                    not null
					constraint account_pk
						primary key,
				created      timestamp default now() not null,
				modified     timestamp default now() not null,
				version      integer   default 0     not null,
				display_name varchar,
				email        varchar                 not null,
				enabled      boolean   default false not null,
				full_name    varchar,
				hash         varchar,
				verified     boolean   default false not null,
				verify_hash  varchar,
				reset_hash   varchar,
				phone        varchar
			);
		""".trimIndent()

		// language=SQL
		val sql2 = "SELECT email, full_name FROM account WHERE id = 'TEST'"

		// language=SQL
		val sql3 = """
		CREATE TABLE session(
			id           uuid                    not null
				constraint account_pk
					primary key,
			created 	timestamp	default now() not null
		)
		""".trimIndent()

		// language=SQL
		val sql4 = """
			CREATE TABLE IF NOT EXISTS blah(
				id           uuid                    not null
				constraint account_pk
					primary key,
				created 	timestamp	default now() not null
			)
		""".trimIndent()

		// create new model to track visits of
		val model = Model()

		// loop through each SQL snippet
		listOf(sql1, sql2, sql3, sql4).forEach { sql ->
			val lexer = SQLLexer(CharStreams.fromString(sql))
			val parser = SQLParser(CommonTokenStream(lexer))
			Visitor(model = model).visit(parser.sql())
		}

		// confirm that model contains all the data
		model.tables.forEach {  table ->
			println(table.name)
		}



	}

}