

/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
*/


fun getMinimumDifference(root: TreeNode?): Int {
    val stack = LinkedList<TreeNode>()
    var node = root!!
    stack.push(node)
    while (node.left != null) {
        node = node.left
        stack.push(node)
    }
        
    var prevNode = stack.pop()
    if (prevNode.right != null) {
        node = prevNode.right
        stack.push(node)
        while (node.left != null) {
            node = node.left
            stack.push(node)
        }
    }
        
    var min = Int.MAX_VALUE
    while (stack.isNotEmpty()) {
        val topNode = stack.pop()

        if (topNode.right != null) {
            node = topNode.right
            stack.push(node)
            while (node.left != null) {
                node = node.left
                stack.push(node)
            }
        }
            
        min = minOf(topNode.`val` - prevNode.`val`, min)
        prevNode = topNode
    }
        
    return min
}