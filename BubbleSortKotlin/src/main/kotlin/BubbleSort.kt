fun main(args: Array<String>) {
    val array = intArrayOf(19, 31, 52, 115, 12, 99)
    bubbleSort(array)
    for (num in array) {
        print("$num ")
    }
}

fun bubbleSort(array: IntArray) {
       val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                   val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

}