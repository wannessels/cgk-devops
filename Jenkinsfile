node {
	stage ('Compile') {
		checkout scm
		gradle 'classes'
		
	}
    stage ('Test') {
		gradle 'test'
		archiveArtifacts artifacts: '**/build/reports/**'
	}
	stage ('IntegrationTest') {
		gradle 'integrationTest'
		archiveArtifacts artifacts: '**/build/reports/**'
	}
	stage ('Build Docker Image') {
		gradle 'buildDockerImage'
	}
	
    
}

def gradle(task) {
	println "gradlew ${task}"
	dir ('dev') {
		sh "./gradlew ${task} --info --stacktrace"
	}
}