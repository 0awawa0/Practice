
/*
You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. 
The binary tree has the following definition:
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
Initially, all next pointers are set to NULL.
*/

fun connect(root: Node?): Node? {
    if (root == null) return root
        
    val queue = LinkedList<Node>()
        
    if (root.left != null) {
        queue.add(0, root.left!!)
        queue.add(0, root.right!!)
    }
        
    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        var prevNode = queue.removeLast()
        if (prevNode.left != null) {
            queue.add(0, prevNode.left!!)
            queue.add(0, prevNode.right!!)
        }
        for (i in 0 until levelSize - 1) {
            val newNode = queue.removeLast()
            if (newNode.left != null) {
                queue.add(0, newNode.left!!)
                queue.add(0, newNode.right!!)
            }
            prevNode.next = newNode
            prevNode = newNode
        }
    }
        
    return root
}
