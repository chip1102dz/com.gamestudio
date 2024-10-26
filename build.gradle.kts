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
        property("sonar.sources", "src/main/java") // Thêm đường dẫn tới mã nguồn
        property("sonar.java.binaries", "build/classes/java/main") // Đường dẫn tới các lớp đã biên dịch
    }
}

