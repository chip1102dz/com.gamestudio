node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv('Sonar_Sever') { // Tự động sử dụng cấu hình SonarQube đã định nghĩa
        bat "gradlew sonar" // Chạy lệnh phân tích trên Windows
    }
  }
}
