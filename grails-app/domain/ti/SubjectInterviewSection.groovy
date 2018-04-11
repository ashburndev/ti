package ti

class SubjectInterviewSection {

	static belongsTo = [
		sectionType : SubjectInterviewSectionType,
		subjectInterview : SubjectInterview
	]

	static constraints = {
	}
}
