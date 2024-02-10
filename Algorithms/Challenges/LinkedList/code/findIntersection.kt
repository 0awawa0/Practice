
/*
Write a program to find the node at which the intersection of two singly linked lists begins.
*/

fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
    var loopTail = headA
    while (loopTail?.next != null) {
        loopTail = loopTail?.next
    }
    loopTail?.next = headA
        
    var slow = headB
    var fast = headB
        
    var hasLoop = false
    while (fast != null) {
        slow = slow?.next
        fast = fast?.next?.next
        if (slow == fast) {
            hasLoop = true
            slow = headB
            break
        }
    }
        
    if (!hasLoop) { 
        loopTail?.next = null
        return null
    }
        
    while (slow != fast) {
        slow = slow?.next
        fast = fast?.next
    }
    loopTail?.next = null
    return slow
}
