
/*
Given the root of a binary tree, flatten the tree into a "linked list":

    The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
    The "linked list" should be in the same order as a pre-order traversal of the binary tree.

*/

fun flatten(root: TreeNode?): Unit {
    if (root == null) return
    
    flatten(root.left)
    flatten(root.right)
    
    if (root.left != null) {
        var currLeft = root.left
        while (currLeft.right != null) currLeft = currLeft.right
        currLeft.right = root.right
        root.right = root.left
        root.left = null
    }
}