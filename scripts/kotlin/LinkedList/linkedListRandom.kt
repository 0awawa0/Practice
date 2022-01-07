
/*
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
*/

fun getRandom(head: ListNode?): Int {
    var curr = head
    var scope = 1.0
    var value = 0
    while (curr != null) {
        if (Math.random() < 1.0 / scope) value = curr.`val`
        scope += 1
        curr = curr.next
    }
        
    return value
}
