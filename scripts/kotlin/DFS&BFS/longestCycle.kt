
/*
You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.

The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge from node i to node edges[i]. If there is no outgoing edge from node i, then edges[i] == -1.

Return the length of the longest cycle in the graph. If no cycle exists, return -1.

A cycle is a path that starts and ends at the same node.
*/

fun longestCycle(edges: IntArray): Int {
    var longestCycle = -1
    val visited = BooleanArray(edges.size)
    
    fun dfs(node: Int, visitedNodes: BooleanArray, stack: LinkedList<Int>) {
        if (node == -1) return
        
        if (visitedNodes[node]) {
            var distance = 0
            do distance++ while (stack.isNotEmpty() && stack.pop() != node)
            longestCycle = maxOf(longestCycle, distance)
            return
        }
        
        if (visited[node]) return
        
        stack.push(node)
        visitedNodes[node] = true
        visited[node] = true
        dfs(edges[node], visitedNodes, stack)
    }
    
    for (node in edges.indices) { 
        if (!visited[node]) dfs(node, BooleanArray(edges.size), LinkedList<Int>())
    }
    return longestCycle
}