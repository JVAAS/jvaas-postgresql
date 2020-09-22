
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.jvaas"
version = "0.0.1"
description = "Reactive Type-Safe PostgreSQL Binding Generator"

java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

plugins {
    kotlin("jvm").version("1.4.10")
    maven
    `maven-publish`
}

repositories {
    mavenLocal()
    jcenter()
}

tasks.withType<KotlinCompile> {
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

    implementation("com.github.jasync-sql:jasync-postgresql:$jasyncVersion")

    testImplementation(group = "junit", name = "junit", version = "4.12")
}