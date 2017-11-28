node {
	stage ('Compile') {
		git credentialsId: '43fa56ae-2764-4376-a122-17f2d82bfd85', url: 'https://github.com/wannessels/cgk-devops.git'
		dir ("$WORKSPACE") {
			sh 'chmod +x gradlew'
			sh 'gradlew compile'
		}
		
	}
    stage ('Test') {
		dir ("$WORKSPACE") {
			sh 'chmod +x gradlew'
			sh 'gradlew check'
		}
	}
    
}