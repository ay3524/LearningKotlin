class MethodUtils {

    var runningTotal: Double = 0.0

    fun addValue(value: Double) {
        runningTotal += value
    }

    //This is something like a static function in java
    companion object {
        fun addNumbers(a: Int, b: Int) = a + b
    }
}