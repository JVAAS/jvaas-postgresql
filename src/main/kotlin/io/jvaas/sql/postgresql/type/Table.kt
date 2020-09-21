package io.jvaas.sql.postgresql.type

import io.jvaas.sql.postgresql.mapper.StringMapper.snakeToLowerCamelCase
import kotlin.text.StringBuilder

data class Table(
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {

	val kotlinName: String
		get() = name.snakeToLowerCamelCase()

	fun lines(): Lines {
		return Lines {
			+"$name {"
			columns.forEach {  column ->
				+column.lines().indent(tabs = 1)
			}
			+"}"
		}
	}

	override fun toString(): String {
		return lines().toString()
	}

}

