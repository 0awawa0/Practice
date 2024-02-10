
/*
Given a singly linked list, determine if it is a palindrome.
*/

fun isPalindrome(head: ListNode?): Boolean {
    if (head == null) return true
    if (head.next == null) return true
        
    var length = 0
    var curr = head
        
    while(curr != null) {
        length += 1
        curr = curr.next
    }
        
    if (length == 2) { return head.`val` == head.next?.`val` }
        
    var mirrorHead = head
        
    for (i in 0 until length / 2) {
        mirrorHead = mirrorHead?.next
    }
        
    var h = mirrorHead
    var currNode = mirrorHead?.next
    while (currNode != null) {
        mirrorHead?.next = currNode?.next
        currNode?.next = h
        h = currNode
        currNode = mirrorHead?.next
    }
    mirrorHead = h
        
    curr = head
    for (i in 0 until length / 2) {
        if (mirrorHead!!.`val` != curr!!.`val`) return false
        mirrorHead = mirrorHead?.next
        curr = curr?.next
    }
        
    return true
}
