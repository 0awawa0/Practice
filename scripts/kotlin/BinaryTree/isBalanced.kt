/*
Given a binary tree, determine if it is height-balanced.

A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
*/

fun isBalanced(root: TreeNode?): Boolean {
  return isBalanced(root, 0).first
}
    
private fun isBalanced(node: TreeNode?, currDepth: Int): Pair<Boolean, Int> {
  if (node == null) return Pair(true, currDepth)
        
  val (leftBalanced, leftDepth) = isBalanced(node.left, currDepth + 1)
  val (rightBalanced, rightDepth) = isBalanced(node.right, currDepth + 1)
  val isBalanced = rightBalanced && leftBalanced && (leftDepth - rightDepth in -1..1)
  val maxDepth = maxOf(leftDepth, rightDepth)
  
  return Pair(isBalanced, maxDepth)
}
