package test

fun tiesTest() {
    var i = 0
    while (i < 5) {
        val holder: String = "Luke $i"
        val accountNumber: Int = 1000 + i
        var balance = i + 10.0

        println("holder: $holder")
        println("number of the acount: $accountNumber")
        println("balance of the acount: $balance")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val holder: String = "Luke $i"
        val accountNumber: Int = 1000 + i
        var balance = i + 10.0

        println("holder: $holder")
        println("number of the acount: $accountNumber")
        println("balance of the acount: $balance")
        println()
    }
} 