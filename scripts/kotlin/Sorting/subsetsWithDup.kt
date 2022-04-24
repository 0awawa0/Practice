
/*
Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
*/

fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    nums.sort()
        
    val result = ArrayList<List<Int>>()
    result.add(emptyList())
        
    var startI = 0
    var cachedSize = 0
    for (i in nums.indices) {
        startI = if (i > 0 && nums[i] == nums[i - 1]) cachedSize else 0
        cachedSize = result.size
        for (j in startI until result.size) 
            result.add(result[j] + nums[i])
    }
            
        
    return result
}