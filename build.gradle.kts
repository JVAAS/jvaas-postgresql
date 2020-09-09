
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.jvaas"
version = "0.0.0"
description = "PostgreSQL DSL for Kotlin"

java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

application {
    mainClassName = "Demo"
}

plugins {
    application
    kotlin("jvm").version("1.4.0")
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
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.antlr:antlr4-runtime:4.8-1")

    testImplementation(group = "junit", name = "junit", version = "4.12")
}