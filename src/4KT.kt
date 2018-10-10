//Iterate through collection of data
fun main(args: Array<String>) {
    val colors = arrayOf("Red", "Green", "Blue")
    val oddNumbers = intArrayOf(1, 3, 5, 7, 9)

    // 1.Same as java foreach loop..'in' replaces ':'
    for (color in colors) {
        println(color)
    }

    // 2.For loop with indices, you can even skip elements using step
    for (i in oddNumbers.indices step 2) {
        println(oddNumbers[i])
    }

    // 3.Using range
    for (i in 0..colors.size - 1) {
        println(colors[i])
    }

    // 4.In the above you can remove '-1' by using until
    for (i in 0 until colors.size) {
        println(colors[i])
    }

}