package io.jvaas.type

data class Query(
	val sql: String,
	val name: String,
	val inputColumns: MutableList<Column> = mutableListOf(),
	val outputColumns: MutableList<Column> = mutableListOf(),
) {

	fun getKotlinFunctionHeader(): String {
		val sb = StringBuilder()
		sb.append("fun $name(")

		inputColumns.map { column ->
			"""
				${column.kotlinName}: ${column.kotlinType}
			""".trimIndent()
		}.joinToString().let {
			sb.append(it)
		}

		sb.append(")")

		return sb.toString()
	}

}