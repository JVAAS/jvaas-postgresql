val projectVersion = "0.0.17"

group = "io.jvaas"
version = projectVersion
description = "Reactive Type-Safe PostgreSQL Binding Generator"

repositories {
	mavenLocal()
	jcenter()
}

plugins {
	kotlin("jvm").version("1.4.30")
	maven
	`maven-publish`
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
	}
}

dependencies {

	val coroutinesVersion = "1.3.9"
	val jasyncVersion = "1.1.3"
	val antlrVersion = "4.8-1"

	implementation(kotlin("reflect"))
	implementation("org.antlr:antlr4-runtime:$antlrVersion")

	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")

	api("com.github.jasync-sql:jasync-postgresql:$jasyncVersion")

	testImplementation(kotlin("test-junit"))
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			groupId = "io.jvaas"
			artifactId = "jvaas-postgresql"
			version = projectVersion

			from(components["java"])
		}
	}
}
