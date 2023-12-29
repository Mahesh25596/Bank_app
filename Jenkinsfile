pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
                git 'https://github.com/Mahesh25596/Bank_app.git'
                sh './mvnw clean compile'
            }
        }
    }
}
