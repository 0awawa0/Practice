
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var firstNode = head
    var secondNode: ListNode? = head?.next ?: return null
    var distance = 2
        
    while (secondNode?.next != null && distance != n + 1) {
        secondNode = secondNode?.next
        distance += 1
    }
        
    while (secondNode?.next != null) {
        secondNode = secondNode?.next
        firstNode = firstNode?.next
    }
        
    if (distance == n) { return head?.next }
        
    firstNode?.next = firstNode?.next?.next
    return head
        
}
