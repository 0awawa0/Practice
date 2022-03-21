/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
*/

fun preorder(root: Node?): List<Int> {
  if (root == null) return emptyList()
  val result = LinkedList<Int>()
  result.add(root.`val`)
  for (child in root.children) result.addAll(preorder(child))
  return result
}
