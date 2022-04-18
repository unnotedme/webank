package model

class Analyst(
    name: String,
    ssn: String,
    salary: Double
) : Worker(
    name = name,
    ssn = ssn,
    salary = salary
) {

    override val bonus: Double
        get() {
            return salary * 0.1
        }

}