
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
*/

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var currSum = 0L
    for (i in 0 until k) currSum += nums[i].toLong()
        
    var maxSum = currSum
    for (i in k until nums.size) {
        currSum -= nums[i - k].toLong()
        currSum += nums[i].toLong()
        maxSum = maxOf(maxSum, currSum)
    }
    return maxSum / k.toDouble()
}