package ti

class Lead {

	CaseSection caseSection

	static belongsTo = [
		leadType : LeadType
	]

	static constraints = {
	}
}
