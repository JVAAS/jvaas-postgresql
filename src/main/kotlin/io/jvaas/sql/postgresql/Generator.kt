package io.jvaas.sql.postgresql

import io.jvaas.sql.postgresql.gen.SQLLexer
import io.jvaas.sql.postgresql.gen.SQLParser
import io.jvaas.sql.postgresql.type.Model
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


}