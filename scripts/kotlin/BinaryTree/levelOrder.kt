
/*
Given an n-ary tree, return the level order traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
*/

fun levelOrder(root: Node?): List<List<Int>> {
  if (root == null) return emptyList()
  val queue = LinkedList<Node>()
  val result = LinkedList<List<Int>>()
  queue.add(root)
  while (queue.isNotEmpty()) {
    val queueSize = queue.size
    val list = LinkedList<Int>()
    repeat(queueSize) {
      val node = queue.poll()
      list.add(node.`val`)
      node.children.forEach { if (it != null) queue.add(it) }
    }
    result.add(list)
  }
  return result
}
