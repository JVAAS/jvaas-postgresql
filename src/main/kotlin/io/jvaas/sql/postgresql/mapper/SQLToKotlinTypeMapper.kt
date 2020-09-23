package io.jvaas.sql.postgresql.mapper

object SQLToKotlinTypeMapper {

	fun map(input: String, nullable: Boolean): String {

		val type = when (input) {
			"bigint" -> "Long"
			"boolean" -> "Boolean"
			"varchar" -> "String"
			"charactervarying" -> "String"
			"integer" -> "Int"
			"int" -> "Int"
			"text" -> "String"
			"timestamp" -> "java.time.LocalDateTime"
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