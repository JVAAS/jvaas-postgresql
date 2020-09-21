package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.type.Lines
import io.jvaas.type.Model
import io.jvaas.visitor.Visitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {

		// create new model to track visits of
		val model = Model()

		// read sample SQL file to generate sample Kotlin classes from
		val setupSql = javaClass.getResourceAsStream("/samples/setup.sql")
		val sampleSql = javaClass.getResourceAsStream("/samples/listing.sql")

		listOf(setupSql, sampleSql).forEach {
			val lexer = SQLLexer(CharStreams.fromStream(it))
			val parser = SQLParser(CommonTokenStream(lexer))
			Visitor(model = model).visit(parser.sql())
		}

		// confirm that model contains all the data
		val lines = Lines {}

		lines += Lines {
			+"==========================================================================="
			+"\ttables"
			+"==========================================================================="
		}.newLine().comment()

		lines += Lines {
			model.tables.forEach { table ->
				+table.lines().indent(tabs = 1)
			}
		}.newLine().comment()

		lines += Lines {
			+"==========================================================================="
			+"\tresults"
			+"==========================================================================="
		}.newLine().comment()

		// TODO: print result classes here


		lines += Lines {
			+"==========================================================================="
			+"\tqueries"
			+"==========================================================================="
		}.comment().newLine()

		lines += Lines {
			model.queries.forEach {
				lines += it.getKotlinFunctionBody().newLine()
			}
		}.indent()

		lines += Lines {
			+"==========================================================================="
		}.comment().newLine()

		lines.println()

	}
}
