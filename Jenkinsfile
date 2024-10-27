pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                // Kiểm tra mã nguồn từ Git
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Xây dựng dự án với Gradle
                script {
                    def result = sh(script: "./gradlew build", returnStatus: true)
                    if (result != 0) {
                        error("Build failed. Please check the output for errors.")
                    }
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Phân tích mã nguồn với SonarQube
                withSonarQubeEnv('Sonar_Sever') {
                    script {
                        def result = sh(script: "./gradlew sonarqube", returnStatus: true)
                        if (result != 0) {
                            error("SonarQube analysis failed. Please check the output for errors.")
                        }
                    }
                }
            }
        }
    }
    post {
        failure {
            // Thông báo khi build thất bại
            echo 'Build or analysis failed. Please check the logs for details.'
        }
        success {
            // Thông báo khi build thành công
            echo 'Build and analysis completed successfully!'
        }
    }
}
