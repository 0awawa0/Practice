
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
*/


fun searchRange(nums: IntArray, target: Int): IntArray {
    return intArrayOf(findFirstAppearence(nums, target), findLastAppearence(nums, target))
}

private fun findFirstAppearence(nums: IntArray, target: Int): Int {
    var position = -1
    var left = 0
    var right = nums.lastIndex
    while (left <= right) {
        val middle = left + (right - left) / 2
        if (nums[middle] >= target) right = middle - 1
        else left = middle + 1
        
        if (nums[middle] == target) position = middle
    }
    
    return position
}

private fun findLastAppearence(nums: IntArray, target: Int): Int {
    var position = -1
    var left = 0
    var right = nums.lastIndex
    while (left <= right) {
        val middle = left + (right - left) / 2
        if (nums[middle] <= target) left = middle + 1
        else right = middle - 1
        
        if (nums[middle] == target) position = middle
    }
    
    return position
}