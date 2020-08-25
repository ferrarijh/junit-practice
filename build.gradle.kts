import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.70"

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("junit:junit:4.13")
}

application {
    // Define the main class for the application.
    mainClassName = "junit.practice2.AppKt"
}