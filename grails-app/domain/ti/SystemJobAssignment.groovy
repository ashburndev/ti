package ti

class SystemJobAssignment {

	static hasMany = [
		agentBranches : SystemGroupMember
	]

	static belongsTo = [
		person : Person
	]

	static constraints = {
	}
}
