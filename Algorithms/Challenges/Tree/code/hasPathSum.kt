
/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
*/

fun hasPathSum(node: TreeNode?, targetSum: Int, currSum: Int = 0): Boolean {
  val root = node ?: return false
  if (root.left == null && root.right == null) return root.`val` + currSum == targetSum
  val hasLeftSum = if (root.left != null) hasPathSum(root.left!!, targetSum, currSum + root.`val`) else false
  val hasRightSum = if (root.right != null) hasPathSum(root.right!!, targetSum, currSum + root.`val`) else false 
  return hasLeftSum || hasRightSum
}
