pipeline {
    agent any
    stages {
        stage('clone and list') {
            steps {
                git branch: 'sit', url: 'https://github.com/twistedorc/rajul-repo.git'
                sh 'ls -l'
            }
        }
    }
}