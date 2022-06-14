
/*
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
*/

fun maxSubarraySumCircular(nums: IntArray): Int {
    var currMin = nums[0]
    var currMax = nums[0]
    var minSum = nums[0]
    var maxSum = nums[0]
    var totalSum = nums[0]
    for (i in 1 until nums.size) {
        currMin = minOf(nums[i], currMin + nums[i])
        currMax = maxOf(nums[i], currMax + nums[i])
        minSum = minOf(minSum, currMin)
        maxSum = maxOf(maxSum, currMax)
        totalSum += nums[i]
    }
        
    return if (maxSum > 0) maxOf(maxSum, totalSum - minSum) else maxSum
}