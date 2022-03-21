
/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
*/

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
  if (root == null) return null
        
  var lca: TreeNode? = null
  fun dfs(currNode: TreeNode): Boolean {
            
    val isCurrNode = currNode == p || currNode == q
    val leftRes = if (currNode.left != null) dfs(currNode.left!!) else false
    val rightRes = if (currNode.right != null) dfs(currNode.right!!) else false
            
    if (isCurrNode && (leftRes || rightRes) || (leftRes && rightRes)) {
      if (lca == null) lca = currNode
    }
            
    return isCurrNode || leftRes || rightRes
  }
        
  dfs(root)
  return lca
}
