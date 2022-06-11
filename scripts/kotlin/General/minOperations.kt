
/*
You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
*/

fun minOperations(nums: IntArray, x: Int): Int {
    val target = nums.sum() - x
        
    var maxLength = -1
    var currSum = 0
    var left = 0
    var right = 0
    while (right < nums.size) {
        currSum += nums[right]
        while (left <= right && currSum > target) currSum -= nums[left++]
        if (currSum == target) maxLength = maxOf(maxLength, right - left + 1)
        right++
    }
        
    return if (maxLength < 0) -1 else nums.size - maxLength
}