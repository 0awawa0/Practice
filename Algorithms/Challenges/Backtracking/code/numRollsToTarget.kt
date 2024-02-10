

/*
You have n dice and each die has k faces numbered from 1 to k.

Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 10^9 + 7.
*/

fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
    val mem = HashMap<Pair<Int, Int>, Int>()
    val modulus = 1_000_000_007
    fun backtrack(currentValue: Int, diceLeft: Int): Int {
        if (diceLeft == 0) {
            if (currentValue == target) return 1
            return 0
        }
        
        if (mem[currentValue to diceLeft] != null) return mem[currentValue to diceLeft]!!
        
        var count = 0
        for (i in 1..k) count = (count + backtrack(currentValue + i, diceLeft - 1)) % modulus
        
        mem[currentValue to diceLeft] = count
        return count
    }
    
    return backtrack(0, n)
}