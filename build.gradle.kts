plugins {
    id("java")
    id("org.sonarqube") version "5.0.0.4638"
}

group = "com.gamestudio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
sonar {
  properties {
    property("sonar.projectKey", "Onix-Project")
    property("sonar.projectName", "Onix-Project")
  }
}
