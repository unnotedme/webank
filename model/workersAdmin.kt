package model

import model.Authenticates
import model.Worker

abstract class WorkersAdmin(
    name: String,
    ssn: String,
    salary: Double,
    protected val password: Int
) : Worker(
    name = name,
    ssn = ssn,
    salary = salary
), Authenticates {

    override fun authenticates(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}