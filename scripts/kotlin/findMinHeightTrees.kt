
/*
Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges where edges[i] = [ai, bi] indicates 
that there is an undirected edge between the two nodes ai and bi in the tree,
you can choose any node of the tree as the root. When you select a node x as the root, the result tree has height h. 
Among all possible rooted trees, those with minimum height (i.e. min(h))  are called minimum height trees (MHTs).
Return a list of all MHTs' root labels. You can return the answer in any order.
*/
fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
  if (n == 1) return listOf(0)
        
  val neighbors = Array<MutableSet<Int>>(n) { HashSet<Int>() }
        
  for (edge in edges) {
    neighbors[edge[0]].add(edge[1])
    neighbors[edge[1]].add(edge[0])
  }
        
  var leaves = ArrayList<Int>()
  for (i in 0 until n) {
    if (neighbors[i].size == 1) leaves.add(i)
  }
        
  var nodesLeft = n
  while (nodesLeft > 2) {
    nodesLeft -= leaves.size
            
    val newLeaves = ArrayList<Int>()
    for (leaf in leaves) {
      val neighbor = neighbors[leaf].first()
      neighbors[neighbor].remove(leaf)
                
      if (neighbors[neighbor].size == 1) newLeaves.add(neighbor)
    }
            
    leaves = newLeaves
  }
        
  return leaves
}
