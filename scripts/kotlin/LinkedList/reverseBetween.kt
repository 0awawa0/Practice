
/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
*/

fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    if (head == null) return null
    
    var newHead = head
    var prevNode: ListNode? = null
    var currNode = head
    
    var currPosition = 1
    
    while (currPosition < left) {
        prevNode = currNode
        currNode = currNode?.next
        
        currPosition++
    }
    
    val leftPartEndNode = prevNode
    val middlePartEnd = currNode
    var nextNode: ListNode? = null
    
    while (currPosition <= right) {
        nextNode = currNode?.next
        currNode?.next = prevNode
        prevNode = currNode
        currNode = nextNode
        
        currPosition++
    }
    
    if (leftPartEndNode != null) leftPartEndNode.next = prevNode
    else newHead = prevNode
    
    middlePartEnd?.next = currNode
    return newHead
}