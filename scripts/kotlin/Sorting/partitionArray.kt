
/*
You are given an integer array nums and an integer k. You may partition nums into one or more subsequences such that each element in nums appears in exactly one of the subsequences.

Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each subsequence is at most k.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
*/

fun partitionArray(nums: IntArray, k: Int): Int {
    nums.sort()
    var count = 1
    var currMin = nums[0]
    for (i in 1 until nums.size) {
        if (nums[i] - currMin > k) {
            currMin = nums[i]
            count++
        }
    }
        
    return count
}