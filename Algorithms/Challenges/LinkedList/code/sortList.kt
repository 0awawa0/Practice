/*
Given the head of a linked list, return the list after sorting it in ascending order.
*/

fun sortList(head: ListNode?): ListNode? {
  if (head?.next == null) return head
        
  val middle = getMidNode(head)
  val left = sortList(head)
  val right = sortList(middle)
        
  return merge(left, right)
}
    
private fun merge(list1: ListNode?, list2: ListNode?): ListNode {
  var l1Head = list1
  var l2Head = list2
  val dummy = ListNode(0)
  var tail = dummy
  while (l1Head != null && l2Head != null) {
    if (l1Head.`val` < l2Head.`val`) {
      tail.next = l1Head
      l1Head = l1Head.next
      tail = tail.next
    } else {
      tail.next = l2Head
      l2Head = l2Head.next
      tail = tail.next
    }
  }
        
  tail.next = if (l1Head == null) l2Head else l1Head
  return dummy.next
}
    
private fun getMidNode(list: ListNode?): ListNode? {
  var prev: ListNode? = null
  var currNode = list
  while (currNode?.next != null) {
    prev = if (prev == null) list else prev?.next
    currNode = currNode?.next?.next
  }
  val mid = prev?.next
  prev?.next = null
  return mid
}
