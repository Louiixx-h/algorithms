fun bubbleSort(list: MutableList<Int>) {
    val size = list.size

    for (i in 0 until size) {
        for (j in 0 until size - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
}

fun main() {
    val list = mutableListOf(103, 50, 2040, 444, 2)

    println("before $list")

    bubbleSort(list)

    println("after $list")
}
