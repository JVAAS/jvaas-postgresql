package io.jvaas.sql.postgresql

import io.jvaas.sql.postgresql.gen.SQLLexer
import io.jvaas.sql.postgresql.gen.SQLParser
import io.jvaas.sql.postgresql.type.Lines
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import io.jvaas.sql.postgresql.visitor.Visitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.InputStream

class Generator(vararg val streams: InputStream) {

	// create new model to track visits of
	val model = Model()

	init {
		streams.forEach {
			val lexer = SQLLexer(CharStreams.fromStream(it))
			val parser = SQLParser(CommonTokenStream(lexer))
			Visitor(model = model).visit(parser.sql())
		}
	}

	fun generateOutput(
		packageName: String,
		className: String,
	): Lines {
		// confirm that model contains all the data
		val lines = Lines {}

		lines += Lines {
			+"=".repeat(40)
			+"\ttables"
			+"=".repeat(40)
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
			+"=".repeat(40)
			+"\tqueries"
			+"=".repeat(40)
		}.comment().newLine()

		// check if we should generate the Joda -> Java DateTime converter
		if (model.tables.map {
				it.columns
			}.flatten().map {
				it.kotlinType.startsWith("java.time.LocalDateTime")
			}.contains(true)) {
			lines += Query.getJodaToJavaDateTimeConvert().newLine()
			lines += Lines {
				+"=".repeat(40)
			}.comment().newLine()
		}

		// output query lines.
		lines += Lines {
			model.queries.forEach { query ->

				if (query.outputColumns.isNotEmpty()) {
					lines += query.getKotlinResultClass()
					lines += newLine()
				}

				lines += query.getKotlinFunctionBody()
				lines += newLine()
				lines += Lines {
					+"=".repeat(40)
				}.comment()
				lines += newLine()
			}
		}


		return Lines {
			+"package $packageName"
			+""
			+"class $className(val con: com.github.jasync.sql.db.Connection) {"
			+""
			+lines.indent()
			+"}"
		}

	}


}