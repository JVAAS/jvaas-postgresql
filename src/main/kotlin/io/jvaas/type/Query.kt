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

	fun getKotlinResultClass(): Function {
		return Function {
			+"data class ${getResultClassName()}("
			outputColumns.map {
				it.table.kotlinName + it.kotlinName.capitalize() + " : " + it.kotlinType
			}.forEach {
				+"\tval $it,"
			}
			+")"
		}
	}

	fun getKotlinFunctionHeader(): Function {
		return Function {
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

}

