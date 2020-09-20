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

	fun getKotlinResultClass(): String {
		return buildString {
			appendLine("data class ${getResultClassName()}(")
			outputColumns.map {
				it.table.kotlinName + it.kotlinName.capitalize() + " : " + it.kotlinType
			}.forEach {
				appendLine("\tval $it,")
			}
			appendLine(")")
		}
	}

	fun getKotlinFunctionHeader(): String {
		val sb = StringBuilder()
		sb.append("suspend fun $name(")

		inputColumns.map { column ->
			"""
				${column.kotlinName}: ${column.kotlinType}
			""".trimIndent()
		}.joinToString().let {
			sb.append(it)
		}

		sb.append(")")
		if (outputColumns.isNotEmpty()) {
			sb.append(": ${getResultClassName()}")
		}

		return sb.toString()
	}

}