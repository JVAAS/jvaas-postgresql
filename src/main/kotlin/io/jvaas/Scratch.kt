package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase
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
		println("=================================================")
		println("\ttables")
		println("=================================================")
		model.tables.forEach { table ->
			println(table)
		}
		println("=================================================")
		println("\tqueries")
		println("=================================================")
		model.queries.forEach { query ->
			//println(query.getKotlinFunctionHeader())
			//println(query.sql)
			//println()

			println(query.getKotlinResultClass())
			println("${query.getKotlinFunctionHeader()} {")
			println("\tcon.execute(")
			println("\t\t// language=SQL")
			println("\t\t\"\"\"")
			println("\t\t${query.sql}")
			println("\t\t\"\"\".trimIndent(),")
			query.inputColumns.forEach { column ->
				println("\t\t${column.kotlinName},")
			}
			println("\t)")
			println("}\n")



		}
		println("=================================================")

	}
}
