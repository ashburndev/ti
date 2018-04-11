package ti

class SystemGroupMember {

	static belongsTo = [
		jobAssignment : SystemJobAssignment,
		agentBranchType : SystemGroupType,
		agentBranchMemberType : SystemGroupMemberType
	]

	static constraints = {
	}
}
