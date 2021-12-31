
/*
Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
*/

fun maxAncestorDiff(root: TreeNode?): Int { return traverse(root, 0, Int.MAX_VALUE) }
    
private fun traverse(root: TreeNode?, currMax: Int, currMin: Int): Int {
  if (root == null) return currMax - currMin
        
  val newMax = maxOf(root.`val`, currMax)
  val newMin = minOf(root.`val`, currMin)
        
  val result = maxOf(traverse(root.left, newMax, newMin), traverse(root.right, newMax, newMin))
  return result
}
