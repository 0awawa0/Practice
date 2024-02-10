
/*
Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
Return the number of good nodes in the binary tree.

Example 1:
Input:
      3
     / \
    1   4
   /   /  \
  3   1    5
  
Output: 4

Example 2:
Input:
      3
     /
    3
   / \
  4   2
  
Output: 3

Example 3:
Input:
      3
      
Output: 1
*/


fun goodNodes(node: TreeNode?, currMax: Int = Int.MIN_VALUE): Int {
    if (node == null) return 0
    if (node.`val` >= currMax) 
        return 1 + innerGoodNodes(node.left, node.`val`) + innerGoodNodes(node.right, node.`val`)
    else 
        return innerGoodNodes(node.left, currMax) + innerGoodNodes(node.right, currMax)
}
