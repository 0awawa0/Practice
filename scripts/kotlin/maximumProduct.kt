
/*
You are given an array of non-negative integers nums and an integer k. In one operation, you may choose any element from nums and increment it by 1.

Return the maximum product of nums after at most k operations. Since the answer may be very large, return it modulo 10^9 + 7.
*/

fun maximumProduct(nums: IntArray, k: Int): Int {
    val queue = PriorityQueue<Int>()
    for (num in nums) queue.add(num)
        
    repeat(k) { queue.add(queue.poll() + 1) }
        
    var prod = queue.poll().toLong()
    while (queue.isNotEmpty()) prod = (prod * queue.poll().toLong()) % 1_000_000_007L
    return prod.toInt()
}