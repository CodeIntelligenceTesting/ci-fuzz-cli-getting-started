plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation ("org.junit.jupiter", "junit-jupiter","5.9.0")
    // Use Jazzer for fuzzing.
    testImplementation ("com.code-intelligence", "jazzer-junit","0.13.0")
}

tasks.test {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

application {
    // Define the main class for the application.
    mainClass.set("MainKt")
}
