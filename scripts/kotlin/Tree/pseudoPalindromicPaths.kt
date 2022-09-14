
/*
Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.

Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
*/

fun pseudoPalindromicPaths (root: TreeNode?): Int {
    var total = 0
    val freqs = IntArray(10)
    fun dfs(node: TreeNode?) {
        if (node == null) return
        freqs[node.`val`]++
        if (node.left == null && node.right == null) if (isPalindrome(freqs)) total++
        
        dfs(node.left)
        dfs(node.right)
        freqs[node.`val`]--
    }
    
    dfs(root)
    return total
}

private fun isPalindrome(freqs: IntArray): Boolean {
    var hasMiddle = false
    for (freq in freqs) {
        if (freq % 2 == 1) {
            if (hasMiddle) return false
            hasMiddle = true
        }
    }
    return true
}