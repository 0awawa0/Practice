
/*
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

    + The left subtree of a node contains only nodes with keys less than or equal to the node's key.
    + The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
    + Both the left and right subtrees must also be binary search trees.

*/

fun findMode(root: TreeNode?): IntArray {
  val frequencies = HashMap<Int, Int>()
        
  var maxFreq = 0
  fun traverse(node: TreeNode?) {
    if (node == null) return
    val newFreq = (frequencies[node.`val`] ?: 0) + 1
    frequencies[node.`val`] = newFreq
    maxFreq = maxOf(maxFreq, newFreq)
    traverse(node.left)
    traverse(node.right)
  }
        
  traverse(root)
        
  val result = LinkedList<Int>()
  for (freq in frequencies) if (freq.value == maxFreq) result.add(freq.key)
        
  return result.toIntArray()
}
