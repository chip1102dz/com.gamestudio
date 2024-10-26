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
                bat "gradlew build" // Đảm bảo rằng bạn đang sử dụng lệnh chính xác
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('Sonar_Sever') {
                    bat "gradlew sonar" // Đảm bảo rằng bạn đang sử dụng lệnh chính xác
                }
            }
        }
    }
}
