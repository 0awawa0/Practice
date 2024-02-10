
/*
You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:

    * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
    * int next() Returns the next integer in the nested list.
    * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

Your code will be tested with the following pseudocode:
*/

class NestedIterator(nestedList: List<NestedInteger>) {
    
    private val flattenedList = LinkedList<Int>()
    
    init { flatten(nestedList) }
    
    fun next(): Int { return flattenedList.poll() }
    
    fun hasNext(): Boolean { return flattenedList.isNotEmpty() }
    
    private fun flatten(nestedList: List<NestedInteger>) {
        for (number in nestedList) {
            if (number.isInteger) flattenedList.add(number.getInteger()!!)
            else flatten(number.getList()!!)
        }
    }
}