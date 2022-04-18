package model

interface Authenticates {

    fun authenticates(password: Int): Boolean

}