
/*
You are given a 0-indexed integer array nums and an integer k.

You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.

You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.

Return the maximum score you can get.
*/

fun maxResult(nums: IntArray, k: Int): Int {
    val mem = IntArray(nums.size) { nums[it] }
    val queue = LinkedList<Int>()
    queue.add(nums.lastIndex)
    for (i in nums.lastIndex - 1 downTo 0) {
        if (queue.first() - i > k) queue.removeFirst()
        mem[i] += mem[queue.first()]
        while (queue.isNotEmpty() && mem[queue.last()] <= mem[i]) queue.removeLast()
        queue.addLast(i)
    }
    return mem[0]
}