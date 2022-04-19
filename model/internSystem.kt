package model

import model.Authenticates

class InternSystem {

    fun welcome(admin: Authenticates, password: Int, authenticates: () -> Unit = ()){
        if(admin.authenticates(password)){
            println("welcome to WeBank")
            authenticates()
        } else {
            println("failed authentication")
        }
    }

    fun receiverEnter(admin: Authenticates, password: Int, authenticates: InternSystem.() -> Unit = {}){
        if(admin.authenticates(password)){
            println("welcome to WeBank")
            authenticates()
        } else {
            println("failed authentication")
        }
        }

        fun payment(){
            println("making payment")
        }
    }

