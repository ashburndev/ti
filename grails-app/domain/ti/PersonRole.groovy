package ti

class PersonRole {

	static belongsTo = [
		personRoleType : PersonRoleType,
		person : Person
	]


	static constraints = {
	}
}
