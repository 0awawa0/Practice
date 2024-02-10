
/*
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
*/

fun increasingTriplet(nums: IntArray): Boolean {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE
        
    for (num in nums) {
        if (num <= first) first = num
        else {
            if (num <= second) second = num
            else return true
        }
    }
    return false
}