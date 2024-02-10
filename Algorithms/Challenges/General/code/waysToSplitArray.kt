
/*
You are given a 0-indexed integer array nums of length n.

nums contains a valid split at index i if the following are true:

    The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
    There is at least one element to the right of i. That is, 0 <= i < n - 1.

Return the number of valid splits in nums.
*/

fun waysToSplitArray(nums: IntArray): Int {
    var totalSum = 0L
    for (num in nums) totalSum += num.toLong()
        
    var currSum = 0L
    var count = 0
    for (i in 0 until nums.lastIndex) {
        currSum += nums[i].toLong()
        totalSum -= nums[i].toLong()
        if (currSum >= totalSum) count++
    }
    return count
}