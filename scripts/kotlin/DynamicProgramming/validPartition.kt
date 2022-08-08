

/*
You are given a 0-indexed integer array nums. You have to partition the array into one or more contiguous subarrays.

We call a partition of the array valid if each of the obtained subarrays satisfies one of the following conditions:

    The subarray consists of exactly 2 equal elements. For example, the subarray [2,2] is good.
    The subarray consists of exactly 3 equal elements. For example, the subarray [4,4,4] is good.
    The subarray consists of exactly 3 consecutive increasing elements, that is, the difference between adjacent elements is 1. For example, the subarray [3,4,5] is good, but the subarray [1,3,5] is not.

Return true if the array has at least one valid partition. Otherwise, return false.
*/

fun validPartition(nums: IntArray): Boolean {
    if (nums.size < 2) return false
    val mem = HashMap<Int, Boolean>()
    
    fun partition(idx: Int): Boolean {
        if (idx >= nums.size) return true
        if (idx == nums.lastIndex) return false
        if (mem[idx] != null) return mem[idx]!!
        
        var result = false
        if (nums[idx] == nums[idx + 1]) {
            if (partition(idx + 2)) result = true
            else if (nums[idx] == nums[idx + 2]) result = partition(idx + 3)
        } else {
            if (idx + 2 < nums.size && nums[idx + 1] - nums[idx] == 1 && nums[idx + 2] - nums[idx + 1] == 1) 
                result = partition(idx + 3)
        }
        mem[idx] = result
        return result
    }
    
    return partition(0)
}