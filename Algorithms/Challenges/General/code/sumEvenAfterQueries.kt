
/*
You are given an integer array nums and an array queries where queries[i] = [vali, indexi].

For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.

Return an integer array answer where answer[i] is the answer to the ith query.
*/

fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
    var sumEven = nums.fold(0) { acc, num -> if (num % 2 == 0) acc + num else acc }
    return IntArray(queries.size) {
        val (value, index) = queries[it]
        if (nums[index] % 2 == 0) sumEven -= nums[index]
        nums[index] += value
        if (nums[index] % 2 == 0) sumEven += nums[index]
        sumEven
    }
}