
/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
*/

fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    if (head == null) return null
        
    val lists = sliceList(head, k)
    val reversedLists = LinkedList<ListNode>()
    for (list in lists) { 
        if (list.second) reversedLists.add(reverseList(list.first))
        else reversedLists.add(list.first)
    }
        
    val newHead = reversedLists.removeFirst()
    var curr: ListNode? = newHead
    while (curr != null) {
            
        if (curr.next == null && reversedLists.isNotEmpty()) {
            val nextHead = reversedLists.removeFirst()
            curr.next = nextHead
        } else {
            curr = curr.next
        }
    }
        
    return newHead
}
    
private fun sliceList(head: ListNode, k: Int): List<Pair<ListNode, Boolean>> {
    var currHead: ListNode? = head
    var curr: ListNode? = head
    var counter = 1
    val result = LinkedList<Pair<ListNode, Boolean>>()
    while (curr != null) {
        if (counter == k) {
            val t = curr.next
            curr.next = null
            result.add(Pair(currHead!!, true))
            currHead = t
            curr = currHead
            counter = 1
        } else {
            counter++
            curr = curr.next
        }
    }
        
    if (currHead != null) result.add(Pair(currHead, false))
        
    return result
}
    
private fun reverseList(head: ListNode): ListNode {
    var newHead = head
    var curr = head.next
    while (curr != null) {
        head.next = curr.next
        curr.next = newHead
        newHead = curr
        curr = head.next
    }
    return newHead
}