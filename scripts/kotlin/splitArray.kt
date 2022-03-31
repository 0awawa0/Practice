
/*
Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these m subarrays.
*/


fun splitArray(nums: IntArray, m: Int): Int {
    var sum = nums.sum()!!
    var maxElem = nums.max()!!
        
    var left = maxElem
    var right = sum
    var answer = 0
    while (left <= right) {
        var maxAllowed = left + (right - left) / 2
            
        if (minSubarrays(nums, maxAllowed) <= m) {
            right = maxAllowed - 1
            answer = maxAllowed
        } else left = maxAllowed + 1
    }
    return answer
}
    
private fun minSubarrays(nums: IntArray, maxAllowed: Int): Int {
        
    var currSum = 0
    var splits = 0
    for (elem in nums) {
        if (currSum + elem <= maxAllowed) currSum += elem
        else {
            currSum = elem
            splits++
        }
    }
    return splits + 1
}