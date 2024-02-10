
// You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to
//    a separate doubly linked list. 
// These child lists may have one or more children of their own, and so on, to produce a multilevel data structure.
// Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

private fun innerFlatten(root: Node?): Pair<Node?, Node?> {
    var curr = root
    var last = curr
    while (curr != null) {
        if (curr.child != null) {
            val (childRoot, childLast) = innerFlatten(curr.child)
            childLast?.next = curr.next
            curr.next?.prev = childLast
            childRoot?.prev = curr
            curr.next = childRoot
            curr.child = null
            curr = childLast?.next
            last = childLast
        } else {
            last = curr
            curr = curr.next
        }
    }
    return Pair(root, last)
}
    
fun flatten(root: Node?): Node? {
    return innerFlatten(root).first
}
