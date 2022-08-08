

/*

*/

fun reachableNodes(n: Int, edges: Array<IntArray>, restricted: IntArray): Int {
    val restrictedSet = restricted.toSet()
    val adjacencyLists = Array<MutableList<Int>>(n) { ArrayList<Int>() }
    val visited = BooleanArray(n)
    
    for (edge in edges) {
        adjacencyLists[edge[0]].add(edge[1])
        adjacencyLists[edge[1]].add(edge[0])
    }
    
    fun dfs(currNode: Int): Int {
        if (currNode in restrictedSet) return 0
        if (visited[currNode]) return 0
        visited[currNode] = true
        var count = 1
        for (node in adjacencyLists[currNode]) count += dfs(node)
        return count
    }
    
    return dfs(0)
}