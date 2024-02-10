

/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.
*/

fun lengthOfLIS(nums: IntArray): Int {
    val ends = IntArray(nums.size)
    var currSize = 0
        
    for (number in nums) {
        var left = 0
        var right = currSize
        while (left != right) {
            val middle = left + (right - left) / 2
            if (ends[middle] < number) left = middle + 1
            else right = middle
        }
        ends[left] = number
        if (left == currSize) currSize++
    }
        
    return currSize
}