
/*
You are given an integer array nums that is sorted in non-decreasing order.

Determine if it is possible to split nums into one or more subsequences such that both of the following conditions are true:

    Each subsequence is a consecutive increasing sequence (i.e. each integer is exactly one more than the previous integer).
    All subsequences have a length of 3 or more.

Return true if you can split nums according to the above conditions, or false otherwise.

A subsequence of an array is a new array that is formed from the original array by deleting some (can be none) of the elements without disturbing the relative positions of the remaining elements. (i.e., [1,3,5] is a subsequence of [1,2,3,4,5] while [1,3,2] is not).
*/

fun isPossible(nums: IntArray): Boolean {
    val freqs = HashMap<Int, Int>()
    nums.forEach { freqs[it] = (freqs[it] ?: 0) + 1 }
    
    val tails = HashMap<Int, Int>()
    for (num in nums) {
        if (freqs[num]!! == 0) continue
        
        if ((tails[num - 1] ?: 0) > 0) {
            tails[num - 1] = (tails[num - 1] ?: 1) - 1
            tails[num] = (tails[num] ?: 0) + 1
            freqs[num] = (freqs[num] ?: 1) - 1
        } else {
            if ((freqs[num + 1] ?: 0) > 0 && (freqs[num + 2] ?: 0) > 0) {
                freqs[num + 1] = (freqs[num + 1] ?: 1) - 1
                freqs[num + 2] = (freqs[num + 2] ?: 1) - 1
                freqs[num] = (freqs[num] ?: 1) -1
                tails[num + 2] = (tails[num + 2] ?: 0) + 1
            } else return  false
        }
    }
    
    return true
}