package io.jvaas.sql.postgresql

import io.jvaas.sql.postgresql.gen.SQLLexer
import io.jvaas.sql.postgresql.gen.SQLParser
import io.jvaas.sql.postgresql.type.Lines
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import io.jvaas.sql.postgresql.visitor.Visitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {

		val generator = Generator(
			javaClass.getResourceAsStream("/samples/setup.sql"),
			javaClass.getResourceAsStream("/samples/listing.sql"),
		).generateOutput(
			packageName = "com.company.sql",
			className = "Blah"
		).println().dumpToFile(
			file = File("Blah.kt")
		)




	}
}
