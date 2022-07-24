
/*
Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.
*/

fun zeroFilledSubarray(nums: IntArray): Long {
    var isZeroArr = false
    var anchor = 0
    val counts = LongArray(nums.size)
    var totalCount = 0L
    for (i in nums.indices) {
        if (nums[i] == 0) {
            if (isZeroArr) counts[i] = counts[i - 1] + (i - anchor + 1).toLong()
            else {
                anchor = i
                counts[i] = 1L
            }
            isZeroArr = true
        } else {
            totalCount += counts.getOrElse(i - 1) { 0 }
            isZeroArr = false
        }
    }
    
    if (isZeroArr) totalCount += counts.last()
    return totalCount
}