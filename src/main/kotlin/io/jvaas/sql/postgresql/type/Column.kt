package io.jvaas.sql.postgresql.type

import io.jvaas.sql.postgresql.mapper.SQLToKotlinTypeMapper
import io.jvaas.sql.postgresql.mapper.StringMapper.snakeToUpperCamelCase

data class Column(
	val name: String,
	val type: String = "",
	val default: String? = null,
	val nullable: Boolean = true,
	val table: Table,
	val duplicateCounter: Int = 0,
) {

	val kotlinName: String
		get() = table.kotlinName + name.snakeToUpperCamelCase()

	val kotlinNameWithCounter: String
		get() = if (duplicateCounter > 0) {
			table.kotlinName + name.snakeToUpperCamelCase() + duplicateCounter
		} else {
			table.kotlinName + name.snakeToUpperCamelCase()
		}

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

	companion object {

		fun List<Column>.numberDuplicateColumns(): List<Column> {

			val columnDuplicatesMapCounter = mutableMapOf<String, Int>()

			return this.map { column ->
				val result = column.copy(
					duplicateCounter = columnDuplicatesMapCounter.getOrDefault(column.kotlinName, 0)
				)

				columnDuplicatesMapCounter.putIfAbsent(column.kotlinName, 0)
				columnDuplicatesMapCounter[column.kotlinName] = columnDuplicatesMapCounter.getOrDefault(column.kotlinName, 0) + 1

				result
			}.map { column ->
				if (columnDuplicatesMapCounter.getOrDefault(column.kotlinName, 0) > 1) {
					column.copy(
						duplicateCounter = column.duplicateCounter + 1
					)
				} else {
					column
				}
			}
		}
	}

}