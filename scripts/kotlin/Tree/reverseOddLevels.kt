
/*
Given the root of a perfect binary tree, reverse the node values at each odd level of the tree.

    For example, suppose the node values at level 3 are [2,1,3,4,7,11,29,18], then it should become [18,29,11,7,4,3,1,2].

Return the root of the reversed tree.

A binary tree is perfect if all parent nodes have two children and all leaves are on the same level.

The level of a node is the number of edges along the path between it and the root node.
*/

fun reverseOddLevels(root: TreeNode?): TreeNode? {
    if (root == null) return null
    
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    
    var isOdd = false
    while (queue.isNotEmpty()) {
        val children = LinkedList<TreeNode>()
        for (node in queue) {
            if (node.left == null) return root
            if (!isOdd) {
                children.add(node.left!!)
                children.add(node.right!!)
            } else {
                children.add(node.right!!)
                children.add(node.left!!)
            }
            
        }
        children.reverse()
        
        repeat(queue.size) {
            val node = queue.poll()
            val leftChild = children.poll()
            val rightChild = children.poll()
            node.left = leftChild
            node.right = rightChild
            queue.add(leftChild)
            queue.add(rightChild)
        }
        isOdd = !isOdd
    }
    return root
}