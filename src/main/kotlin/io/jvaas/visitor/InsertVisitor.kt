package io.jvaas.visitor

import io.jvaas.gen.SQLParser
import io.jvaas.gen.SQLParserBaseVisitor
import io.jvaas.type.Model

class InsertVisitor(val model: Model) : SQLParserBaseVisitor<Unit>() {

	override fun visitInsert_stmt_for_psql(ctx: SQLParser.Insert_stmt_for_psqlContext?) {

		println(ctx?.children)

		super.visitInsert_stmt_for_psql(ctx)
	}

}