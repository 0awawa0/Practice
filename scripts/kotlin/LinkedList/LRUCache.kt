
/*
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

    LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
    int get(int key) Return the value of the key if the key exists, otherwise return -1.
    void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.
*/

class LRUCache(val capacity: Int) {
    
    private class ListNode(
        var key: Int,
        var value: Int,
        var left: ListNode? = null,
        var right: ListNode? = null
    )
    
    private val map = HashMap<Int, ListNode>()
    private val head = ListNode(-1, -1)
    private val tail = ListNode(-1, -1)
    private var size = 0
    
    init {
        head.right = tail
        tail.left = head
    }

    private fun addNode(node: ListNode) {
        val prev = tail.left
        prev?.right = node
        node.left = prev
        node.right = tail
        tail.left = node
        map[node.key] = node
        size++
    }
    
    private fun cutNode(node: ListNode) {
        val left = node.left
        val right = node.right
        
        left?.right = right
        right?.left = left
        node.left = null
        node.right = null
        map.remove(node.key)
        size--
    }
    
    fun get(key: Int): Int {
        val node = map[key]
        if (node != null) {
            cutNode(node)
            addNode(node)
        }
        return node?.value ?: -1
    }

    fun put(key: Int, value: Int) {
        val node = map[key]
        if (node == null) {
            val newNode = ListNode(key, value)
            if (size == capacity) {
                cutNode(head.right!!)
            }
            
            addNode(newNode)
        } else {
            node.value = value
            cutNode(node)
            addNode(node)
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */