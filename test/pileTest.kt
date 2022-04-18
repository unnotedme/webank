package test

import exception.InsufficientBalanceException

fun function1() {
    println("start function1")
    try {
        function2()
    } catch (e: InsufficientBalanceException) {
        e.printStackTrace()
        println("InsufficientBalanceException started")
    }
    println("end function1")
}

fun function2() {
    println("start function2")
    for (i in 1..5) {
        println(i)
        throw InsufficientBalanceException()
    }
    println("end function2")
}