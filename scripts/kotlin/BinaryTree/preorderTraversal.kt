
/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.
*/

    1
   / \   => [1, 2, 3]
  2   3
  
fun preorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) return ArrayList<Int>()
        
    val result = ArrayList<Int>()
        
    result.add(root.`val`)
    result.addAll(preorderTraversal(root.left))
    result.addAll(preorderTraversal(root.right))
        
    return result
}
