
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var head1 = l1
    var head2 = l2
        
    var mem = 0
    var num = 0
    var resHead = ListNode(mem)
    var currRes: ListNode? = resHead
        
    while (head1 != null && head2 != null) {
            
        num = head1.`val` + head2.`val` + (currRes?.`val` ?: 0)
            
        if (num >= 10) {
            mem = 1
            num -= 10
        } else {
            mem = 0
        }
            
        head1 = head1?.next
        head2 = head2?.next
            
        currRes?.`val` = num
            
        if (head1 != null || head2 != null || mem != 0) {
            currRes?.next = ListNode(mem)
	        currRes = currRes?.next
        }
    }
        
    while (head1 != null) {
        num = (currRes?.`val` ?: 0) + head1.`val`
        if (num >= 10) {
            mem = 1
            num -= 10
        } else {
            mem = 0
        }
            
        currRes?.`val` = num
        head1 = head1?.next
            
        if (head1 != null || mem != 0) {
            currRes?.next = ListNode(mem)
            currRes = currRes?.next
        }
    }
        
    while (head2 != null) {
        num = (currRes?.`val` ?: 0) + head2.`val`
        if (num >= 10) {
            mem = 1
            num -= 10
        } else {
            mem = 0
        }
            
        currRes?.`val` = num
        head2 = head2?.next
            
        if (head2 != null || mem != 0) {
    	    currRes?.next = ListNode(mem)
	        currRes = currRes?.next   
        }
    }
        
    return resHead
}
