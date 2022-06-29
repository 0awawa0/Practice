

/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.

You may assume that you have an infinite number of each kind of coin.

The answer is guaranteed to fit into a signed 32-bit integer.
*/

fun change(amount: Int, coins: IntArray): Int {
    val mem = Array<IntArray>(coins.size) { IntArray(amount + 1) { -1 }}
    
    fun findCount(target: Int, idx: Int): Int {
        if (target < 0 || idx >= coins.size) return 0
        if (target == 0) return 1
        if (mem[idx][target] != -1) return mem[idx][target]
        
        val includeCount = findCount(target - coins[idx], idx)
        val excludeCount = findCount(target, idx + 1)
        mem[idx][target] = includeCount + excludeCount
        
        return mem[idx][target]
    }
    
    return findCount(amount, 0)
}