
/*
Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Implement KthLargest class:

    KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
    int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.

*/

class KthLargest(val k: Int, nums: IntArray) {

    private val queue = PriorityQueue<Int>()
    
    init { nums.forEach { this.add(it) } }
    
    fun add(`val`: Int): Int {
        queue.add(`val`)
        while (queue.size > k) queue.poll()
        return queue.peek()
    }

}