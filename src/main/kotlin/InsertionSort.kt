fun insertionSort(list: MutableList<Int>) {
    val size = list.size

    for (i in 1 until size) {
        val current = list[i]
        var j = i - 1

        while (j >= 0 && list[j] > current) {
            list[j + 1] = list[j]
            j--
        }

        list[j + 1] = current
    }
}

fun main() {
    val list = mutableListOf(103, 50, 2040, 444, 2)

    println("before $list")

    insertionSort(list)

    println("after $list")
}