package model

import model.Authenticates

class InternSystem {

    fun welcome(admin: Authenticates, password: Int){
        if(admin.authenticates(password)){
            println("welcome to WeBank")
        } else {
            println("failed authentication")
        }
    }

}