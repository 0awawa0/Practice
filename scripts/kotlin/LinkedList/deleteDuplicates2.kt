
/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/

fun deleteDuplicates(head: ListNode?): ListNode? {
  var dummy = ListNode(0)
  dummy.next = head
      
  var currNode = head
  var prevNode = dummy
  while (currNode != null) {
    if (currNode?.next != null && currNode?.`val` == currNode?.next?.`val`) {
      while (currNode?.next != null && currNode?.`val` == currNode?.next?.`val`) currNode = currNode?.next
      prevNode.next = currNode?.next
    } else prevNode = prevNode?.next
        
    currNode = currNode?.next
  }
      
  return dummy.next
}
