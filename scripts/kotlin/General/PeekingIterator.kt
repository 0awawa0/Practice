
/*
Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.

Implement the PeekingIterator class:

    PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
    int next() Returns the next element in the array and moves the pointer to the next element.
    boolean hasNext() Returns true if there are still elements in the array.
    int peek() Returns the next element in the array without moving the pointer.
*/

class PeekingIterator(val iterator:Iterator<Int>):Iterator<Int> {
    
    var topElem: Int? = null
    
    fun peek(): Int {
        if (topElem != null) return topElem!!
    	if (iterator.hasNext()) topElem = iterator.next()
        return topElem!!
    }
    
    override fun next(): Int {
        val t = topElem
        topElem = null
        if (t != null) return t
        return iterator.next()
    }
    
    override fun hasNext(): Boolean {
        return topElem != null || iterator.hasNext()
    }
}