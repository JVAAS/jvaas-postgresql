
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.jvaas"
version = "0.0.1"
description = "Reactive Type-Safe PostgreSQL Binding Generator"

java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

application {
    mainClassName = "Demo"
}

plugins {
    application
    kotlin("jvm").version("1.4.10")
    maven
}

repositories {
    mavenLocal()
    jcenter()
}

tasks.withType<KotlinCompile> {
    incremental = true
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {

    val coroutinesVersion = "1.3.9"
    val jasyncVersion = "1.1.3"

    implementation(kotlin("reflect"))
    implementation("org.antlr:antlr4-runtime:4.8-1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")

    implementation("com.github.jasync-sql:jasync-postgresql:$jasyncVersion")

    testImplementation(group = "junit", name = "junit", version = "4.12")
}