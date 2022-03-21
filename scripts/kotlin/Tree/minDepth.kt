
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
*/

fun minDepth(root: TreeNode?): Int {
  val root = root ?: return 0
  return minDepth(root, 1)
}
    
private fun minDepth(node: TreeNode, currDepth: Int): Int {
  if (node.left == null && node.right == null) return currDepth
  val leftDepth = if (node.left == null) Int.MAX_VALUE else minDepth(node.left!!, currDepth + 1)
  val rightDepth = if (node.right == null) Int.MAX_VALUE else minDepth(node.right!!, currDepth + 1)
  return minOf(leftDepth, rightDepth)
}
