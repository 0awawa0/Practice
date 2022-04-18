
/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
*/

fun kthSmallest(root: TreeNode?, k: Int): Int {
    val stack = LinkedList<TreeNode?>()
    var node = root
    var counter = k
    while (true) {
        while (node != null) {
            stack.push(node)
            node = node?.left
        }
            
        node = stack.pop()
        if (--counter == 0) return node!!.`val`
        node = node?.right
    }
}