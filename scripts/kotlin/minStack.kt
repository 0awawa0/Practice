
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
*/

class MinStack() {
    
    private data class Node(
        val value: Int,
        var next: Node? = null,
        var nextMin: Node? = null
    )
    
    private var stack: Node? = null
    private var minNode: Node? = null 

    fun push(`val`: Int) {
        val newNode = Node(`val`)
        newNode.next = this.stack
        this.stack = newNode
        
        if (this.minNode == null || this.minNode!!.value >= `val`) {
            newNode.nextMin = this.minNode
            this.minNode = newNode
        }
    }

    fun pop() {
        if (this.stack?.value == this.minNode?.value) {
            this.minNode = this.minNode?.nextMin
        }
        this.stack = this.stack?.next
    }

    fun top(): Int {
        return this.stack!!.value
    }

    fun getMin(): Int {
        return this.minNode!!.value
    }
}
