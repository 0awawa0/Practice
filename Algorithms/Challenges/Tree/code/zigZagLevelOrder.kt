
/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
*/

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()
        
    val queue = LinkedList<TreeNode>()
    queue.add(root)
        
    val result = LinkedList<List<Int>>()
        
    var isRtl = false
    while (queue.isNotEmpty()) {
        val size = queue.size
        val list = LinkedList<Int>()
        repeat(size) {
            val node = queue.poll()
            if (node.left != null) queue.add(node.left!!)
            if (node.right != null) queue.add(node.right!!)
            if (isRtl) list.addFirst(node.`val`)
            else list.add(node.`val`)
        }
        result.add(list)
        isRtl = !isRtl
    }
    return result
}