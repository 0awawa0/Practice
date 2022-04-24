
/*
Given a reference of a node in a connected undirected graph. Return a deep copy (clone) of the graph.
Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
*/

fun cloneGraph(node: Node?): Node? {
  val visited = HashMap<Node, Node>()
  fun dfs(src: Node?): Node? {
    if (src == null) return null
    if (visited[src] != null) return visited[src]!!
            
    val newNode = Node(src.`val`)
    visited[src] = newNode
    for (node in src.neighbors) newNode.neighbors.add(dfs(node))
            
    return newNode
  }
        
  return dfs(node)
}
