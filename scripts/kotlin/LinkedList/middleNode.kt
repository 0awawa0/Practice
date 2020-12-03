
/*
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.
*/

fun middleNode(head: ListNode?): ListNode? {
    var fast = head?.next
    var slow = head
        
    while (fast != null) {
        fast = fast?.next?.next
        slow = slow?.next
    }

    return slow
}
