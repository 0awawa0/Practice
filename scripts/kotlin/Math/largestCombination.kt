
/*
The bitwise AND of an array nums is the bitwise AND of all integers in nums.

    For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 & 5 & 3 = 1.
    Also, for nums = [7], the bitwise AND is 7.

You are given an array of positive integers candidates. Evaluate the bitwise AND of every combination of numbers of candidates. Each number in candidates may only be used once in each combination.

Return the size of the largest combination of candidates with a bitwise AND greater than 0.
*/

fun largestCombination(candidates: IntArray): Int {
    val bitsCount = IntArray(32)
    for (candidate in candidates) {
        for (i in 0 until 32) {
            if (candidate.shr(i).and(1) == 1) bitsCount[i]++
        }
    }
        
    return bitsCount.max()!!
}