package io.jvaas.type

data class Query(
	val sql: String,
	val name: String,
	val columns: MutableList<ColumnWithValue> = mutableListOf()
) {

}