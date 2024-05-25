fun getSmallest(list: List<Int>): Int {
    var smallestItem = list[0]
    var smallestIndex = 0

    for ((index, item) in list.withIndex()) {
        if (item < smallestItem) {
            smallestItem = item
            smallestIndex = index
        }
    }

    return smallestIndex
}

fun selectionSort(list: MutableList<Int>): List<Int> {
    val newList = mutableListOf<Int>()

    for (item in list.indices) {
        val smallestIndex = getSmallest(list)
        newList.add(list.removeAt(smallestIndex))
    }

    return newList
}

fun main() {
    val list = listOf(103, 50, 2040, 444, 2)

    println("before $list")

    val result = selectionSort(list.toMutableList())

    println("after $result")
}