import kotlin.NumberFormatException
import kotlin.system.exitProcess

//Calculator program in Kotlin
fun main(args: Array<String>) {
    val number1: Double
    val number2: Double
    println("Enter 1st number")
    val string1: String? = readLine()

    try {
        number1 = string1!!.toDouble()
    } catch (e: NumberFormatException) {
        println("Enter Numbers only")
        exitProcess(0)
    }

    println("Enter 2nd number")
    val string2: String? = readLine()

    try {
        number2 = string2!!.toDouble()
    } catch (e: NumberFormatException) {
        println("Enter Numbers only")
        exitProcess(0)
    }

    println("Enter operation i.e(+, -, *, /)")
    val string3: String? = readLine()

    when (string3) {
        "+" -> println("Addition : ${number1 + number2}")
        "-" -> println("Substraction : ${number1 - number2}")
        "*" -> println("Mulitplication : ${number1 * number2}")
        "/" -> {
            println("Divide : ${number1 / number2}")
        }
        else -> {
            println("Operator not supported only (+, -, *, /) are supported")
        }
    }
}