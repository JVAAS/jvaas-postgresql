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
			s.append("\t${column.name} : ${column.type}")
			if (column.default != null) {
				if (column.nullable) {
					s.append("? = ${column.default}")
				} else {
					s.append(" = ${column.default}")
				}
			} else {
				if (column.nullable) {
					s.append("?")
				} else {
					s.append("")
				}
			}
			s.append("\n")
		}
		s.append("}\n")
		return s.toString()
	}

}

