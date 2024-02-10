
/*
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
*/

fun swapNodes(head: ListNode?, k: Int): ListNode? {
    val length = head?.getLength() ?: return head
    if (length == 1) return head
    if (length == 2) {
        val last = head?.next
        last?.next = head
        head?.next = null
        return last
    }
        
    if (k == 1 || k == length) return swapHead(head)
        
    var firstNode: ListNode? = head?.findNodeBefore(k)
    var secondNode: ListNode? = head?.findNodeBefore(length - k + 1)
        
    swapNodes(firstNode, secondNode)
        
    return head
}
    
private fun ListNode.getLength(): Int {
    var n: ListNode? = this
    var l = 0
    while (n != null) {
        n = n.next
        l++
    }
    return l
}
    
private fun ListNode.findNodeBefore(k: Int): ListNode? {
    var counter = 2
    var node: ListNode? = this
    while (counter < k) {
        node = node?.next
        counter++
    }
    return node
}
    
private fun swapHead(head: ListNode?): ListNode? {
    var h = head
    var curr = head
    while (curr?.next?.next != null) curr = curr?.next
        
    val last = curr?.next
    last?.next = h?.next
    h?.next = null
    curr?.next = h
    h = last
        
    return h
}
    
private fun swapNeighbors(beforeFirst: ListNode?, beforeSecond: ListNode?) {
    val firstNode = beforeFirst?.next
    val secondNode = beforeSecond?.next
    firstNode?.next = secondNode?.next
    secondNode?.next = firstNode
    beforeFirst?.next = secondNode
}
    
private fun swapNodes(beforeFirst: ListNode?, beforeSecond: ListNode?) {
    when {
        beforeFirst?.next == beforeSecond -> swapNeighbors(beforeFirst, beforeSecond)
        beforeSecond?.next == beforeFirst -> swapNeighbors(beforeSecond, beforeFirst)
        else -> {
            val first = beforeFirst?.next
            val second = beforeSecond?.next
            val afterFirst = first?.next
            val afterSecond = second?.next
                
            beforeFirst?.next = second
            second?.next = afterFirst
                
            beforeSecond?.next = first
            first?.next = afterSecond
        }
    }
}