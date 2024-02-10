
/*
Given an integer array nums, return the number of longest increasing subsequences.
*/

fun findNumberOfLIS(nums: IntArray): Int {
    val lengthMem = IntArray(nums.size)
    val countMem = IntArray(nums.size)
        
    var maxLength = 1
    var totalCount = 0
    for (i in nums.indices) {
        lengthMem[i] = 1
        countMem[i] = 1
            
        for (j in 0 until i) {
            if (nums[i] > nums[j]) {
                if (lengthMem[i] < lengthMem[j] + 1) {
                lengthMem[i] = lengthMem[j] + 1
                countMem[i] = countMem[j]
                } else if (lengthMem[i] == lengthMem[j] + 1) countMem[i] += countMem[j]
            }
        }
            
        if (maxLength == lengthMem[i]) totalCount += countMem[i]
        if (maxLength < lengthMem[i]) {
            maxLength = lengthMem[i]
            totalCount = countMem[i]
        }
    }
        
    return totalCount
}