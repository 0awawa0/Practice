
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
*/

   1
  / \  => [2, 1, 3]
 2   3

fun inorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) return ArrayList<Int>()
        
    val result = ArrayList<Int>()
        
    result.addAll(inorderTraversal(root.left))
    result.add(root.`val`)
    result.addAll(inorderTraversal(root.right))
        
    return result
}
