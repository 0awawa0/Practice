

fun middleNode(head: ListNode?): ListNode? {
    var fast = head?.next
    var slow = head
        
    while (fast != null) {
        fast = fast?.next?.next
        slow = slow?.next
    }

    return slow
}
