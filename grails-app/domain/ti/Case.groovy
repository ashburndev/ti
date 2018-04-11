package ti

class Case {

	static belongsTo =  [
		agent : Agent,
		taskDetail : TaskDetail
	]

	static hasMany = [
		agentInvestigations : AgentInvestigation,
		caseSections : CaseSection,
		estimatedCompletions : EstimatedCompletion,
		leads : Lead,
		statuses : CaseStatus
	]

	static constraints = {
	}
}
