

/*
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
*/

fun increasingBST(root: TreeNode?): TreeNode? {
        
    val newRoot = TreeNode(0)
    var currNode: TreeNode? = newRoot
        
    fun traverse(node: TreeNode?) {
        if (node == null) return
            
        traverse(node.left)
            
        node.left = null
        currNode?.right = node
        currNode = node
            
        traverse(node.right)
    }
        
    traverse(root)
    
    return newRoot.right
}