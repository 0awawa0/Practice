
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
*/

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freqs = HashMap<Int, Int>()
    for (num in nums) freqs[num] = (freqs[num] ?: 0) + 1
        
    val queue = PriorityQueue<Pair<Int, Int>>(compareBy { -it.second })
    for (freq in freqs) queue.add(Pair(freq.key, freq.value))
        
    val result = IntArray(minOf(nums.size, k))
    for (i in result.indices) result[i] = queue.poll().first
        
    return result
}