package io.jvaas.sql.postgresql.select

import io.jvaas.sql.postgresql.Generator
import io.jvaas.sql.postgresql.type.Model
import io.jvaas.sql.postgresql.type.Query

class JoinSelectTests {

	lateinit var generator: Generator

	private val model: Model
		get() = generator.model

	private val queries: List<Query>
		get() = model.queries



}