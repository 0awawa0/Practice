
/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.
*/

fun coinChange(coins: IntArray, amount: Int): Int {
    coins.sortDescending()
    val mem = HashMap<Int, Int>()
        
    fun findCount(target: Int): Int {
        if (target < 0) return -1
        if (target == 0) return 0
        if (target in mem) return mem[target]!!
            
        var minCount = Int.MAX_VALUE
            
        for (coin in coins) {
            val remCount = findCount(target - coin)
            if (remCount >= 0 && minCount > remCount) minCount = remCount + 1
        }
        
        mem[target] = if (minCount == Int.MAX_VALUE) -1 else minCount
        return mem[target]!!
    }   
        
    return findCount(amount)
}