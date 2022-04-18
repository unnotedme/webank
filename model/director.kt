package model

class Director(
    name: String,
    ssn: String,
    salary: Double,
    password: Int,
    val psp: Double
) : WorkersAdmin(
    name = name,
    ssn = ssn,
    salary = salary,
    password = password
) {

    override val bonus: Double
        get() {
            return salary + psp
        }

}