fun quickSort(list: MutableList<Int>) {
    if (list.size < 2) {
        return
    }

    val pivot = list[list.size / 2]
    val less = mutableListOf<Int>()
    val greater = mutableListOf<Int>()

    for (element in list) {
        if (element < pivot) {
            less.add(element)
        } else if (element > pivot) {
            greater.add(element)
        }
    }

    quickSort(less)
    quickSort(greater)

    list.clear()
    list.addAll(less)
    list.add(pivot)
    list.addAll(greater)
}

fun main() {
    val list = mutableListOf(103, 50, 2040, 444, 2)

    println("before $list")

    quickSort(list)

    println("after $list")
}