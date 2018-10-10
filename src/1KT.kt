fun main(args: Array<String>) {

    //====Input through Keyboard====
//    println("Enter a String")
//    val state = readLine()
//    println("You have entered $state")

    println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(calculate(param1 = 12.0, param2 = 13.0))
}

fun calculate(param1: Double, param2: Double, op: String = "+"): Double {
    return if (op.equals(Constants.ADD_OP)) {
        param1 + param2
    } else if (op.equals(Constants.SUB_OP)) {
        param1 - param2
    } else {
        -1.0
    }
}

fun add(vararg listOfNumbers: Int): Int {
    var result = 0
    for (i in listOfNumbers) {
        result += listOfNumbers[i - 1]
        // OR you can use 'i' only
//        result += i
    }
    return result
}