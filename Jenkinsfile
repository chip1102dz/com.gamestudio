pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarSever') {
                    sh "./gradlew sonar" // Đảm bảo rằng bạn đang sử dụng lệnh chính xác
                }
            }
        }
    }
}
