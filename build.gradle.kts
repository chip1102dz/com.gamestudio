plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
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
        property("sonar.projectKey", "TestSonar")
        property("sonar.projectName", "TestSonar")
        property("sonar.sources", "src/main/java") // Thêm đường dẫn tới mã nguồn
        property("sonar.java.binaries", "build/classes/java/main") // Đường dẫn tới các lớp đã biên dịch
    }
}

