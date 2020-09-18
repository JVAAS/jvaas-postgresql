# JVAAS PostgreSQL

This library generates binding code for raw PostreSQL queries

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
