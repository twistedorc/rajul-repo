pipeline {
    agent any
    stages {
        stage('clone and list') {
            steps {
                git branch: 'main', url: 'https://github.com/twistedorc/rajul-repo.git'
                sh 'ls -l'
            }
        }
    }
}