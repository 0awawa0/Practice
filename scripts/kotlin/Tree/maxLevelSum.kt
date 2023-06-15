/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
 */
 
fun maxLevelSum(root: TreeNode?): Int {

    val queue = LinkedList<TreeNode>()
    var result = 1
    var maxValue = root!!.`val`
    var currLevel = 0
    queue.add(root)

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        currLevel++
        var currSum = 0
        repeat(levelSize) { 
            val child = queue.poll()
            currSum += child.`val`
            child.left?.let { queue.add(it) }
            child.right?.let { queue.add(it) }
        }
        if (maxValue < currSum) {
            maxValue = currSum
            result = currLevel
        }
    }

    return result
}