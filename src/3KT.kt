//Manage null values
fun main(args: Array<String>) {
    val nullValue: String? = null
    println("String :: $nullValue")
    val l: Int? = nullValue?.length
    println("Length :: $l")

    // 1.You can even check for null
    if (l == null) {
        println("Length is null")
    } else {
        println("Length is $l")
    }

    // 2.Using the Elvis Operator you can even remove the null thing from terminal
    val l2 = l ?: -1
    println(l2)


    // 3.If you really want NullPointerException to trigger then use assertion operator : -
    //By executing below code we will get 'kotlin.KotlinNullPointerException'
//    val l3 = l!!
//    println(l3)


    //We can handle it by try catch expression
    try {
        val l3 = l!!
        println("Length = $l3")
    } catch (e: KotlinNullPointerException) {
        println("Length is null")
    }

}