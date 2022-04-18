package test

import NumberFormatException

fun expressionsTest() {
    val entry: String = "1.0"

    val receivedValue: Double? = try {
        entry.toDouble()
    } catch (e: NumberFormatException) {
        println("conversion problem")
        e.printStackTrace()
        null
    }

    val valueWithTax: Double? = if (receivedValue != null) {
        receivedValue + 0.1
    } else {
        null
    }

    if (valueWithTax != null) {
        println("received value: $valueWithTax")
    } else {
        println("invalid value")
    }
}