package dev.farazmd

class Utils implements Serializable {

	def steps

	Utils(steps) {
		this.steps = steps
	}

	/**
	 * @return GIT config for devteam-tools
	 */
	def gitTools() {
	    return [branch: 'master']
	}

	def checkout(Map repo){
		println "Loading repository ${repo.name}, branch: ${repo.branch}"
		this.steps.checkout([
			$class: 'GitSCM',
			branches: [[name:  repo.branch ]],
			userRemoteConfigs: [[ url: "https://github.com/farazmd/${repo.name}.git" ]]
		])
		println "Loaded repository ${repo.name}"
	}
}