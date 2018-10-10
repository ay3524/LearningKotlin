//Using enum classes
fun main(args: Array<String>) {

    val operator = "+"

    val operation: String = when (operator) {
        EnumClass.ADD.operator -> "Addition"
        EnumClass.SUBSTRACT.operator -> "Substraction"
        EnumClass.MULTIPLY.operator -> "Multiply"
        EnumClass.DIVIDE.operator -> "Divide"
        else -> "Other"
    }

    println(operation)

}