package io.jvaas.type

import kotlin.text.StringBuilder

data class Table(
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {

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

