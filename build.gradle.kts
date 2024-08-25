plugins {
	id("buildlogic.java-library-conventions")
	id("buildlogic.swt-library-conventions")
	id("buildlogic.github-package-repository-conventions")
	id("buildlogic.spring-application")
}

dependencies {
	api("io.github.bitfist:particle-spring-boot-starter:0.1.2")

	implementation("org.springframework.boot:spring-boot-starter")
	implementation("com.fasterxml.jackson.core:jackson-databind")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
