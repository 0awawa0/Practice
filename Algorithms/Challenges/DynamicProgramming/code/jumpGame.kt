
/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
*/

fun canJump(nums: IntArray): Boolean {
    var maxReachable = 0
    for (i in nums.indices) {
        if (i > maxReachable) return false
        maxReachable = maxOf(maxReachable, i + nums[i])
    }
    return true
}