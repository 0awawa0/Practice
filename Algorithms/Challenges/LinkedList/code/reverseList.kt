
/*
Reverse a singly linked list.
*/

fun reverseList(head: ListNode?): ListNode? {
    var h = head
    var currNode = head?.next
    while (currNode != null) {
        head?.next = currNode?.next
        currNode?.next = h
        h = currNode
        currNode = head?.next
    }
        
    return h
}
