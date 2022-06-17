
/*
You are given the root of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.

Return the minimum number of cameras needed to monitor all nodes of the tree.
*/

fun minCameraCover(root: TreeNode?): Int {
        
    fun traverse(node: TreeNode?): Triple<Int, Int, Int> {
        if (node == null) return Triple(0, 0, 1000)
        
        val leftResult = traverse(node.left)
        val rightResult = traverse(node.right)
        
        val leftMin = minOf(leftResult.second, leftResult.third)
        val rightMin = minOf(rightResult.second, rightResult.third)
        
        // Cameras placed in children's children
        val first = leftResult.second + rightResult.second
        
        // Camera placed in one of the children
        val second = minOf(leftResult.third + rightMin, rightResult.third + leftMin)
        
        // Camera placed in this node
        val third = 1 + minOf(leftResult.first, leftMin) + minOf(rightResult.first, rightMin)
        return Triple(first, second, third)
    }
    
    val result = traverse(root)
    return minOf(result.second, result.third)
}