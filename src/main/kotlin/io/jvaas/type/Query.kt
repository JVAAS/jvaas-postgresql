package io.jvaas.type

data class Query(
	val sql: String,
	val name: String,
	val inputColumns: MutableList<Column> = mutableListOf(),
	val outputColumns: MutableList<Column> = mutableListOf(),
) {

	fun getResultClassName(): String {
		return name.capitalize() + "Result"
	}

	fun getKotlinResultClass(): Lines {
		return Lines {
			+"data class ${getResultClassName()}("
			outputColumns.map {
				it.table.kotlinName + it.kotlinName.capitalize() + " : " + it.kotlinType
			}.forEach {
				+"\tval $it,"
			}
			+")"
		}
	}

	fun getKotlinFunctionHeader(): Lines {
		return Lines {
			+"suspend fun $name("

			// add some params
			inputColumns.map { column ->
				"${column.kotlinName}: ${column.kotlinType}"
			}.joinToString().let {
				+it
			}

			+")"


			if (outputColumns.isNotEmpty()) {
				+": ${getResultClassName()}"
			}
		}
	}

	fun lines(): Lines {
		return Lines {
			//println(query.getKotlinFunctionHeader())
			//println(query.sql)
			//println()

			+getKotlinResultClass()
			+"${getKotlinFunctionHeader()} {"
			+"con.execute("
			+"\t// language=SQL"
			+"\t\"\"\""
			+"\t${sql}"
			+"\t\"\"\".trimIndent(),"
			inputColumns.forEach { column ->
				+("\t\t${column.kotlinName},")
			}
			+"\t)"
			+"}\n"
		}
	}

}

