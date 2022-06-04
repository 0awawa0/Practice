
/*
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
*/

fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
    val result = LinkedList<List<Int>>()
    fun dfs(node: TreeNode?, currList: List<Int>, currSum: Int) {
        if (node == null) return
            
        if (node.left == null && node.right == null) {
            if (currSum + node.`val` == targetSum) result.add(currList + node.`val`)
        } else {
            val newSum = currSum + node.`val`
            val newList = currList + node.`val`
            dfs(node.left, newList, newSum)
            dfs(node.right, newList, newSum)
        }
    }
        
    dfs(root, emptyList(), 0)
    return result
}