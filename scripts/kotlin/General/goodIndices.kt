
/*
You are given a 0-indexed integer array nums of size n and a positive integer k.

We call an index i in the range k <= i < n - k good if the following conditions are satisfied:

    The k elements that are just before the index i are in non-increasing order.
    The k elements that are just after the index i are in non-decreasing order.

Return an array of all good indices sorted in increasing order.
*/

fun goodIndices(nums: IntArray, k: Int): List<Int> {
    val t = IntArray(nums.size)
    
    var nonIncreasingLength = 1
    for (i in 1 until nums.size) {
        if (nonIncreasingLength >= k) t[i]++
        if (nums[i] > nums[i - 1]) nonIncreasingLength = 0
        nonIncreasingLength++
    }
    
    var nonDecreasingLength = 1
    for (i in nums.lastIndex - 1 downTo 0) {
        if (nonDecreasingLength >= k) t[i]++
        if (nums[i] > nums[i + 1]) nonDecreasingLength = 0
        nonDecreasingLength++
    }
    
    return t.mapIndexed { idx, value -> if (value == 2) idx else null }.filterNotNull()
}