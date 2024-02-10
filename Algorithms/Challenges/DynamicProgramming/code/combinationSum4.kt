
/*
Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.

The test cases are generated so that the answer can fit in a 32-bit integer.
*/

fun combinationSum4(nums: IntArray, target: Int): Int {
        
    val mem = IntArray(target + 1) { -1 } 
    
    fun findCount(value: Int): Int {
        if (value < 0) return 0
        if (value == 0) return 1
        if (mem[value] != -1) return mem[value]
        var count = 0
        for (num in nums) count += findCount(value - num)
        mem[value] = count

        return count
    }
    
    return findCount(target)
}