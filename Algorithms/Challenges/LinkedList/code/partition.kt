
/*
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.
*/

fun partition(head: ListNode?, x: Int): ListNode? {
    if (head == null) return null
    
    var lessHead: ListNode? = null
    var currLess: ListNode? = null
    var greaterHead: ListNode? = null
    var currGreater: ListNode? = null
    var currNode = head
    
    while (currNode != null) {
        if (currNode.`val` < x) {
            if (lessHead == null) {
                lessHead = currNode
                currLess = lessHead
            } else {
                currLess?.next = currNode
                currLess = currLess?.next
            }
        } else {
            if (greaterHead == null) {
                greaterHead = currNode
                currGreater = greaterHead
            } else {
                currGreater?.next = currNode
                currGreater = currGreater?.next
            }
        }
        currNode = currNode?.next
    }
    
    currGreater?.next = null
    currLess?.next = greaterHead
    
    return if (lessHead == null) greaterHead else lessHead
}