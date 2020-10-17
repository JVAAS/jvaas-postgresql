
rm -rf ~/.m2/repository/io/jvaas/jvaas-postgresql
#rm -rf build

gradle build 
gradle publishToMavenLocal

ls -lah ~/.m2/repository/io/jvaas/jvaas-postgresql

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-postgresql gs://repo.jvaas.io/io/jvaas


