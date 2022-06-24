
/*
You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the following procedure :

    let x be the sum of all elements currently in your array.
    choose index i, such that 0 <= i < n and set the value of arr at index i to x.
    You may repeat this procedure as many times as needed.

Return true if it is possible to construct the target array from arr, otherwise, return false.
*/

fun isPossible(target: IntArray): Boolean {
    val queue = PriorityQueue<Int>(compareByDescending { it })
    var sum = 0L
    for (num in target) {
        sum += num.toLong()
        queue.add(num)
    }
    
    while (sum > 1 && queue.peek() > sum / 2) {
        val curr = queue.poll()
        sum -= curr.toLong()
        if (sum < 2) return sum != 0L
        queue.add((curr.toLong() % sum).toInt())
        sum += curr.toLong() % sum
    }
    
    return sum == target.size.toLong()
}