package ti

class Case {

	// public static final String BI_DDETAIL_AGENT_ASSIGNMENTS = ''  // for the UML diagram

	String BI_DDETAIL_AGENT_ASSIGNMENTS = ''  // for the UML diagram

	static belongsTo =  [
		agent : Agent,
		taskDetail : TaskDetail
	]

	static hasMany = [
		agentInvestigations : AgentInvestigation,
		caseSections : CaseSection,
		estimatedCompletions : EstimatedCompletion,
		// leads : Lead,   // this is in the original file, but suppress for UML diagram
		statuses : CaseStatus
	]

	static mapping = {
		table 'BI_DDETAIL_AGENT_ASSIGNMENTS'
		version false
	}

	static constraints = {
	}

	// public String BI_DDETAIL_AGENT_ASSIGNMENTS() {return ''}  // for the UML diagram

	public String toString() {
		"Case-${id}".toString()
	}

}
