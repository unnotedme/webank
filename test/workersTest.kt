package test

import model.Analyst
import model.Director
import model.CalculatorBonus
import model.Manager

fun workersTest() {
    val luke = Analyst(
        name = "Luke",
        ssn = "111.111.111-11",
        salary = 1000.0
    )

    println("name ${luke.name}")
    println("ssn ${luke.ssn}")
    println("salary ${luke.salary}")
    println("bonus ${luke.bonus}")

    val sam = Manager(
        name = "Sam",
        ssn = "222.222.222-22",
        salary = 2000.0,
        password = 1234
    )

    println("name ${sam.name}")
    println("ssn ${sam.ssn}")
    println("salary ${sam.salary}")
    println("bonus ${sam.bonus}")

    if (sam.authenticates(1234)) {
        println("sucess authentication")
    } else {
        println("failed authentication")
    }

    val kyle = Director(
        name = "Kyle",
        ssn = "333.333.333-33",
        salary = 4000.0,
        password = 4000,
        psp = 200.0
    )

    println("name ${kyle.name}")
    println("ssn ${kyle.ssn}")
    println("salary ${kyle.salary}")
    println("bonus ${kyle.bonus}")
    println("psp ${kyle.psp}")

    if (kyle.authenticates(4000)) {
        println("sucess authentication")
    } else {
        println("failed authentication")
    }

    val mary = Analyst(
        name = "Mary",
        ssn = "444.444.444-44",
        salary = 3000.0
    )

    val calculator = CalculatorBonus()
    calculator.register(luke)
    calculator.register(sam)
    calculator.register(kyle)
    calculator.register(mary)

    println("bonus total: ${calculator.total}")
}