
/*
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.
*/

fun numberOfSubarrays(nums: IntArray, k: Int): Int {
    val sums = HashMap<Int, Int>()
    var currSum = 0
    var count = 0
    sums[0] = 1
    for (i in nums.indices) {
        currSum += nums[i] % 2
        if (sums[currSum - k] != null) {
            count += sums[currSum - k]!!
        }
        sums[currSum] = (sums[currSum] ?: 0) + 1
    }
    return count
}