package ti

class VerifiableCaseSection {

	CaseSection caseSection

	static hasMany = [
		contacts : Contact,
		educationRecords : EducationRecord,
		employmentRecords : EmploymentRecord,
		neighborhoodRecords : Neighborhood
	]

	static constraints = {
	}
}
