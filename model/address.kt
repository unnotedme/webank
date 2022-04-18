package model

class Address(
    var number: Int = 0,
    var street: String = "",
    var district: String = "",
    var city: String = "",
    var province: String = "",
){
    override fun toString() : String {
        return """
        Address(
            number=$number,
            street=$street,
            district=$district,
            city=$city,
            province=$province
        )
        """.trimIdent()
    }

    override fun equals(other:Any?): Boolean {
        if (this === other) return true
        if (javaClas != other?.javaClas) return false
        
        other as Address

        if (number != other.number) return false
        if (street != other.street) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (province != other.province) return false

        return true
    }

    override fun hashCode(): Int {
        var result = 31 * result + number
        result = 31 * result + street.hashCode()
        result = 31 * result + district.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + province.hashCode()
        return result
    }
}