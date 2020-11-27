

/*
There is a stream of n (id, value) pairs arriving in an arbitrary order, where id is an integer between 1 and n and value is a string. 
No two pairs have the same id.

Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion.
The concatenation of all the chunks should result in a list of the sorted values.

Implement the OrderedStream class:
    - OrderedStream(int n) Constructs the stream to take n values.
    - String[] insert(int id, String value) Inserts the pair (id, value) into the stream, then returns the largest possible chunk of currently inserted values that appear next in the order.
*/

class OrderedStream(n: Int) {
    
    val array = arrayOfNulls<String>(n)
    var emptyPointer = 0
    
    fun insert(id: Int, value: String): List<String> {
        array[id - 1] = value
        val result: MutableList<String> = mutableListOf()
        while (emptyPointer < array.size && array[emptyPointer] != null) {
            result.add(array[emptyPointer]!!)
            emptyPointer += 1
        }
        
        return result
    }
}
