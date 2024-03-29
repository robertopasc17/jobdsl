folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}



project_name = "jenkins-pipeline-python"
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
