project_name = "jenkins-pipeline-python-test2"
repo = "git@github.com:robertopasc17/jenkins.git"
repo_name = "repo"


pipelineJob(project_name) {
	definition {
		triggers{
			scm('H/1 * * * *')
	}

	cpsScm{
		scm {
			git {
				remote {
				name(repo_name)
				url(repo)
				}
			}
			scriptPath("Jenkinsfile")

			}
		}
	}
}
