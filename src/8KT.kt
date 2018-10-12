//Fixed size collections
fun main(args: Array<String>) {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    for (array in array1) {
        println(array)
    }

    val nullsArray = arrayOfNulls<String>(3)
    for (array in nullsArray) {
        println(array)
    }

    //You can perform operation like sort(), sortArrayDescending()
}