
/*
Design a number container system that can do the following:

    Insert or Replace a number at the given index in the system.
    Return the smallest index for the given number in the system.

Implement the NumberContainers class:

    NumberContainers() Initializes the number container system.
    void change(int index, int number) Fills the container at index with the number. If there is already a number at that index, replace it.
    int find(int number) Returns the smallest index for the given number, or -1 if there is no index that is filled by number in the system.

*/


class NumberContainers() {

    val numberToIndicesMap = HashMap<Int, TreeSet<Int>>()
    val indexToNumberMap = HashMap<Int, Int>()
    
    fun change(index: Int, number: Int) {
        val prevNumber = indexToNumberMap[index]
        if (numberToIndicesMap[number] == null) numberToIndicesMap[number] = TreeSet()
        
        if (prevNumber == null) {
            indexToNumberMap[index] = number
            numberToIndicesMap[number]!!.add(index)
        } else {
            if (prevNumber != number) {
                numberToIndicesMap[prevNumber]!!.remove(index)
                indexToNumberMap[index] = number
                numberToIndicesMap[number]!!.add(index)
            }
        }
    }

    fun find(number: Int): Int {
        val indices = numberToIndicesMap[number]
        if (indices == null || indices.isEmpty()) return -1
        else return indices.first()
    }

}