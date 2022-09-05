
/*
Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

Return the vertical order traversal of the binary tree.
*/

fun verticalTraversal(root: TreeNode?): List<List<Int>> {
    val columns = TreeMap<Int, PriorityQueue<Pair<Int, Int>>>()
    fun dfs(node: TreeNode?, row: Int, column: Int) {
        if (node == null) return
        if (columns[column] == null) columns[column] = PriorityQueue<Pair<Int, Int>>(compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })
        columns[column]?.add(row to node.`val`)
        dfs(node.left, row + 1, column - 1)
        dfs(node.right, row + 1, column + 1)
    }
    
    dfs(root, 0, 0)
    
    val result = ArrayList<List<Int>>()
    for (key in columns.keys) {
        val list = ArrayList<Int>()
        val queue = columns[key]!!
        while (queue.isNotEmpty()) list.add(queue.poll().second)
        result.add(list)
    }
    return result
}