package io.jvaas.sql.postgresql.type

data class Query(
	val sql: String,
	val name: String,
	val inputColumns: MutableList<Column> = mutableListOf(),
	val outputColumns: MutableList<Column> = mutableListOf(),
) {

	fun getResultClassName(): String {
		return name.capitalize() + "Result"
	}

	companion object {
		fun getJodaToJavaDateTimeConvert() = Lines {
			+"private fun org.joda.time.LocalDateTime.fromJodaDateTimeToJavaLocalDateTime(): java.time.LocalDateTime {"
			+"	val utc = this.toDateTime(org.joda.time.DateTimeZone.UTC);"
			+"	val secondsSinceEpoch: Long = utc.millis / 1000"
			+"	val milliSeconds: Long = utc.millis - (secondsSinceEpoch * 1000)"
			+""
			+"	return java.time.LocalDateTime.ofEpochSecond("
			+"		secondsSinceEpoch,"
			+"		milliSeconds.toInt() * 1000000,"
			+"		java.time.ZoneOffset.UTC"
			+"	)"
			+"}"
		}
	}

	fun getKotlinResultClass(): Lines {
		return Lines {
			+"data class ${getResultClassName()}("
			outputColumns.map {
				it.kotlinName + " : " + it.kotlinType
			}.forEach { row ->
				+"\tval $row,"
			}
			+")"
		}
	}

	fun getKotlinFunctionHeader(): Lines {
		return Lines {
			+"suspend fun $name("

			// add some params
			+Lines {
				inputColumns.map { column ->
					"${column.kotlinName}: ${column.kotlinType}"
				}.forEach { line ->
					+line
					-", "
				}
			}.indent()

			if (inputColumns.isNotEmpty()) {

				+")"
			} else {
				-")"
			}

			if (outputColumns.isNotEmpty()) {
				-": List<${getResultClassName()}>"
			}

		}
	}

	fun getKotlinFunctionBody(): Lines {
		return Lines {
			+getKotlinFunctionHeader()
			-" {"
			+Lines {
				if (outputColumns.isEmpty()) {
					+"con.execute("
				} else {
					+"return con.execute("
				}
				+Lines {
					+"// language=SQL"
					+"""""""""
					sql.lines().forEach {
						+it
					}
					+"""""""""
					if (inputColumns.isNotEmpty()) {
						-","
						inputColumns.forEach {
							+"${it.kotlinName},"
						}
					}




				}.indent()
				+")"

				if (outputColumns.isNotEmpty()) {
					-".rows.map { row ->"
					+Lines {
						+getResultClassName()
						-"("
						+Lines {
							outputColumns.forEachIndexed { index, column ->
								+"${column.kotlinName} = row."
								when (column.kotlinType) {
									"String", "String?" -> -"getString($index)"
									"Boolean", "Boolean?" -> -"getBoolean($index)"
									"Int", "Int?" -> -"getInt($index)"
									"Long", "Long?" -> -"getLong($index)"
									"Double", "Double?" -> -"getDouble($index)"
									"Float", "Float?" -> -"getFloat($index)"
									"java.time.LocalDateTime",
									"java.time.LocalDateTime?" -> {
										-"getDate($index)?.fromJodaDateTimeToJavaLocalDateTime()"
									}

									else -> throw Exception("Type ${column.kotlinType} is not handled yet")
								}

								if (column.nullable == false) {
									-" ?: throw Exception("
									+Lines {
										+"\"${column.table.name}.${column.name} is declared as non-nullable, but is returning null\""
									}.indent()
									+")"
								}

								-","
							}
						}.indent()
						+")"
					}.indent()
					+"}"
				}

			}.indent()
			+"}"
		}
	}

}

