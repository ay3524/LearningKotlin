//Kotlin List,Set,Map example
fun main(args: Array<String>) {

    //===== LIST =====
    //There are two types of List i.e. Immutable and Mutable List.
    //1.Immutable List
    val alphaList = listOf("Z", "Y", "X")
    println(alphaList)
    println("Size of list : ${alphaList.size}")
    println(alphaList::class.simpleName)

    //2.Mutable List
    val alphaList2 = mutableListOf<String>()
    alphaList2.add("Z")
    alphaList2.add("Y")
    alphaList2.add("X")
    println(alphaList2)
    alphaList2.sort()
    println(alphaList2)
    alphaList2.sortDescending()
    println(alphaList2)

    //===== SET =====
    //Set don't contain duplicate items
    val set1 = mutableSetOf("A", "B", "B")
    println(set1)

    //===== MAP =====
    //1.Immutable
    val map = mapOf(
            Pair(1, "A"),
            Pair(2, "B"),
            Pair(3, "C")

    )

    //2.Mutable
    val map1 = mutableMapOf<Int, String>()
    map1.put(1, "A")
    map1.put(2, "B")
    map1.put(3, "C")
}