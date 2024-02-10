
/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.
*/

fun jump(nums: IntArray): Int {
    val jumps = IntArray(nums.size) { Int.MAX_VALUE }
    jumps[0] = 0
    for (i in nums.indices) {
        for (j in i .. i + nums[i]) {
            if (j > nums.lastIndex) break
            jumps[j] = minOf(jumps[j], jumps[i] + 1)
        }
    }
    return jumps.last()
}