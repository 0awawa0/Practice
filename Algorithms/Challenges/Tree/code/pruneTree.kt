
/*
Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

A subtree of a node node is node plus every node that is a descendant of node.
*/

fun pruneTree(root: TreeNode?): TreeNode? {
        
    fun prune(node: TreeNode?): Boolean {
        if (node == null) return false
        
        val hasLeft = prune(node.left)
        val hasRight = prune(node.right)
        if (!hasLeft) node.left = null
        if (!hasRight) node.right = null
        
        return hasLeft || hasRight || node.`val` == 1
    }
    
    if (prune(root)) return root else return null
}