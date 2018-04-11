package ti

class Reference {

	CaseSection caseSection

	// note really, just doing this for UML diagram
	static hasMany = [
		exSpouse : ExSpouse,
		informant : Informant,
		generalReference : GeneralReference
	]

	static constraints = {
	}
}
