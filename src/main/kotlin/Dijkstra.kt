import java.util.PriorityQueue

private class Node(
    val name: String,
    var cost: Int = Int.MAX_VALUE,
    var edges: MutableMap<Node, Int> = mutableMapOf()
) : Comparable<Node> {
    override fun compareTo(other: Node): Int = this.cost - other.cost
}

private fun printPath(destination: Node, predecessors: Map<Node, Node?>) {
    var pathNode: Node? = destination
    val path = mutableListOf<String>()
    while (pathNode != null) {
        path.add(pathNode.name)
        pathNode = predecessors[pathNode]
    }
    println("Shortest path: ${path.reversed().joinToString(" -> ")}")
}

fun main() {
    val a = Node("a", 0)
    val b = Node("b")
    val c = Node("c")
    val d = Node("d")
    val e = Node("e")

    a.edges = mutableMapOf(b to 6, c to 2, d to 3)
    b.edges = mutableMapOf(c to 3, e to 5)
    c.edges = mutableMapOf(e to 1)
    d.edges = mutableMapOf(b to 1, e to 1)

    val nodes = listOf(a, b, c, d, e)

    val predecessors = mutableMapOf<Node, Node?>()
    val closedNodes = mutableSetOf<Node>()
    val openedNodes = PriorityQueue<Node>()
    openedNodes.add(a)

    while (openedNodes.isNotEmpty()) {
        val node = openedNodes.poll()
        if (closedNodes.contains(node)) {
            continue
        }
        closedNodes.add(node)
        node.edges.forEach { (neighbor, edgeCost) ->
            val calculatedCost = node.cost + edgeCost
            if (calculatedCost < neighbor.cost) {
                neighbor.cost = calculatedCost
                openedNodes.add(neighbor)
                predecessors[neighbor] = node
            }
        }
    }

    nodes.forEach { node ->
        println("${node.name}: ${node.cost}")
    }

    printPath(e, predecessors)
}
