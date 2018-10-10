//Using methods from other classes and making objects
fun main(args: Array<String>) {
    val number1 = 1
    val number2 = 2

    //This is how to use static like methods
    MethodUtils.addNumbers(number1, number2)

    //This is how an object is created
    val methodUtils = MethodUtils()

}