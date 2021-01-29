

/*
Remove all elements from a linked list of integers that have value val.
*/

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var prev: ListNode? = ListNode(0)
    prev?.next = head
    var curr = head
    var head = head
    while (curr != null) {
            
        if (curr.`val` == `val`) {
            prev?.next = curr?.next
            curr?.next = null
            curr = prev?.next
        } else {
            prev = curr
            curr = curr?.next
        }
    }
        
    return head
}
