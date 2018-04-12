package ti

class CaseSection {

	String INSPIRE_CASE_SECTIONS = ''  // for the UML diagram

	static hasOne = [
		birthRecord : BirthRecord,
		generalRecord : GeneralRecord,
		lead : Lead,
		policeRecord : PoliceRecord,
		reference : Reference,
		subjectInterview : SubjectInterview,
		verifiableCaseSection : VerifiableCaseSection
	]

	static belongsTo = [
		// case : Case,
		caseSectionType : CaseSectionType
	]

	static hasMany = [ icdIssues : ICDIssue ]

	static mapping = {
		table 'INSPIRE_CASE_SECTIONS'
		version false
	}

	static constraints = {
	}
}
