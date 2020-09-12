package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Visitor : SQLParserBaseVisitor<Unit>() {

	override fun visitCreate_table_statement(ctx: SQLParser.Create_table_statementContext?) {
		println(ctx?.children)
		println(ctx?.name)
		super.visitCreate_table_statement(ctx)
	}

}

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {


		var sql =
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
			)
		""".trimIndent()
		println(sql)

		val lexer = SQLLexer(CharStreams.fromString(sql))
		val parser = SQLParser(CommonTokenStream(lexer))

		Visitor().visit(parser.sql())

	}

}