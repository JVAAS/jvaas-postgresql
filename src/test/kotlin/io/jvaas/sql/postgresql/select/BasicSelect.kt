package io.jvaas.sql.postgresql.select

import io.jvaas.sql.postgresql.Generator
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test

class BasicSelect {

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
			)
			""".byteInputStream()
		)
	}

	@Test
	fun testSetup() {

		assertTrue(model.tables.size == 1)
		assertEquals("account", model.tables.first().name)
		model.tables.first().columns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("id", column.name)
					assertEquals("accountId", column.kotlinName)
					assertEquals("String", column.kotlinType)
				}
				1 -> {
					assertFalse(column.nullable)
					assertEquals("created", column.name)
					assertEquals("accountCreated", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				2 -> {
					assertFalse(column.nullable)
					assertEquals("modified", column.name)
					assertEquals("accountModified", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				3 -> {
					assertFalse(column.nullable)
					assertEquals("non_null_version", column.name)
					assertEquals("accountNonNullVersion", column.kotlinName)
					assertEquals("Int", column.kotlinType)
				}
				4 -> {
					assertTrue(column.nullable)
					assertEquals("nullable_version", column.name)
					assertEquals("accountNullableVersion", column.kotlinName)
					assertEquals("Int?", column.kotlinType)
				}
			}
		}
	}

	@Test
	fun testBasicSelect() {
		generator.processAdditionalSQL("""
			-- fun testBasicSelect
			SELECT id, created, modified, non_null_version, nullable_version
			FROM account
			WHERE id = ?
		""")

		val query = queries.first()
		assertEquals("testBasicSelect", query.name)
		query.outputColumns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("accountId", column.kotlinName)
					assertEquals("String", column.kotlinType)
				}
				1 -> {
					assertFalse(column.nullable)
					assertEquals("accountCreated", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				2 -> {
					assertFalse(column.nullable)
					assertEquals("accountModified", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				3 -> {
					assertFalse(column.nullable)
					assertEquals("accountNonNullVersion", column.kotlinName)
					assertEquals("Int", column.kotlinType)
				}
				4 -> {
					assertTrue(column.nullable)
					assertEquals("accountNullableVersion", column.kotlinName)
					assertEquals("Int?", column.kotlinType)
				}
			}
		}
		query.inputColumns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("accountId", column.kotlinName)
					assertEquals("String", column.kotlinType)
				}
			}
		}
	}

	@Test
	fun testAliasedSelect() {
		generator.processAdditionalSQL("""
			-- fun testBasicSelect
			SELECT a.id, a.created, a.modified, a.non_null_version, a.nullable_version
			FROM account AS a
			WHERE id = ?
		""")

		val query = queries.first()
		assertEquals("testBasicSelect", query.name)
		query.outputColumns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("accountId", column.kotlinName)
					assertEquals("String", column.kotlinType)
				}
				1 -> {
					assertFalse(column.nullable)
					assertEquals("accountCreated", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				2 -> {
					assertFalse(column.nullable)
					assertEquals("accountModified", column.kotlinName)
					assertEquals("java.time.LocalDateTime", column.kotlinType)
				}
				3 -> {
					assertFalse(column.nullable)
					assertEquals("accountNonNullVersion", column.kotlinName)
					assertEquals("Int", column.kotlinType)
				}
				4 -> {
					assertTrue(column.nullable)
					assertEquals("accountNullableVersion", column.kotlinName)
					assertEquals("Int?", column.kotlinType)
				}
			}
		}
		query.inputColumns.forEachIndexed { index, column ->
			when (index) {
				0 -> {
					assertFalse(column.nullable)
					assertEquals("accountId", column.kotlinName)
					assertEquals("String", column.kotlinType)
				}
			}
		}
	}


}