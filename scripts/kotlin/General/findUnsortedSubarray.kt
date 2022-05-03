
/*
Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.

Return the shortest such subarray and output its length.
*/

fun findUnsortedSubarray(nums: IntArray): Int {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
        
    var foundUnsorted = false
    for (i in 1 until nums.size) {
        if (nums[i] < nums[i - 1]) foundUnsorted = true
        if (foundUnsorted) min = minOf(min, nums[i])
    }
        
    foundUnsorted = false
    for (i in nums.lastIndex - 1 downTo 0) {
        if (nums[i] > nums[i + 1]) foundUnsorted = true
        if (foundUnsorted) max = maxOf(max, nums[i])
    }
        
    var left = 0
    var right = nums.lastIndex
    while (left < nums.size && nums[left] <= min) left++
    while (right >= 0 && nums[right] >= max) right--
        
    return if (right - left < 0) 0 else right - left + 1
}