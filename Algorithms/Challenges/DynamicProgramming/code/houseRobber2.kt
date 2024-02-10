
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/

fun rob(nums: IntArray): Int {
    if (nums.size <= 2) return nums.max() ?: 0        
    return maxOf(rob(nums, 0, nums.lastIndex - 1), rob(nums, 1, nums.lastIndex))
}
    
private fun rob(nums: IntArray, start: Int, end: Int): Int {
    if (end == start) return nums[start]
        
    val money = IntArray(nums.size) { nums[it] }
        
    money[start + 1] = maxOf(money[start], money[start + 1])
        
    for (i in start + 2 .. end) money[i] = maxOf(money[i - 1], money[i - 2] + money[i])
    return money[end]
}