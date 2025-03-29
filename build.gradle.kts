plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.taskTree)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.jakta.dsl)
    testImplementation(libs.bundles.kotlin.testing)
    testImplementation(kotlin("test"))
}

kotlin {
    compilerOptions {
        allWarningsAsErrors = true
        freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
    }
}

application {
    mainClass = "HelloAgentKt"
}

tasks.test {
    useJUnitPlatform()
}
