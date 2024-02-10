

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
*/

fun deleteDuplicates(head: ListNode?): ListNode? {
  var h = head
  while (h != null) {
    while (h.next != null && h.next.`val` == h.`val`) h.next = h.next.next
    if (h.next == null) return head
    h = h.next
  }
        
  return head
}
