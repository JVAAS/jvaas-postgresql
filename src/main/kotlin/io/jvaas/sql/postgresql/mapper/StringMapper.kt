package io.jvaas.sql.postgresql.mapper

object StringMapper {

	// too lazy to write regex, stole it from
	// https://stackoverflow.com/questions/60010298/how-can-i-convert-a-camel-case-string-to-snake-case-and-back-in-idiomatic-kotlin

	val camelRegex = "(?<=[a-zA-Z])[A-Z]".toRegex()
	val snakeRegex = "_[a-zA-Z]".toRegex()

	fun String.camelToSnakeCase(): String {
		return camelRegex.replace(this) {
			"_${it.value}"
		}.toLowerCase()
	}

	fun String.snakeToLowerCamelCase(): String {
		return snakeRegex.replace(this) {
			it.value.replace("_","")
				.toUpperCase()
		}
	}

	fun String.snakeToUpperCamelCase(): String {
		return this.snakeToLowerCamelCase().capitalize()
	}

}