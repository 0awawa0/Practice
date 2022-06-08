
/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.
*/

fun findKthLargest(nums: IntArray, k: Int): Int {
    val queue = PriorityQueue<Int>(compareBy { -it })
    for (num in nums) queue.add(num)
    repeat(k - 1) { queue.poll() }
    return queue.poll()
}