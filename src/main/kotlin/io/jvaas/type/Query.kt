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
			}.forEach { row ->
				+"\tval $row,"
			}
			+")"
		}
	}

	fun getKotlinFunctionHeader(): Lines {
		return Lines {
			+"suspend fun $name("

			// add some params
			+Lines {
				inputColumns.map { column ->
					"${column.kotlinName}: ${column.kotlinType}"
				}.forEach { line ->
					+line
					-", "
				}
			}.indent()

			if (inputColumns.isNotEmpty()) {

				+")"
			} else {
				-")"
			}

			if (outputColumns.isNotEmpty()) {
				-": ${getResultClassName()}"
			}

		}
	}

	fun getKotlinFunctionBody(): Lines {
		return Lines {
			+getKotlinFunctionHeader()
			-" {"
			+Lines {
				+"con.execute("
				+Lines {
					+"// language=SQL"
					+"""""""""
					sql.lines().forEach {
						+it
					}
					+"""""""""
				}.indent()
				+")"
			}.indent()
			+"}"
		}
	}

//	fun lines(): Lines {
//		return Lines {
//
//			+getKotlinResultClass().newLine()
//			+"${getKotlinFunctionHeader()} {"
//			+"con.execute("
//			+"\t// language=SQL"
//			+"\t\"\"\""
//			+"\t${sql}"
//			+"\t\"\"\".trimIndent(),"
//			inputColumns.forEach { column ->
//				+("\t\t${column.kotlinName},")
//			}
//			+"\t)"
//			+"}\n"
//		}
//	}

}

