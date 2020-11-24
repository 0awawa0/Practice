class MyLinkedList() {
    
    class ListNode(val `val`: Int) {
        var next: ListNode? = null
        var prev: ListNode? = null
    }

    /** Initialize your data structure here. */
    var head: ListNode? = null
    var tail: ListNode? = null
    var size = 0
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int {
        
        if (index < 0 || index >= size) return -1
        
        var index = index
        var h = head
        while (index > 0) {
            h = h?.next
            index -= 1
        }
        
        return h?.`val` ?: 0
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    fun addAtHead(`val`: Int) {
        if (head == null) {
            head = ListNode(`val`)
            tail = head
            size += 1
            return
        }
        
        if (head == tail) {
            val t = head
            head = ListNode(`val`)
            head?.next = t
            t?.prev = head
            size += 1
            return
        }
        
        val t = head
        head = ListNode(`val`)
        head?.next = t
        t?.prev = head
        size += 1
    }

    /** Append a node of value val to the last element of the linked list. */
    fun addAtTail(`val`: Int) {
        
        if (tail == null) {
            addAtHead(`val`)
            return
        }
        
        if (tail == head) {
            val t = tail
            tail = ListNode(`val`)
            tail?.prev = t
            t?.next = tail
            size += 1
            return
        }
        
        val t = tail
        tail = ListNode(`val`)
        tail?.prev = t
        t?.next = tail
        size += 1
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    fun addAtIndex(index: Int, `val`: Int) {
        
        if (index < 0 || index > size) return
        
        if (index == 0) {
            addAtHead(`val`)
            return
        }
        
        if (index == size) {
            addAtTail(`val`) 
            return
        }
        
        var i = 0
        var h = head
        while (i < index) {
            h = h?.next
            i += 1
        }
        
        val t = ListNode(`val`)
        t?.next = h
        t?.prev = h?.prev
        h?.prev?.next = t
        h?.prev = t
        size += 1
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= size) return
        
        if (index == 0) { 
            head?.next?.prev = null
            head = head?.next
            size -= 1
            return
        }
        
        if (index == size - 1) {
            tail?.prev?.next = null
            tail = tail?.prev
            size -= 1
            return
        }
        
        var i = 0
        var h = head
        while (i < index) {
            h = h?.next
            i += 1
        }
        h?.next?.prev = h?.prev
        h?.prev?.next = h?.next
        size -= 1
    }
}
