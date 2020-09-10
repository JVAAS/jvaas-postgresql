package io.jvaas

import io.jvaas.gen.PostgreSQLLexer
import io.jvaas.gen.PostgreSQLParser
import io.jvaas.gen.PostgreSQLParserBaseVisitor
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree


class Visitor : PostgreSQLParserBaseVisitor<Unit>() {

	override fun visitSelect_stmt(ctx: PostgreSQLParser.Select_stmtContext?) {
		println(ctx?.text)
		super.visitSelect_stmt(ctx)
	}

}

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {

		val sql = """
			SELECT * FROM table WHERE column = 1
		""".trimIndent()

		val lexer = PostgreSQLLexer(ANTLRInputStream(sql))
		val parser = PostgreSQLParser(CommonTokenStream(lexer))
		val parseTree: ParseTree = parser.???

		Visitor().visit(parseTree)

	}

}