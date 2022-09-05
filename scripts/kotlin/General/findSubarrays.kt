
/*
Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.

Return true if these subarrays exist, and false otherwise.

A subarray is a contiguous non-empty sequence of elements within an array.
*/

fun findSubarrays(nums: IntArray): Boolean {
    val sums = HashSet<Int>()
    var currSum = nums[0] + nums[1]
    sums.add(currSum)
    for (i in 2 until nums.size) {
        currSum = currSum - nums[i - 2] + nums[i]
        if (currSum in sums) return true
        sums.add(currSum)
    }
    return false
}