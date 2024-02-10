
/*
Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.

Note that the root node is at depth 1.

The adding rule is:

    Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.
    cur's original left subtree should be the left subtree of the new left subtree root.
    cur's original right subtree should be the right subtree of the new right subtree root.
    If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.

*/

fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
    if (depth == 1) return TreeNode(`val`).apply { left = root }
    if (root == null) return null
    
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    
    var d = 1
    while (queue.isNotEmpty()) {
        d++
        val nextLayer = LinkedList<TreeNode>()
        
        repeat(queue.size) {
            val node = queue.poll()
            if (d == depth) {
                node.left = TreeNode(`val`).apply { left = node.left }
                node.right = TreeNode(`val`).apply { right = node.right }
            } else {
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
        }
    }
    
    return root
}