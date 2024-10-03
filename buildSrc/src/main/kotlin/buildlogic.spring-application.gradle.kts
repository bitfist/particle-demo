import org.gradle.kotlin.dsl.dependencies

plugins {
    id("buildlogic.java-library-conventions")
    id("org.springframework.boot")
}

val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

dependencies {
    implementation(platform(libs.springBootPlatform))
}