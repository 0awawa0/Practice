
/*
You are given an integer array nums of size n.

Consider a non-empty subarray from nums that has the maximum possible bitwise AND.

    In other words, let k be the maximum value of the bitwise AND of any subarray of nums. Then, only subarrays with a bitwise AND equal to k should be considered.

Return the length of the longest such subarray.

The bitwise AND of an array is the bitwise AND of all the numbers in it.

A subarray is a contiguous sequence of elements within an array.
*/

fun longestSubarray(nums: IntArray): Int {
    var maxValue = nums[0]
    var maxLength = 1
    var anchor = 0
    for (i in 1 until nums.size) {
        if (nums[i] > maxValue) {
            maxValue = nums[i]
            maxLength = 1
        }
        if (nums[i] != nums[anchor]) anchor = i
        if (nums[i] == maxValue) maxLength = maxOf(maxLength, i - anchor + 1)
    }
    
    return maxLength
}