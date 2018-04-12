package ti

class CaseStatus {

	String BI_ASSIGNMENT_STATUSES = ''  // for the UML diagram

	// static belongsTo = [ case : it.Case ]  // reserved word problem ?

	static mapping = {
		table 'BI_ASSIGNMENT_STATUSES'
		version false
	}

	static constraints = {
	}
}
