import java.text.NumberFormat

fun main(args: Array<String>) {

    //This is how we will create objects in kotlin, without 'new' keyword
    val dataClass = DataClass("Shirt", "Large", 34.78)
    println(dataClass)

    val dataClass1 = DataClass("Large", 34.78)
    println(dataClass1)

    //TODO If you have something in java which you really cannot achieve with kotlin
    //Below is that example where you need Locale then you can use java classes too
    val formatter = NumberFormat.getCurrencyInstance()

    dataClass1.price = 10.0
    println("New Price : ${formatter.format(dataClass1.price)}")
    println("Type of cloth : ${dataClass1.type}")
}