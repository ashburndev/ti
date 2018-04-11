package ti

class Agent {

	static belongsTo = [
		groupType : GroupType,
		jobAssignment : SystemJobAssignment
	]

	static hasMany = [
		mileageReports : MileageReport
	]

	static constraints = {
	}

}
