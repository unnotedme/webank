package test

import model.SavingsAccount
import model.CheckingAccount
import exception.InsufficientBalanceException

fun accountBehaviorTest() {
    val accountLuke = Account(holder = "Luke", accountNumber = 1000)
    accountLuke.deposit(200.0)

    val accountCassie = Conta(accountNumber = 1001, holder = "Fran")
    accountCassie.deposit(300.0)

    println(accountCassie.holder)
    println(accountCassie.accountNumber)
    println(accountCassie.balance)

    println(accountLuke.holder)
    println(accountLuke.accountNumber)
    println(accountLuke.balance)

    println("deposit in Luke's account")
    accountLuke.deposit(50.0)
    println(accountLuke.balance)

    println("deposit in Cassie's account")
    accountCassie.deposit(70.0)
    println(accountCassie.balance)

    println("withdraw from Luke's account")
    accountLuke.withdraw(250.0)
    println(accountLuke.balance)

    println("withdraw from Cassie's account")
    accountCassie.withdraw(100.0)
    println(accountCassie.balance)

    println("excess withdraw from Luke's account")
    accountLuke.withdraw(100.0)
    println(accountLuke.balance)

    println("excess withdraw from Cassie's account")
    accountCassie.withdraw(500.0)
    println(accountCassie.balance)

    println("transfer from Cassie to Luke")

    try {
        accountCassie.transfer(destiny = accountLuke, value = 250.0, senha = 2)
        println("successful transfer")
    } catch (e: InsufficientBalanceException){
        println("transfer failed")
        println("insuffcient balance")
        e.printStackTrace()
    } catch (e: AutheticationFailException){
        println("transfer failed")
        println("authentication failed")
        e.printStackTrace()
    } catch (e: Exception){
        println("unknown error")
        e.printStackTrace()
    }

    println(accountLuke.balance)
    println(accountCassie.balance)
} 