
/*
Design a text editor with a cursor that can do the following:

    + Add text to where the cursor is.
    + Delete text from where the cursor is (simulating the backspace key).
    + Move the cursor either left or right.

When deleting text, only characters to the left of the cursor will be deleted. The cursor will also remain within the actual text and cannot be moved beyond it. More formally, we have that 0 <= cursor.position <= currentText.length always holds.

Implement the TextEditor class:

    + TextEditor() Initializes the object with empty text.
    + void addText(string text) Appends text to where the cursor is. The cursor ends to the right of text.
    + int deleteText(int k) Deletes k characters to the left of the cursor. Returns the number of characters actually deleted.
    + string cursorLeft(int k) Moves the cursor to the left k times. Returns the last min(10, len) characters to the left of the cursor, where len is the number of characters to the left of the cursor.
    + string cursorRight(int k) Moves the cursor to the right k times. Returns the last min(10, len) characters to the left of the cursor, where len is the number of characters to the left of the cursor.

*/

class TextEditor() {
    
    private class Node(val value: Char, var prev: Node? = null, var next: Node? = null) { 
        override fun equals(other: Any?): Boolean { 
            if (other is Node) return this.value == other.value
            return false
        }
    }

    private val head = Node('_')
    private var cursor = head
    
    fun addText(text: String) {
        text.forEach {
            val newNode = Node(it, prev = cursor, next = cursor.next)
            cursor.next?.prev = newNode
            cursor.next = newNode
            cursor = newNode
        }
    }

    fun deleteText(k: Int): Int {
        var count = 0
        repeat(k) {
            if (cursor == head) return@repeat
            val prev = cursor.prev!!
            val next = cursor.next
            prev.next = next
            next?.prev = prev
            cursor = prev
            count++
        }
        
        return count
    }

    fun cursorLeft(k: Int): String {
        repeat(k) {
            if (cursor == head) return@repeat
            cursor = cursor.prev!!
        }
        return getLastSubstring()
    }

    fun cursorRight(k: Int): String {
        repeat(k) {
            if (cursor.next == null) return@repeat
            cursor = cursor.next!!
        }
        
        return getLastSubstring()
    }

    private fun getLastSubstring(): String {
        val ret = StringBuilder()
        var currNode = cursor
        var i = 0
        while(currNode != head && i < 10) {
            ret.insert(0, currNode.value)
            i++
            currNode = currNode.prev!!
        }
        return ret.toString()
    }
}