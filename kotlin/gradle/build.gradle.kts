plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    // Include cifuzz
    id("com.code-intelligence.cifuzz") version "1.2.0"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

application {
    // Define the main class for the application.
    mainClass.set("MainKt")
}
