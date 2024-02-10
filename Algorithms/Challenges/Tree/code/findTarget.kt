
/*
Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
*/

fun findTarget(root: TreeNode?, k: Int): Boolean {        
    val values = HashSet<Int>()
    fun search(node: TreeNode?): Boolean {
        if (node == null) return false
        if (k - node.`val` in values) return true
        values.add(node.`val`)
        return search(node.left) || search(node.right)
    }
    return search(root)
}