

/*
You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.

The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge from node i to node edges[i]. If there is no outgoing edge from i, then edges[i] == -1.

You are also given two integers node1 and node2.

Return the index of the node that can be reached from both node1 and node2, such that the maximum between the distance from node1 to that node, and from node2 to that node is minimized. If there are multiple answers, return the node with the smallest index, and if no possible answer exists, return -1.

Note that edges may contain cycles.
*/

fun closestMeetingNode(edges: IntArray, node1: Int, node2: Int): Int {
    val visited = BooleanArray(edges.size)
    val node1Distances = IntArray(edges.size) { Int.MAX_VALUE }
    val node2Distances = IntArray(edges.size) { Int.MAX_VALUE }
    
    fun dfs(node: Int, currDistance: Int, distances: IntArray) {
        if (node == -1) return
        if (visited[node]) return
        visited[node] = true
        distances[node] = currDistance
        dfs(edges[node], currDistance + 1, distances)
    }
    
    dfs(node1, 0, node1Distances)
    
    visited.fill(false)
    dfs(node2, 0, node2Distances)
    
    var minIndex = -1
    var minValue = Int.MAX_VALUE
    for (i in edges.indices) {
        val nextValue = maxOf(node1Distances[i], node2Distances[i])
        if (minValue > nextValue) {
            minValue = nextValue
            minIndex = i
        }
    }
    
    return minIndex
}