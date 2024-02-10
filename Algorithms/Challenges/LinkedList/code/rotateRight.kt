
/*
Given the head of a linked list, rotate the list to the right by k places.
*/

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null) { return null }
        
    var foundTail = false
    var length = 0
    var curr = head
    var k = k
        
    while (true) {
        if (!foundTail) {
            length += 1
            if (curr?.next == null) {
                curr?.next = head
                foundTail = true
                k = k % length
            }
            curr = curr?.next
        } else {
            length -= 1
            if (length == k) {
                var t = curr?.next
                curr?.next = null
                return t
            }
                
            curr = curr?.next
        }
    }
        
    return null
}
