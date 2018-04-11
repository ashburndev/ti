package ti

class CaseSection {

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

	static constraints = {
	}
}
