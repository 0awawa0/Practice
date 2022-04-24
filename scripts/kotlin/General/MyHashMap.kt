
/*
Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

    MyHashMap() initializes the object with an empty map.
    void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
    int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
    void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

*/

class MyHashMap() {

    private data class Node(val key: Int, var value: Int, var next: Node? = null) {
        fun find(key: Int): Node {
            var node: Node = this
            while (node.next != null) {
                if (node.next?.key == key) return node
                node = node.next!!
            }
            return node
        }
    }
    
    private val arr: Array<Node> = Array<Node>(10_000) { Node(-1, -1) }
    
    fun put(key: Int, value: Int) {
        val index = key.hashCode() % arr.size
        
        val prevNode = arr[index].find(key)
        if (prevNode.next == null) prevNode.next = Node(key, value)
        else prevNode.next!!.value = value
    }

    fun get(key: Int): Int {
        val index = key.hashCode() % arr.size
        
        val prevNode = arr[index].find(key)
        if (prevNode.next == null) return -1
        else return prevNode.next!!.value
    }

    fun remove(key: Int) {
        val index = key.hashCode() % arr.size
        
        val prevNode = arr[index].find(key)
        if (prevNode.next != null) prevNode.next = prevNode.next!!.next
    }
}