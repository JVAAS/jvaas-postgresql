package io.jvaas.type

data class Query(
	val sql: String,
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {

	fun getKotlinFunctionHeader(): String {
		val sb = StringBuilder()
		sb.append("fun $name(")

		columns.map { column ->
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