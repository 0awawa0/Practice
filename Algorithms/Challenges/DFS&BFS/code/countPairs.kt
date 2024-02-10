
/*
You are given an integer n. There is an undirected graph with n nodes, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting nodes ai and bi.

Return the number of pairs of different nodes that are unreachable from each other.
*/

fun countPairs(n: Int, edges: Array<IntArray>): Long {

    // Create adjacency list for each node
    val adj = ArrayList<MutableList<Int>>()
    repeat(n) { adj.add(ArrayList<Int>())}
    for (edge in edges) {
        adj[edge[0]].add(edge[1])
        adj[edge[1]].add(edge[0])
    }
    
    // Count of ways to connect two different nodes (i.e. count of pairs if no nodes are connected with each other)
    var totalCount = n.toLong() * (n - 1).toLong() / 2L
    val visited = BooleanArray(n)
    
    // Traverses connected component and returns number of nodes in it
    fun dfs(node: Int): Long {
        visited[node] = true
        var count = 1L
        for (child in adj[node]) {
            if (!visited[child]) count += dfs(child)
        }
        return count
    }
    
    // If node has not been traversed yet, traverse its component
    for (node in 0 .. n - 1) {
        if (visited[node]) continue
        val currCount = dfs(node)

        // We must remove number of pairs in the connected component
        totalCount -= (currCount * (currCount - 1) / 2L)
    }
    
    // Return what's left
    return totalCount
}