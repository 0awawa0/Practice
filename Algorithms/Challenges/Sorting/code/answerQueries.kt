
/*
You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
*/

fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
    nums.sort()
    val result = IntArray(queries.size)
    outerLoop@for (i in queries.indices) {
        var sum = 0
        for (j in nums.indices) {
            sum += nums[j]
            if (sum > queries[i]) {
                result[i] = j
                continue@outerLoop
            }
        }
        result[i] = nums.size
    }
    return result
}