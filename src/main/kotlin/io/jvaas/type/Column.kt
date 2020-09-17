package io.jvaas.type

data class Column(
	val name: String,
	var type: String = "",
	var default: String? = null,
	var nullable: Boolean = true,
	var table: Table,
	var kotlinType: String? = "Any?",
) {


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