
/*
Given the root of a binary tree, invert the tree, and return its root.

*/

fun invertTree(root: TreeNode?): TreeNode? {
  if (root == null) return null
  val queue = LinkedList<TreeNode>()
  queue.add(root)
  while (queue.isNotEmpty()) {
    val node = queue.poll()
    val t = node.left
    node.left = node.right
    node.right = t
    if (node.left != null) queue.add(node.left)
    if (node.right != null) queue.add(node.right)
  }
        
  return root
}
