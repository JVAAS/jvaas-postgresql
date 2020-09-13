package io.jvaas

import io.jvaas.gen.SQLLexer
import io.jvaas.gen.SQLParser
import io.jvaas.type.Model
import io.jvaas.visitor.CreateTableVisitor
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
			CreateTableVisitor(model = model).visit(parser.sql())
		}

		// confirm that model contains all the data
		model.tables.forEach { table ->
			println(table)
			println("")
		}


	}
}
