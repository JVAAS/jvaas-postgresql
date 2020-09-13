package io.jvaas.type

class Model(
	val tables: MutableList<Table> = mutableListOf()
) {

	val lastTable
		get() = tables.last()

	val lastColumn
		get() = tables.last().columns.last()


}