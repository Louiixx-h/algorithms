fun binarySearch(target: Int, list: List<Int>): Boolean {
    var low = 0
    var high = list.lastIndex

    while (low <= high) {
        val middle = (low + high) / 2
        val selectedNumber = list[middle]

        if (selectedNumber == target) {
            return true
        }

        if (selectedNumber > target) {
            high = middle - 1
            continue
        } else {
            low = middle + 1
            continue
        }
    }

    return false
}

fun main() {
    val list = listOf(2, 50, 103, 444, 2040)

    println("list $list")
    print("Choose a number: ")

    val target = readln().toInt()

    val result = binarySearch(target, list)

    println("Was the number find? $result")
}