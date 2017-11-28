node {
	stage ('Compile') {
		git credentialsId: 'jenkins-ssh-key', url: 'git@github.com:wannessels/devops-course-app.git'
		dir ("$WORKSPACE/dev") {
			sh 'chmod +x ./gradlew'
			sh './gradlew classes'
		}
		
	}
    stage ('Test') {
		dir ("$WORKSPACE/dev") {
			sh 'chmod +x ./gradlew'
			sh './gradlew test'
			
		}
		archiveArtifacts artifacts: '**/build/reports/**'
	}
	stage ('Test') {
		dir ("$WORKSPACE/dev") {
			sh 'chmod +x ./gradlew'
			sh './gradlew integrationTest'
			
		}
		archiveArtifacts artifacts: '**/build/reports/**'
	}
    
}