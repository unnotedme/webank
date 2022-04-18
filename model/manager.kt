package model

import model.WorkersAdmin

class Manager(
    name: String,
    ssn: String,
    salary: Double,
    password: Int
) : WorkersAdmin(
    name = name,
    ssn = ssn,
    salary = salary,
    password = password
) {

    override val bonus: Double
        get() {
            return salary
        }

}