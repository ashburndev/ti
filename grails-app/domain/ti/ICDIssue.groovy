package ti

class ICDIssue {

	String comments
	// Person overriddenBy

	static belongsTo = [
		caseSection : CaseSection,
		icdType : ICDIssueType
	]

	static constraints = {
	}
}
