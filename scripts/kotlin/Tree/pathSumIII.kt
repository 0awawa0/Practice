

/*
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
*/

fun pathSum(root: TreeNode?, targetSum: Int): Int {
    val sums = HashMap<Long, Int>()
    sums[0] = 1

    var total = 0
    fun dfs(node: TreeNode?, currentSum: Long) {
        if (node == null) return
        
        var newSum = currentSum + node.`val`.toLong()
        total += sums[newSum - targetSum] ?: 0
        sums[newSum] = (sums[newSum] ?: 0) + 1
        dfs(node.left, newSum)
        dfs(node.right, newSum)
        sums[newSum] = (sums[newSum] ?: 1) - 1
    }
    
    dfs(root, 0L)
    return total
}