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
sonarqube {
    properties {
        property ("sonar.projectKey", "rockman-master")
        property ("sonar.projectName", "rockman-master")
        property ("sonar.host.url", "http://localhost:9000")
        property ("sonar.token", "sqp_ad2be4911638e209431361fa814643c749736d12")
    }
}