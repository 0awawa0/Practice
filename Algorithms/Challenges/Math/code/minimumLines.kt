
/*
You are given a 2D integer array stockPrices where stockPrices[i] = [dayi, pricei] indicates the price of the stock on day dayi is pricei. A line chart is created from the array by plotting the points on an XY plane with the X-axis representing the day and the Y-axis representing the price and connecting adjacent points. Return the minimum number of lines needed to represent the line chart.
*/

fun minimumLines(stockPrices: Array<IntArray>): Int {
    if (stockPrices.size < 2) return 0
    stockPrices.sortBy { it[0] }
        
    var count = 1
    for (i in 2 until stockPrices.size) {
        val (x1, y1) = stockPrices[i - 2]
        val (x2, y2) = stockPrices[i - 1]
        val (x3, y3) = stockPrices[i]
            
        if ((y1 - y2) * (x1 - x3) - (y1 - y3) * (x1 - x2) != 0) count++
    }
    return count
}