package io.jvaas.sql.postgresql.update

import io.jvaas.sql.postgresql.Generator
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import junit.framework.Assert
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class BasicUpdateTests {

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

	fun testSetup() {
		// TODO
	}

	@Test
	fun testBasicUpdate() {
		generator.processAdditionalSQL("""
			-- fun testBasicUpdate
			UPDATE session SET active = ?, version = version + 1, modified = now() WHERE email = ?;
		""")

		val query = queries.first()
		assertEquals("testBasicUpdate", query.name)
		assertTrue(query.outputColumns.isEmpty())
		assertTrue(query.inputColumns.size == 2)
		query.inputColumns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("sessionActive", column.kotlinName)
					assertEquals("Boolean", column.kotlinType)
				}
				1 -> {
					assertTrue(column.nullable)
					assertEquals("sessionEmail", column.kotlinName)
					assertEquals("String?", column.kotlinType)
				}
			}
		}


	}




}