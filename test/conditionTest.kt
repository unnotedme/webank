package test

fun conditionTest(balance : Double) {
    when {
        balance > 0.0 -> println("postive account")
        balance == 0.0 -> println("neutral account")
        else -> println("negative account") 
    }