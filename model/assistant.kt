package model

import model.Worker

class Assistant(
    name: String,
    ssn: String,
    salary: Double
) : Worker(
    name = name,
    ssn = ssn,
    salary = salary
) {
    override val bonus: Double
        get() = salary * 0.05
}