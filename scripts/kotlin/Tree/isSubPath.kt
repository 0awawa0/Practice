
/*
Given a binary tree root and a linked list with head as the first node. 

Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.
*/

fun isSubPath(head: ListNode?, root: TreeNode?, currNode: TreeNode? = null): Boolean {
  if (root == null) return false
  if (!checkPath(head, root)) return isSubPath(head, root.left) || isSubPath(head, root.right)
  else return true
}
    
private fun checkPath(head: ListNode?, root: TreeNode?): Boolean {
  if (head == null) return true
  if (root == null) return false
        
  if (root.`val` == head.`val`) return checkPath(head.next, root.left) || checkPath(head.next, root.right)
  return false
}
