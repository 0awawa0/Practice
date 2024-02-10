
/*
You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.

Each minute, a node becomes infected if:

    The node is currently uninfected.
    The node is adjacent to an infected node.

Return the number of minutes needed for the entire tree to be infected.
*/

fun amountOfTime(root: TreeNode?, start: Int): Int {
    val adjList = HashMap<Int, ArrayList<Int>>()
    
    fun dfs(node: TreeNode?, prevNode: TreeNode?) {
        if (node == null) return
        val list = ArrayList<Int>()
        
        if (prevNode != null) list.add(prevNode.`val`)
        if (node.left != null) {
            list.add(node.left!!.`val`)
            dfs(node.left, node)
        }
        if (node.right != null) {
            list.add(node.right!!.`val`)
            dfs(node.right, node)
        }
        adjList[node.`val`] = list
    }
    
    dfs(root, null)
    
    var time = -1
    val visited = HashSet<Int>()
    val queue = LinkedList<Int>()
    queue.add(start)
    
    while(queue.isNotEmpty()) {
        time++
        val size = queue.size
        repeat(size) {
            val node = queue.poll()
            visited.add(node)
            adjList[node]!!.forEach { if (it !in visited) queue.add(it) }
        }
    }
    
    return time
}