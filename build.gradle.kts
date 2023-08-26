plugins {
	kotlin("jvm") version "1.9.0"
	id("java-library")
	id("maven-publish")
	id("nebula.release") version "17.2.2"
}

group = "org.shypl.tool"

kotlin {
	jvmToolchain(17)
}

repositories {
	mavenCentral()
	mavenLocal()
}

dependencies {
	implementation("org.shypl.tool:tool-lang:1.0.0-SNAPSHOT")
	implementation("org.shypl.tool:tool-utils:1.0.0-SNAPSHOT")
	implementation("org.shypl.tool:tool-io:1.0.0-SNAPSHOT")
	testImplementation(kotlin("test"))
}

java {
	withSourcesJar()
}

publishing {
	publications.create<MavenPublication>("Library") {
		from(components["java"])
	}
}