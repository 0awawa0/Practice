
/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
*/

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2
    if (l2 == null) return l1
        
    var l1 = l1
    var l2 = l2
        
    var newList: ListNode? = null
    var newNode: ListNode? = null
        
    if (l1.`val` < l2.`val`) {
        newList = ListNode(l1.`val`)
        newNode = newList
        l1 = l1.next
    } else {
        newList = ListNode(l2.`val`)
        newNode = newList
        l2 = l2.next
    }
        
    while (l1 != null || l2 != null) {
        if (l1 == null) {
            while (l2 != null) {
                newNode?.next = ListNode(l2!!.`val`)
                newNode = newNode?.next
                l2 = l2.next
            }
            return newList
        }
            
        if (l2 == null) {
            while(l1 != null) {
                newNode?.next = ListNode(l1!!.`val`)
                newNode = newNode?.next
                l1 = l1.next
            }
            return newList
        }
            
        if (l1.`val` < l2.`val`) {
            newNode?.next = ListNode(l1.`val`)
            newNode = newNode?.next
            l1 = l1.next
        } else {
            newNode?.next = ListNode(l2.`val`)
            newNode = newNode?.next
            l2 = l2.next
        }
    }
    return newList
}
