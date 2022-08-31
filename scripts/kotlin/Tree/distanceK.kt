

/*
Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.

You can return the answer in any order.
*/


fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
    if (root == null || target == null) return emptyList()
    val adjList = HashMap<Int, ArrayList<Int>>()
    
    fun buildAdjList(node: TreeNode?, prevNode: TreeNode?) {
        if (node == null) return
        
        adjList[node.`val`] = ArrayList()
        
        if (prevNode != null) adjList[node.`val`]?.add(prevNode.`val`)
        if (node.left != null) adjList[node.`val`]?.add(node.left!!.`val`)
        if (node.right != null) adjList[node.`val`]?.add(node.right!!.`val`)
        
        buildAdjList(node.left, node)
        buildAdjList(node.right, node)
    }
    
    buildAdjList(root, null)
    
    var distance = -1
    val visited = HashSet<Int>()
    val queue = LinkedList<Int>()
    queue.add(target.`val`)
    
    val result = ArrayList<Int>()
    while (queue.isNotEmpty() && distance <= k) {
        distance++
        val size = queue.size
        repeat(size) {
            val currNode = queue.poll()
            
            if (currNode in visited) return@repeat
            visited.add(currNode)
            if (distance == k) result.add(currNode)
            
            for (neighbor in adjList[currNode] ?: arrayListOf()) queue.add(neighbor)
        }
    }
    
    return result
}