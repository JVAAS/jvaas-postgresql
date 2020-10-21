
rm -rf ~/.m2/repository/io/jvaas/jvaas-postgresql
#rm -rf build

gradle build || exit
gradle publishToMavenLocal || exit

ls -lah ~/.m2/repository/io/jvaas/jvaas-postgresql || exit

gsutil cp -R ~/.m2/repository/io/jvaas/jvaas-postgresql gs://repo.jvaas.io/io/jvaas || exit


