package io.jvaas.sql.postgresql

import io.jvaas.sql.postgresql.type.Lines
import kotlinx.coroutines.runBlocking
import java.io.File
import java.nio.file.Paths
import java.util.*

object Scratch {

	@JvmStatic
	fun main(args: Array<String>) = runBlocking {

		val generator = Generator(
			javaClass.getResourceAsStream("/samples/setup.sql"),
			javaClass.getResourceAsStream("/samples/listing.sql"),
		).generateOutput(
			packageName = "io.jvaas.sql.postgresql",
			className = "Blah"
		).println().dumpToFile(
			file = File(
				Lines {
					-Paths.get("").toAbsolutePath().toString().trimEnd('/', '\\')
					-File.separator
					-"src"
					-File.separator
					-"main"
					-File.separator
					-"kotlin"
					-File.separator
					-"io"
					-File.separator
					-"jvaas"
					-File.separator
					-"sql"
					-File.separator
					-"postgresql"
					-File.separator
					-"Blah.kt"
				}.toString()
			)
		)

		// createdb demo --owner=vlad --password
		val pg = PostgreSQL(
			username = "vlad",
			password = "asdf",
			host = "localhost",
			database = "demo",
		)

		pg.transaction { con ->
			Blah(con).insertListingId(
				listingId = UUID.randomUUID().toString()
			)
		}

		Unit
	}
}
