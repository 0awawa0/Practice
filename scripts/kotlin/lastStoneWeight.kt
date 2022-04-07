
/*
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

    If x == y, both stones are destroyed, and
    If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

At the end of the game, there is at most one stone left.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.
*/


fun lastStoneWeight(stones: IntArray): Int {
    val queue = PriorityQueue<Int>(compareBy { -it })
    for (stone in stones) queue.add(stone)
        
    while (queue.size > 1) {
        val s1 = queue.poll()
        val s2 = queue.poll()
        if (s1 != s2) queue.add(s1 - s2)
    }
        
    return if (queue.isEmpty()) 0 else queue.poll()
}