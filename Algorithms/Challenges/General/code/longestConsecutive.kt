
/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
*/

fun longestConsecutive(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    var max = 0
    for (num in nums) {
        if (num !in map) {
            val leftSeq = map[num - 1] ?: 0
            val rightSeq = map[num + 1] ?: 0
            val length = leftSeq + rightSeq + 1
            max = maxOf(max, length)
            map[num] = length
            map[num - leftSeq] = length
            map[num + rightSeq] = length
        }
    }
    return max
}