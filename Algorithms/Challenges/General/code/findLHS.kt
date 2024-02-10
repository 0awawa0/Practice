
/*
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
*/

fun findLHS(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    for (num in nums) map[num] = (map[num] ?: 0) + 1
    var answer = 0
    for (num in nums) if ((map[num + 1] ?: 0) > 0) answer = maxOf(answer, map[num]!! + map[num + 1]!!)
    return answer
}