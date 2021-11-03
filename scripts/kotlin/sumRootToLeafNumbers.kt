
/*
You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

    For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.

Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.
*/


fun sumNumbers(root: TreeNode?): Int {
  return dfs(root, 0)
}
    
private fun dfs(node: TreeNode?, currNumber: Int): Int {
  if (node == null) return 0
        
  val left = dfs(node.left, currNumber * 10 + node.`val`)
  val right = dfs(node.right, currNumber * 10 + node.`val`)
        
  if (left == 0 && right == 0) return currNumber * 10 + node.`val`
  else return left + right
}
