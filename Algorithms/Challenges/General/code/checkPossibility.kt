
/*
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).
*/

fun checkPossibility(nums: IntArray): Boolean {
    var changed = 0
    for (i in 1 until nums.size) {
        if (nums[i] < nums[i - 1]) {
            changed++
            if (i < 2 || nums[i - 2] <= nums[i]) nums[i - 1] = nums[i]
            else nums[i] = nums[i - 1]
        }
    }
    
    return changed < 2
}