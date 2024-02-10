

/*
There is an undirected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.

You are given a 2D integer array edges of length n - 1 where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree. You are also given an integer array restricted which represents restricted nodes.

Return the maximum number of nodes you can reach from node 0 without visiting a restricted node.

Note that node 0 will not be a restricted node.
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