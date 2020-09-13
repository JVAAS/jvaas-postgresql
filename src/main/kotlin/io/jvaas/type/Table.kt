package io.jvaas.type

data class Table(
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {


}

