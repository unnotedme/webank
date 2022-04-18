package test

import model.SavingsAccount
import model.CheckingAccount

fun copyAndReferencesTest() {
    val accountNumberX = 10
    var accountNumberY = accountNumberX
    accountNumberY++

    println("accountNumberX $accountNumberX")
    println("accountNumberY $accountNumberY")

    val lukeAccount = Account("Luke", 1002)
    lukeAccount.holder = "Luke"
    var maryAccount = Account("Mary", 1003)
    maryAccount.holder = "Mary"
    lukeAccount.holder = "Luke"

    println("Luke's holder account: ${lukeAccount.holder}")
    println("Mary's holder account: ${maryAccount.holder}")

    println(lukeAccount)
    println(maryAccount)