package test

import model.Analyst
import model.Director
import model.CalculatorBonus
import model.Manager

fun authenticationTest() {
    val manager = Manager(
        name = "Luke",
        ssn = "111.111.111-11",
        salary = 1000.0,
        password = 1000
    )
    val diretora = Director(
        name = "Sam",
        ssn = "222.222.222-22",
        salary = 2000.0,
        password = 2000,
        psp = 200.0
    )
    val client = Client(
        name = "Kyle",
        ssn = "333.333.333-33",
        password = 1234
    )

    val system = InternSystem()
    system.welcome(manager, 1000)
    system.welcome(director, 2000)
    system.welcome(client, 1234)
}