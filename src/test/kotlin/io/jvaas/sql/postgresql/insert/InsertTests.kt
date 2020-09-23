package io.jvaas.sql.postgresql.insert

import io.jvaas.sql.postgresql.Generator
import io.jvaas.sql.postgresql.type.Column.Companion.numberDuplicateColumns
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class InsertTests {

	lateinit var generator: Generator

	private val model: Model
		get() = generator.model

	private val queries: List<Query>
		get() = model.queries

	@Before
	fun setup() {
		generator = Generator(
			"""
			CREATE TABLE account (
				id           uuid                                      NOT NULL,
				created      timestamp without time zone DEFAULT now() NOT NULL,
				modified     timestamp without time zone DEFAULT now() NOT NULL,
				non_null_version integer DEFAULT 0 NOT NULL,
				nullable_version integer DEFAULT 0
			);
			
			CREATE TABLE session (
				created    timestamp without time zone DEFAULT now() NOT NULL,
				modified   timestamp without time zone DEFAULT now() NOT NULL,
				version    integer                     DEFAULT 0     NOT NULL,
				token      character varying,
				account_id uuid                                      NOT NULL,
				email      character varying,
				active     boolean                     DEFAULT false NOT NULL
			);
			""".byteInputStream()
		)
	}

	@Test
	fun testInsertWithConflict() {
		generator.processAdditionalSQL("""
			-- fun testCreateSession
			INSERT INTO session (
				created, modified, version, token, account_id, email, active
			) VALUES (
				now(), now(), 0, ?, ?, ?, true
			) ON CONFLICT (account_id) DO UPDATE SET
				modified = now(),
				version  = session.version + 1,
				token    = ?,
				active   = true
			WHERE version = ?
		""")

		val query = queries.first()

		assertEquals("testCreateSession", query.name)
		assertTrue(query.outputColumns.isEmpty())
		assertTrue(query.inputColumns.size == 5)
		query.inputColumns.numberDuplicateColumns().forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertEquals("sessionToken", column.kotlinName)
					assertEquals("sessionToken1", column.kotlinNameWithCounter)
				}
				1 -> {
					assertEquals("sessionAccountId", column.kotlinName)
					assertEquals("sessionAccountId", column.kotlinNameWithCounter)
				}
				2 -> {
					assertEquals("sessionEmail", column.kotlinName)
					assertEquals("sessionEmail", column.kotlinNameWithCounter)
				}
				3 -> {
					assertEquals("sessionToken", column.kotlinName)
					assertEquals("sessionToken2", column.kotlinNameWithCounter)
				}
				4 -> {
					assertEquals("sessionVersion", column.kotlinName)
					assertEquals("sessionVersion", column.kotlinNameWithCounter)
				}
			}
		}

	}

	fun testMoreValuesThanTablesScenario() {
		// TODO
	}

	fun testMoreTablesThanValuesScenario() {
		// TODO
	}



}