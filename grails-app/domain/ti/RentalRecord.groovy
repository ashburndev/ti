package ti

class RentalRecord {

	static belongsTo = [ neighborhood:Neighborhood ]

	static constraints = {
	}

	static mapping = {
		table 'INSPIRE_RENTAL_RECORDS'
		version false
	}
}
