package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.type.Lines
import io.jvaas.type.Model
import io.jvaas.type.Query
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
		}.comment()

		lines += "/*"
		lines += ""

		lines += Lines {
			model.tables.forEach { table ->
				+table.lines().indent(tabs = 1)
			}
		}.newLine()
		lines += "*/"

		lines += Lines {
			+"==========================================================================="
			+"\tqueries"
			+"==========================================================================="
		}.comment().newLine()

		// check if we should generate the Joda -> Java DateTime converter
		if (model.tables.map {
			it.columns
		}.flatten().map {
			it.kotlinType.startsWith("java.time.LocalDateTime")
		}.contains(true)) {
			lines += Query.getJodaToJavaDateTimeConvert().newLine()
			lines += Lines {
				+"==========================================================================="
			}.comment().newLine()
		}

		// output query lines.
		lines += Lines {
			model.queries.forEach {

				lines += it.getKotlinResultClass()
				lines += newLine()

				lines += it.getKotlinFunctionBody()
				lines += newLine()
				lines += Lines {
					+"==========================================================================="
				}.comment()
				lines += newLine()
			}
		}

		lines.println()

	}
}
