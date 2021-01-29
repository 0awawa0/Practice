
/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
*/

fun oddEvenList(head: ListNode?): ListNode? {
        
    if (head == null) return null
    if (head.next == null) return head
        
    var evenHead: ListNode? = head.next
    var evenCurr = evenHead
        
    var curr = head
    while (curr != null) {
        curr?.next = curr?.next?.next
        evenCurr?.next = evenCurr?.next?.next
            
        evenCurr = evenCurr?.next
        if (curr?.next == null) {
            curr?.next = evenHead
            return head
        } else {
            curr = curr?.next
        }
    }
    return null        
}
