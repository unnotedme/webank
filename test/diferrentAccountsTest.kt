package test

import model.SavingsAccount
import model.CheckingAccount
import model.Client
import model.Address

fun differentAccountsTest() {
    val checkingAccount = CheckingAccount(
        holder = "Luke",
        accountNumber = 1000
        address = Address(
            street = "Maple Street"
        )
    )

    println("holder address ${checkingAccount.holder}")
    val savingsAccount = SavingsAccount(
        holder = "Sam",
        accountNumber = 1001
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("balance from checkings account : ${checkingAccount.balance}")
    println("balance from savings account: ${savingsAccount.balance}")

    checkingAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("balance after withdraw checking account: ${checkingAccount.balance}")
    println("balance after withdraw savings account: ${savingsAccount.balance}")

    checkingAccount.transfere(100.0, savingsAccount)

    println("balance checking account after transfer to savings account: ${checkingAccount.balance}")
    println("balance savings account after receiving transfer: ${savingsAccount.balance}")

    savingsAccount.transfere(200.0, checkingAccount)

    println("balance savings account after transfer to checking account: ${savingsAccount.balance}")
    println("balance checking account after receiving transfer: ${checkingAccount.balance}")
}