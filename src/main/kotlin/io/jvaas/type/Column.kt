package io.jvaas.type

import io.jvaas.mapper.SQLToKotlinTypeMapper
import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase

data class Column(
	val name: String,
	var type: String = "",
	var default: String? = null,
	var nullable: Boolean = true,
	var table: Table,
) {

	val kotlinName: String
		get() = name.snakeToLowerCamelCase()

	val kotlinType: String
		get() = SQLToKotlinTypeMapper.map(type, nullable)

	override fun toString(): String {
		val s = StringBuilder()
		s.append("$name : $type")
		if (default != null) {
			if (nullable) {
				s.append("? = $default")
			} else {
				s.append(" = $default")
			}
		} else {
			if (nullable) {
				s.append("?")
			} else {
				s.append("")
			}
		}

		s.append(" -> $kotlinType")

		return s.toString()
	}


}