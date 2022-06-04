
/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
*/

fun rightSideView(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
        
    val result = LinkedList<Int>()
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        result.add(queue.last().`val`)
        val size = queue.size
        repeat(size) {
            val node = queue.poll()
            if (node.left != null) queue.add(node.left!!)
            if (node.right != null) queue.add(node.right!!)
        }
    }
    return result
}