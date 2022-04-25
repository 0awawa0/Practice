
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/

fun rob(nums: IntArray): Int {
    if (nums.size <= 2) return nums.max() ?: 0
        
    nums[1] = maxOf(nums[0], nums[1])
        
    for (i in 2 until nums.size) nums[i] = maxOf(nums[i] + nums[i - 2], nums[i - 1])
    return nums[nums.size - 1]
}