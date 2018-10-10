//Evaluate multiple values with 'when' an option for switch case
fun main(args: Array<String>) {

    // 1.Calculate Range : -
    val theAnswer = 90
    when (theAnswer) {
        in 1..80 -> println("Not Yet")
        in 80..90 -> println("Close Enough")
        else -> println("Definitely Not!")
    }

    // 2.Using WHEN as an expression
    val state = "UP"
    val theResponse = when (state) {
        in "UP" -> "Uttar Pradesh"
        else -> "Other than UP"
    }

    println(theResponse)

    // 3.Like switch case
    val state2 = "UK"
    when (state2) {
        in "UK" -> println("Uttarakhand")
        else -> println("Other than UK")
    }

}