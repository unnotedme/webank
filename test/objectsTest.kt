package test

import model.*

fun objectsTest() {
    val sam = object : Authenticates {
        val name: String = "Sam"
        val ssn: String = "111.111.111-11"
        val password: Int = 1000

        override fun authenticates(password: Int) = this.password == password
    }
    val internSystem = internSystem()
    internSystem.enter(sam, 1000)
    println("client's name: ${sam.name}")

    val luke = Cliente(name = "Luke", ssn = "", password = 1)
    val savingsAccount = SavingsAccount(titular = luke, accountNumber = 1000)
    val checkingAccount = CheckingAccount(titular = luke, accountNumber = 1001)

    println("account's total: ${Account.total}")
}