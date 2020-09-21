# JVAAS PostgreSQL

This library generates binding code for raw PostreSQL queries

Input: 
```
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



Input:

```
-- fun demoQuery
UPDATE listing SET modified = now(), title = ?, title_url = ?
WHERE id = ? AND version = ? AND title    LIKE       ? OR bedrooms > 0;
```

Output:

```
fun demoQuery(title: String?, titleUrl: String?, id: String, version: Int?, title: String?) {
	con.execute(
		// language=SQL
		"""
		UPDATE listing SET modified=now(), title=?, title_url=? WHERE id=? AND version=? AND title LIKE ? OR bedrooms > 0
		""".trimIndent(),
		title,
		titleUrl,
		id,
		version,
		title,
	)
}
```

Input:

```
-- fun insertListingId
INSERT INTO listing (id, created, modified) VALUES (?, now(), now());
```

Output:

```
fun insertListingId(id: String) {
	con.execute(
		// language=SQL
		"""
		INSERT INTO listing(id, created, modified) VALUES(?, now(), now())
		""".trimIndent(),
		id,
	)
}
``
