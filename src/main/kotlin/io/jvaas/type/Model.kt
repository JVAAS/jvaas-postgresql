package io.jvaas.type

class Model(
	val tables: MutableList<Table> = mutableListOf(),
	val queries: MutableList<Query> = mutableListOf(),
) {

	val lastTable
		get() = tables.last()

	val lastColumn
		get() = tables.last().columns.last()

	val lastQuery
		get() = queries.last()

}