
/*
Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children.
*/

fun binaryTreePaths(root: TreeNode?): List<String> {
  if (root == null) return emptyList()
  val queue = LinkedList<Pair<TreeNode, String>>()
  queue.add(Pair(root, ""))
        
  val answer = LinkedList<String>()
  while (queue.isNotEmpty()) {
    val queueSize = queue.size
    repeat(queueSize) {
      val node = queue.poll()
      val currPath = if (node.second.isBlank()) node.first.`val`.toString() else node.second + "->${node.first.`val`}"
      if (node.first.left == null && node.first.right == null) answer.add(currPath)
      if (node.first.left != null) queue.add(Pair(node.first.left!!, currPath))
      if (node.first.right != null) queue.add(Pair(node.first.right!!, currPath))
    }
  }
        
  return answer
}
