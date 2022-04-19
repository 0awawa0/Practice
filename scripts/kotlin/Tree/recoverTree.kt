
/*
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
*/

fun recoverTree(root: TreeNode?): Unit {
    var currNode = root
    var prevNode = TreeNode(Int.MIN_VALUE)
    var firstNode: TreeNode? = null
    var secondNode: TreeNode? = null
        
    while (currNode != null) {
        if (currNode?.left == null) {
            if (prevNode.`val` > currNode.`val`) {
                if (firstNode == null) firstNode = prevNode
                secondNode = currNode
            }
            prevNode = currNode
            currNode = currNode?.right
        } else {
            var tempNode = currNode?.left
            while (tempNode?.right != null && tempNode?.right != currNode) tempNode = tempNode?.right
                
            if (tempNode?.right == null) {
                tempNode?.right = currNode
                currNode = currNode?.left
            } else {
                if (prevNode.`val` > currNode.`val`) {
                    if (firstNode == null) firstNode = prevNode
                    secondNode = currNode
                }
                prevNode = currNode
                tempNode?.right = null
                currNode = currNode?.right
            }
        }
    }
        
    val t = firstNode?.`val` ?: 0
    firstNode?.`val` = secondNode?.`val` ?: 0
    secondNode?.`val` = t
}