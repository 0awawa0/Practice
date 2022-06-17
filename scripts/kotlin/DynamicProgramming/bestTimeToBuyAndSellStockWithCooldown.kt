
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:

    After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
*/

fun maxProfit(prices: IntArray): Int {
    if (prices.size < 2) return 0
    
    var buy0 = -prices[0]
    var buy1 = buy0
    var sell2 = 0
    var sell1 = 0
    var sell0 = 0
    
    for (i in 1 until prices.size) {
        val price = prices[i]
        buy0 = maxOf(buy1, sell2 - price)
        sell0 = maxOf(sell1, buy1 + price)
        buy1 = buy0
        sell2 = sell1
        sell1 = sell0
    }
    return sell0
}