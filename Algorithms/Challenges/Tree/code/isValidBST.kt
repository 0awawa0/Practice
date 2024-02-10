
/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.

*/

fun isValidBST(
    root: TreeNode?, 
    minValue: Long = Int.MIN_VALUE.toLong() - 1L,
    maxValue: Long = Int.MAX_VALUE.toLong() + 1L
): Boolean {
    if (root == null) return true
    val currValue = root.`val`.toLong()
    if (currValue <= minValue || currValue >= maxValue) return false
        
    return isValidBST(root.left, minValue, currValue) && isValidBST(root.right, currValue, maxValue)
}