
/*
You are given two positive integers startPos and endPos. Initially, you are standing at position startPos on an infinite number line. With one step, you can move either one position to the left, or one position to the right.

Given a positive integer k, return the number of different ways to reach the position endPos starting from startPos, such that you perform exactly k steps. Since the answer may be very large, return it modulo 109 + 7.

Two ways are considered different if the order of the steps made is not exactly the same.

Note that the number line includes negative integers.
*/

fun numberOfWays(startPos: Int, endPos: Int, k: Int): Int {
    val mod = 1_000_000_007
    val mem = HashMap<Pair<Int, Int>, Int>()
    fun backtrack(position: Int, stepsLeft: Int): Int {
        if (abs(position - endPos) > stepsLeft) return 0
        if (position == endPos && stepsLeft == 0) return 1
        if (mem[position to stepsLeft] != null) return mem[position to stepsLeft]!!
        
        var count = 0
        count = (count + backtrack(position + 1, stepsLeft - 1)) % mod
        count = (count + backtrack(position - 1, stepsLeft - 1)) % mod
        mem[position to stepsLeft] = count
        return count
    }
    
    return backtrack(startPos, k)
}