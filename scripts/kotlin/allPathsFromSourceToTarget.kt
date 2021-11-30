/*
Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
*/

fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        
  val result = ArrayList<List<Int>>()
  fun dfs(currNode: Int, currList: List<Int>) {
    if (currNode == graph.size - 1) result.add(currList + currNode)
    for (i in graph[currNode]) dfs(i, currList + currNode)
  }
        
  dfs(0, emptyList())
  return result
}
