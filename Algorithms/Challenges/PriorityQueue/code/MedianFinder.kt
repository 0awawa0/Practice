
/*
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.

    For example, for arr = [2,3,4], the median is 3.
    For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.

Implement the MedianFinder class:

    MedianFinder() initializes the MedianFinder object.
    void addNum(int num) adds the integer num from the data stream to the data structure.
    double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
*/

class MedianFinder() {

    private val minHeap = PriorityQueue<Int>()
    private val maxHeap = PriorityQueue<Int>(compareBy<Int> { -it })
    
    fun addNum(num: Int) {
        if ((minHeap.size + maxHeap.size) % 2 == 0) {
            maxHeap.add(num)
            minHeap.add(maxHeap.poll())
        } else {
            minHeap.add(num)
            maxHeap.add(minHeap.poll())
        }
    }

    fun findMedian(): Double {
        if ((minHeap.size + maxHeap.size) % 2 == 0) return ((minHeap.peek() ?: 0) + (maxHeap.peek() ?: 0)) / 2.0
        else return (minHeap.peek() ?: 0).toDouble()
    }

}