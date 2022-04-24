

/*
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.
*/

fun findPeakElement(nums: IntArray): Int {
    var left = 0
    var right = nums.lastIndex
    while (left < right) {
        val middle = left + (right - left) / 2
        if (nums[middle] > nums[middle + 1]) right = middle
        else left = middle + 1
    }
    return left
}