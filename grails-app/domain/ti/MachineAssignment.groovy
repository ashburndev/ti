package ti

class MachineAssignment {

	String machineName

	static belongsTo = [
		person : Person
	]

	static constraints = {
	}
}
