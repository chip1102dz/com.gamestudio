pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh "./gradlew build" // Đảm bảo rằng bạn đang sử dụng lệnh chính xác
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
