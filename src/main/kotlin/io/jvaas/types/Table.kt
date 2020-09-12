package io.jvaas.types

data class Table(
	val name: String,
	val columns: MutableList<Column> = mutableListOf()
) {


}

