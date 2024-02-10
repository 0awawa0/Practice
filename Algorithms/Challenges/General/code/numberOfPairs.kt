
/*
You are given a 0-indexed integer array nums. In one operation, you may do the following:

    + Choose two integers in nums that are equal.
    + Remove both integers from nums, forming a pair.

The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
*/


fun numberOfPairs(nums: IntArray): IntArray {
    val freqs = HashMap<Int, Int>()
    for (num in nums) freqs[num] = (freqs[num] ?: 0) + 1
    var pairs = 0
    var leftover = 0
    for (node in freqs) {
        val (key, value) = node
        pairs += value / 2
        leftover += value % 2
    }
    return intArrayOf(pairs, leftover)
}