
/*
Given an array of integers nums, find the maximum length of a subarray where the product of all its elements is positive.

A subarray of an array is a consecutive sequence of zero or more values taken out of that array.

Return the maximum length of a subarray with positive product.
*/

fun getMaxLen(nums: IntArray): Int {
    var negativeCount = 0
    var firstNegative = -1
    var lastZero = -1
    var maxLength = 0
    for (i in nums.indices) {
            
        if (nums[i] == 0) {
            negativeCount = 0
            firstNegative = -1
            lastZero = i
            continue
        }
            
        if (nums[i] < 0) {
            if (firstNegative == -1) firstNegative = i
            negativeCount++
        }
            
        if (negativeCount % 2 == 0) maxLength = maxOf(i - lastZero, maxLength)
        else maxLength = maxOf(i - firstNegative, maxLength)
    }
        
    return maxLength
}