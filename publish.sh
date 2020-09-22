
gradle build publishToMavenLocal

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-sql-postgresql gs://repo.jvaas.io/io/jvaas


