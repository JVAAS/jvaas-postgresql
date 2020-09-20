package io.jvaas.type

import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase
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
				+"\t$column"
			}
			+"}"
		}
	}

	override fun toString(): String {
		return lines().toString()
	}

}

