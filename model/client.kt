package model

import model.Authenticates

class Client(
    val name: String,
    val ssn: String,
    var address: Address = Address(),
    private val password: Int
) : Authenticates {

    override fun authenticates(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }

}