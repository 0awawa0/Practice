
/*
You are given a directed graph with n nodes labeled from 0 to n - 1, where each node has exactly one outgoing edge.

The graph is represented by a given 0-indexed integer array edges of length n, where edges[i] indicates that there is a directed edge from node i to node edges[i].

The edge score of a node i is defined as the sum of the labels of all the nodes that have an edge pointing to i.

Return the node with the highest edge score. If multiple nodes have the same edge score, return the node with the smallest index.
*/

fun edgeScore(edges: IntArray): Int {
    val inSum = LongArray(edges.size)
    for (node in edges.indices) inSum[edges[node]] += node.toLong()
    var maxIndex = 0
    var maxValue = inSum[0]
    for (i in 1 until inSum.size) {
        if (inSum[i] > maxValue) {
            maxValue = inSum[i]
            maxIndex = i
        }
    }
    return maxIndex
}