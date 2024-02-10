
/*
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
*/

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null
    if (root.`val` == `val`) return root
    if (root.`val` > `val`) return searchBST(root.left, `val`)
    return searchBST(root.right, `val`)
}