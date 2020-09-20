package io.jvaas.type

import io.jvaas.mapper.SQLToKotlinTypeMapper
import io.jvaas.mapper.StringMapper.snakeToLowerCamelCase
import io.jvaas.mapper.StringMapper.snakeToUpperCamelCase

data class Column(
	val name: String,
	var type: String = "",
	var default: String? = null,
	var nullable: Boolean = true,
	var table: Table,
) {

	val kotlinName: String
		get() = table.kotlinName + name.snakeToUpperCamelCase()

	val kotlinType: String
		get() = SQLToKotlinTypeMapper.map(type, nullable)

	fun lines(): Lines {
		return Lines {
			+name
			if (default != null) {
				if (nullable) {
					-"? = $default"
				} else {
					-" = $default"
				}
			} else {
				if (nullable) {
					-"?"
				} else {
					-""
				}
			}

			-" -> $kotlinName : $kotlinType"
		}
	}

	override fun toString(): String {
		return lines().toString()
	}


}