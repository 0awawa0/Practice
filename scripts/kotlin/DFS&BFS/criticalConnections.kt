
/*
There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections forming a network where connections[i] = [ai, bi] represents a connection between servers ai and bi. Any server can reach other servers directly or indirectly through the network.

A critical connection is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.
*/

fun criticalConnections(n: Int, connections: List<List<Int>>): List<List<Int>> {
    val adjList = Array<LinkedList<Int>>(n) { LinkedList() }
    val disc = IntArray(n)
    val low = IntArray(n)
    var time = 1
    val result = LinkedList<List<Int>>()
        
    for (edge in connections) {
        adjList[edge[0]].add(edge[1])
        adjList[edge[1]].add(edge[0])
    }
        
    fun dfs(currNode: Int, prevNode: Int) {
        disc[currNode] = time
        low[currNode] = time
        time++
            
        for (nextNode in adjList[currNode]) {
            if (disc[nextNode] == 0) {
                dfs(nextNode, currNode)
                low[currNode] = minOf(low[currNode], low[nextNode])
            } else 
                if (nextNode != prevNode) 
                    low[currNode] = minOf(low[currNode], disc[nextNode])
            if (low[nextNode] > disc[currNode]) result.add(listOf(currNode, nextNode))
        }
    }
        
    dfs(0, -1)
    return result
}