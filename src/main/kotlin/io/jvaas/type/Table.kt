package io.jvaas.type

import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase
import kotlin.text.StringBuilder

data class Table(
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {
	val kotlinName: String
		get() = name.snakeToLowerCamelCase()

	override fun toString(): String {
		val s = StringBuilder()

		s.append("$name {\n")
		columns.forEach {  column ->
			s.append("\t$column\n")
		}
		s.append("}\n")
		return s.toString()
	}

}

