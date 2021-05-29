pipeline{
    
    agent any
    
    stages{
        stage('build'){
            steps{
                echo 'build started'
                sh 'mvn -DskipTests clean package'
                echo 'build completed'
            }
        }
        
        stage('test'){
            steps{
                
                sh 'mvn test'
                
                echo 'test sucessfully'
            }
        }
        
        stage('deploy'){
            steps{
                echo 'deployed sucessfully'
            }
        }
        
        
    }
    
}
