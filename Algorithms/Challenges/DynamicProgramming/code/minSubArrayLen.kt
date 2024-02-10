
/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
*/

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var min = Int.MAX_VALUE
    var anchor = 0
    var currSum = 0
    for (i in nums.indices) {
        currSum += nums[i]
        while (currSum >= target) {
            min = minOf(min, i - anchor + 1)
            currSum -= nums[anchor++]
        }
    }
        
    return if (min == Int.MAX_VALUE) 0 else min
}