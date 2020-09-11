package io.jvaas

import io.jvaas.gen.PostgreSQLLexer
import io.jvaas.gen.PostgreSQLParser
import io.jvaas.gen.PostgreSQLParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree


class Visitor : PostgreSQLParserBaseVisitor<Unit>() {

	override fun visitSelect_stmt(ctx: PostgreSQLParser.Select_stmtContext?) {
		println(ctx?.text)
		super.visitSelect_stmt(ctx)
	}

	override fun visitStmt(ctx: PostgreSQLParser.StmtContext?) {
		println(ctx?.text)
		super.visitStmt(ctx)
	}

}

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {


		val sql =
			// language=SQL
			"""
			INSERT INTO listing AS l			 (
				-- core fields
				l.section, l.id, l.created, l.modified, l.version,
				-- basic fields
				l.sale, l.rental, l.salePrice, l.rentalPrice, l.title, l.titleUrl, l.description,
				-- detail fields
				l.bedrooms, l.bathrooms, l.garages, l.parkings, l.floorSize, l.erfSize, l.ratesAndTaxes, l.levies
				-- region fields
				l.country, l.countryUrl, l.province, l.provinceUrl, l.city, l.cityUrl, l.suburb, l.suburbUrl
				-- agent fields
				-- admin fields
			) VALUES (
				-- core fields
				?, ?, now(), now(), ?,
				-- basic fields
				?, ?, ?, ?, ?, ?, ?,
				-- detail fields
				?, ?, ?, ?, ?, ?, ?, ?,
				-- region fields
				?, ?, ?, ?, ?, ?, ?, ?
			) ON CONFLICT (l.id) DO UPDATE SET
				-- core fields
				l.section = ?,
				l.modified = now(),
				l.version = listing.version + 1
		""".trimIndent()
		val lexer = PostgreSQLLexer(CharStreams.fromString(sql))
		val parser = PostgreSQLParser(CommonTokenStream(lexer))
		val parseTree: ParseTree = parser.root()

		Visitor().visit(parseTree)

	}

}