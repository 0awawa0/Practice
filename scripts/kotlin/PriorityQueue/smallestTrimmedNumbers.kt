
/*
You are given a 0-indexed array of strings nums, where each string is of equal length and consists of only digits.

You are also given a 0-indexed 2D integer array queries where queries[i] = [ki, trimi]. For each queries[i], you need to:

    + Trim each number in nums to its rightmost trimi digits.
    + Determine the index of the kith smallest trimmed number in nums. If two trimmed numbers are equal, the number with the lower index is considered to be smaller.
    + Reset each number in nums to its original length.

Return an array answer of the same length as queries, where answer[i] is the answer to the ith query.

Note:

    + To trim to the rightmost x digits means to keep removing the leftmost digit, until only x digits remain.
    + Strings in nums may contain leading zeros.


*/


fun smallestTrimmedNumbers(nums: Array<String>, queries: Array<IntArray>): IntArray {
    val result = IntArray(queries.size)
    for (i in queries.indices) {
        val query = queries[i]
        val newArray = nums.map { it.substring(it.length - query[1]) }
        val queue = PriorityQueue<Int>(compareBy<Int> { newArray[it] }.thenBy { it })
        for (idx in newArray.indices) queue.add(idx)
        repeat(query[0] - 1) { queue.poll() }
        result[i] = queue.poll()
    }
    
    return result
}