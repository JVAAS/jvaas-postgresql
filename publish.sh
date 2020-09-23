
rm -rf ~/.m2/repository/io/jvaas/jvaas-sql-postgresql/*

gradle build 
gradle publishToMavenLocal

ls -lah ~/.m2/repository/io/jvaas/jvaas-sql-postgresql

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-sql-postgresql gs://repo.jvaas.io/io/jvaas


