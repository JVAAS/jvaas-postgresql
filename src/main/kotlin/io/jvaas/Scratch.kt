package io.jvaas

import io.jvaas.gen.*

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) {

		val sql = """
			SELECT * FROM table WHERE column = 1
		""".trimIndent()

		PostgreSQLParser.SELECT

	}


}