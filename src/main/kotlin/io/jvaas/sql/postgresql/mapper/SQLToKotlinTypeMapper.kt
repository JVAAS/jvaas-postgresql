package io.jvaas.sql.postgresql.mapper

object SQLToKotlinTypeMapper {

	fun map(input: String, nullable: Boolean): String {

		val type = when (input) {
			"bigint" -> "Long"
			"boolean" -> "Boolean"
			"charactervarying" -> "String"
			"integer" -> "Int"
			"int" -> "Int"
			"text" -> "String"
			"timestampwithouttimezone" -> "java.time.LocalDateTime"
			"uuid" -> "String"
			else -> throw Exception("""Unmatched type "$input"""")
		}



		return if (nullable) {
			"$type?"
		} else {
			type
		}

	}


}