

/*
Given a directed acyclic graph, with n vertices numbered from 0 to n-1, and an array edges where edges[i] = [fromi, toi] represents a directed edge from node fromi to node toi.

Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists.

Notice that you can return the vertices in any order.
*/

fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
    val counts = IntArray(n)
    for (e in edges) counts[e[1]]++
        
    val result = LinkedList<Int>()
    for (i in counts.indices) if (counts[i] == 0) result.add(i)
    return result
}