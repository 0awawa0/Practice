
/*
You are given a 0-indexed integer array nums of length n.

The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.

Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.

Note:

    The absolute difference of two numbers is the absolute value of their difference.
    The average of n elements is the sum of the n elements divided (integer division) by n.
    The average of 0 elements is considered to be 0.

*/


fun minimumAverageDifference(nums: IntArray): Int {
        
    var minIndex = 0
    var minAvg = Int.MAX_VALUE
        
    var leftSum = 0L
    var rightSum = 0L
    for (num in nums) rightSum += num.toLong()
        
    var leftElems = 0L
    var rightElems = nums.size.toLong()
        
    for (i in nums.indices) {
            
        leftSum += nums[i].toLong()
        rightSum -= nums[i].toLong()
        leftElems++
        rightElems--
            
        val leftAvg = leftSum / leftElems
        val rightAvg = if (rightElems > 0) rightSum / rightElems else 0
            
        if (abs(leftAvg - rightAvg) < minAvg) {
            minAvg = abs(leftAvg - rightAvg).toInt()
            minIndex = i
        }
    }
        
    return minIndex
}