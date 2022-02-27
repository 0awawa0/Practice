
/*
Given the root of a binary tree, return the maximum width of the given tree.

The maximum width of a tree is the maximum width among all levels.

The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.
*/

fun widthOfBinaryTree(root: TreeNode?): Int {
  if (root == null) return 0
        
  val queue = LinkedList<Pair<TreeNode, Int>>()
  queue.add(Pair(root, 0))
        
  var maxWidth = 0  
  while (queue.isNotEmpty()) {
    maxWidth = maxOf(maxWidth, queue.last.second - queue.first.second + 1)
    val queueSize = queue.size
            
    for (i in queueSize - 1 downTo 0) {
      val nextNode = queue.poll()
                
      if (nextNode.first.left != null) queue.add(Pair(nextNode.first.left!!, nextNode.second * 2 + 1))
      if (nextNode.first.right != null) queue.add(Pair(nextNode.first.right!!, nextNode.second * 2 + 2))
    }
  }
        
  return maxWidth
}
