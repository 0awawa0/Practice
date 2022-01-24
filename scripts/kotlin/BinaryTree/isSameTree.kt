
/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
*/

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
  if (p == null && q == null) return true
        
  val firstQueue = LinkedList<TreeNode?>()
  val secondQueue = LinkedList<TreeNode?>()
        
  firstQueue.add(p)
  secondQueue.add(q)
        
  while (firstQueue.isNotEmpty() && secondQueue.isNotEmpty()) {
    val firstNode = firstQueue.poll()
    val secondNode = secondQueue.poll()
            
    if (firstNode?.`val` != secondNode?.`val`) return false
            
    if (firstNode?.left != null || firstNode?.right != null) {
      firstQueue.add(firstNode?.left)
      firstQueue.add(firstNode?.right)
    }
            
    if (secondNode?.left != null || secondNode?.right != null) {
      secondQueue.add(secondNode?.left)
      secondQueue.add(secondNode?.right)
    }
  }
        
  return firstQueue.isEmpty() && secondQueue.isEmpty()
}
