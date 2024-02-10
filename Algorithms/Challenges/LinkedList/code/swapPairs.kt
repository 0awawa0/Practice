

/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
*/

fun swapPairs(head: ListNode?): ListNode? {
  if (head?.next == null) return head
        
  var newHead = head.next
  head.next = newHead.next
  newHead.next = head
        
  var prevNode = newHead?.next
  var currNode = prevNode?.next
        
  while (currNode?.next != null) {
    val nextNode = currNode.next?.next
    prevNode?.next = currNode.next
    currNode?.next = nextNode
    prevNode?.next?.next = currNode
    prevNode = currNode
    currNode = nextNode
  }
        
  return newHead
}
