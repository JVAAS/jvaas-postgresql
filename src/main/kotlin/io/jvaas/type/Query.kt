package io.jvaas.type

import java.lang.StringBuilder

data class Query(
	val sql: String,
	val name: String,
	val columns: MutableList<ColumnWithValue> = mutableListOf()
) {

	fun getKotlinFunctionHeader(): String {
		val sb = StringBuilder()
		sb.append("fun $name(")

		columns.filter {
			it.value == "?"
		}.map {  columnValue ->
			"""
				${columnValue.column.kotlinName}: ${columnValue.column.kotlinType}
			""".trimIndent()

		}.joinToString().let {
			sb.append(it)
		}

		sb.append(")")

		return sb.toString()
	}

}