
/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
*/

fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if (root == null) return subRoot == null
    if (subRoot == null) return false
        
    return isEqual(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
}
    
private fun isEqual(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if (root == null) return subRoot == null
    if (subRoot == null) return false
    if (root.`val` != subRoot.`val`) return false
    return isEqual(root.left, subRoot.left) && isEqual(root.right, subRoot.right)
}