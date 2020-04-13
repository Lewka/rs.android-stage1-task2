package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        val result = arrayListOf(1, 1)
        var temp: Int
        while (result[0] * result[1] < n) {
            temp = result[0] + result[1]
            result[0] = result[1]
            result[1] = temp
        }
        return if (result[0] * result[1] != n) {
            result.add(0)
            result.toIntArray()
        } else {
            result.add(1)
            result.toIntArray()
        }
    }
}
