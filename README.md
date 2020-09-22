# JVAAS PostgreSQL

This library generates async / reactive non-blocking type-safe binding code for raw PostreSQL queries.
There is no JDBC anywhere in this library, instead it uses non-blocking drivers from [Jasync](https://github.com/jasync-sql/jasync-sql)

It reads the CREATE statements and based on that, determines if the Kotlin type should be nullable or not, 
what Kotlin types to use and it checks your raw SQL queries for typos while generating all the boilerplate for you.

Example CREATE statement:
```
CREATE TABLE listing_image
(
    id         uuid              NOT NULL,
    listing_id uuid              NOT NULL,
    width      integer DEFAULT 0,
    height     integer DEFAULT 0,
    name       character varying NOT NULL,
    batch      uuid              NOT NULL
);
```

Input: 
```
-- fun selectAllWhereIdIs1
SELECT l.id, title FROM listing AS l WHERE l.id = ?;

-- fun complexSelectWithJoin
SELECT
    l.id, l.title, l.title_url, li.id, li.width, li.height, li.name, l.published,
    l.parkings, l.erf_size, l.sale_price, l.created, l.modified, l.version
FROM listing AS l
LEFT JOIN listing_image AS li ON l.id = li.listing_id
LEFT JOIN account AS a ON a.id = l.id
WHERE l.id = ? AND l.created < now() AND li.width > ? AND li.height > ?
```

Output:

```
data class SelectAllWhereIdIs1Result(
	val listingId : String,
	val listingTitle : String?,
)

suspend fun selectAllWhereIdIs1(
	listingId: String, 
): List<SelectAllWhereIdIs1Result> {
	return con.execute(
		// language=SQL
		"""
		SELECT l . id , title FROM listing AS l WHERE l . id = 
		? 
		""",
		listingId,
	).rows.map { row ->
		SelectAllWhereIdIs1Result(
			listingId = row.getString(0) ?: throw Exception(
				"listing.id is declared as non-nullable, but is returning null"
			),
			listingTitle = row.getString(1),
		)
	}
}

data class ComplexSelectWithJoinResult(
	val listingId : String,
	val listingTitle : String?,
	val listingTitleUrl : String?,
	val listingImageId : String,
	val listingImageWidth : Int?,
	val listingImageHeight : Int?,
	val listingImageName : String,
	val listingPublished : Boolean,
	val listingParkings : Int?,
	val listingErfSize : Long?,
	val listingSalePrice : Int?,
	val listingCreated : java.time.LocalDateTime?,
	val listingModified : java.time.LocalDateTime?,
	val listingVersion : Int?,
)

suspend fun complexSelectWithJoin(
	listingId: String, 
	listingImageWidth: Int?, 
	listingImageHeight: Int?, 
): List<ComplexSelectWithJoinResult> {
	return con.execute(
		// language=SQL
		"""
		SELECT l . id , l . title , l . title_url , li . id , li . 
		width , li . height , li . name , l . published , l . 
		parkings , l . erf_size , l . sale_price , l . created , l . 
		modified , l . version FROM listing AS l LEFT JOIN 
		listing_image AS li ON l . id = li . listing_id LEFT JOIN account 
		AS a ON a . id = l . id WHERE l . id = ? AND l . created < now ( 
		) AND li . width > ? AND li . height > ? 
		""",
		listingId,
		listingImageWidth,
		listingImageHeight,
	).rows.map { row ->
		ComplexSelectWithJoinResult(
			listingId = row.getString(0) ?: throw Exception(
				"listing.id is declared as non-nullable, but is returning null"
			),
			listingTitle = row.getString(1),
			listingTitleUrl = row.getString(2),
			listingImageId = row.getString(3) ?: throw Exception(
				"listing_image.id is declared as non-nullable, but is returning null"
			),
			listingImageWidth = row.getInt(4),
			listingImageHeight = row.getInt(5),
			listingImageName = row.getString(6) ?: throw Exception(
				"listing_image.name is declared as non-nullable, but is returning null"
			),
			listingPublished = row.getBoolean(7) ?: throw Exception(
				"listing.published is declared as non-nullable, but is returning null"
			),
			listingParkings = row.getInt(8),
			listingErfSize = row.getLong(9),
			listingSalePrice = row.getInt(10),
			listingCreated = row.getDate(11)?.fromJodaDateTimeToJavaLocalDateTime(),
			listingModified = row.getDate(12)?.fromJodaDateTimeToJavaLocalDateTime(),
			listingVersion = row.getInt(13),
		)
	}
}
```

# Setup

Gradle Kotlin DSL:

    repositories {
        jcenter()
        mavenCentral()
        maven {
            url = uri("https://storage.googleapis.com/repo.jvaas.io")
        }
    }

    dependencies {
        val jvaasPostgreSQLVersion = "0.0.1"
        implementation("io.jvaas:jvaas-sql-postgrsql:$jvaasPostgreSQLVersion")
    }

Maven:

    <repositories>
        <repository>
            <id>jvaas-oss</id>
            <name>jvaas opensource software</name>
            <url>https://storage.googleapis.com/repo.jvaas.io</url>
        </repository>
    </repositories>
    
    <dependencies>
        <dependency>
            <groupId>io.jvaas</groupId>
            <artifactId>jvaas-sql-postgresql</artifactId>
            <version>0.0.1</version>
        </dependency>
    </depdencies>

To generate Kotlin files from SQL input, the following is needed:

		Generator(
			javaClass.getResourceAsStream("/samples/setup.sql"),
			javaClass.getResourceAsStream("/samples/listing.sql"),
		).generateOutput(
			packageName = "io.company.generated",
			className = "Blah"
		).println().dumpToFile(file = File(...))
		
Create a DB connection pool:

		val pg = PostgreSQL(
			username = "vlad",
			password = "asdf",
			host = "localhost",
			database = "demo",
		)
		
Finally, make use of the generated Kotlin:

		pg.transaction { con ->
			Blah(con).insertListingId(
				listingId = UUID.randomUUID().toString()
			)
		}