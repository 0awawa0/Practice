
/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.

    1
   / \  => [2, 3, 1]
  2   3
*/

fun postorderTraversal(root: TreeNode?): List<Int> {
        
    val result = ArrayList<Int>()
    if (root == null) return result
        
    result.addAll(postorderTraversal(root.left))
    result.addAll(postorderTraversal(root.right))
    result.add(root.`val`)
        
    return result
}
