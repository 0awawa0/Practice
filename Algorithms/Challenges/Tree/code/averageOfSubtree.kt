
/*
Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.

Note:

    The average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
    A subtree of root is a tree consisting of root and all of its descendants.

*/

fun averageOfSubtree(root: TreeNode?): Int {
    var count = 0
    fun search(node: TreeNode?, currCount: Int, currSum: Int): Pair<Int, Int> {
        if (node == null) return Pair(currCount, currSum)
        val left = search(node.left, currCount, currSum)
        var right = search(node.right, currCount, currSum)
        val totalCount = left.first + right.first + 1
        val totalSum = left.second + right.second + node.`val`
        val avg = totalSum / totalCount
        if (node.`val` == avg) count++
        return Pair(totalCount, totalSum)
    }
        
    search(root, 0, 0)
    return count
}