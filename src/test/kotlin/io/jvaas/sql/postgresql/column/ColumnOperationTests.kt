package io.jvaas.sql.postgresql.column

import io.jvaas.sql.postgresql.type.Column
import io.jvaas.sql.postgresql.type.Column.Companion.numberDuplicateColumns
import io.jvaas.sql.postgresql.type.Table
import junit.framework.Assert.assertEquals
import org.junit.Test

class ColumnOperationTests {

	@Test
	fun testColumnDuplicateCounter() {

		val table = Table(name = "blah")
		val testColumn = Column(
			name = "blah",
			type = "varchar",
			nullable = false,
			duplicateCounter = 0,
			table = table,
			default = ""
		)

		// check that non-duplicate columns are not numbered
		listOf<Column>(
			testColumn
		).numberDuplicateColumns().forEachIndexed { index, column ->
			when (index) {
				0 -> assertEquals("blahBlah", column.kotlinNameWithCounter)
			}
		}

		// confirm that duplicate columns are numbered
		listOf<Column>(
			testColumn, testColumn
		).numberDuplicateColumns().forEachIndexed { index, column ->
			when (index) {
				0 -> assertEquals("blahBlah1", column.kotlinNameWithCounter)
				1 -> assertEquals("blahBlah2", column.kotlinNameWithCounter)
			}
		}




	}



}