import org.gradle.kotlin.dsl.dependencies

plugins {
    id("buildlogic.java-library-conventions")
    id("org.springframework.boot")
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.3.2"))
}