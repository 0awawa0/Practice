
/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
*/

fun averageOfLevels(root: TreeNode?): DoubleArray {
    val result = LinkedList<Double>()
    val queue = LinkedList<TreeNode>()
    queue.add(root!!)
        
    while (queue.isNotEmpty()) {
        val size = queue.size
        var currSum = 0.0
        repeat(size) {
            val node = queue.poll()
            currSum += node.`val`.toDouble()
            if (node.left != null) queue.add(node.left!!)
            if (node.right != null) queue.add(node.right!!)
        }
            
        result.add(currSum / size)
    }
        
    return result.toDoubleArray()
}