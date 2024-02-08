
/*
Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; 
in other words, it is the product of some integer with itself. 

For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
*/

fun numSquares(n: Int): Int {
    val memory = HashMap<Int, Int>()

    // Build list of perfect squares
    val perfectSquares = buildList {
        var num = 1
        while (num * num <= n) { 
            memory[num * num] = 1 // Also prepopulate the memory
            add(num * num++) 
        }
        reverse()
    }
        
    var minCount = Int.MAX_VALUE

    fun findMinCount(value: Int): Int {
        if (value == 0) return 0
        if (value in memory) return memory[value]!!

        var minCount = value
        for (square in perfectSquares) {
            if (square > value) continue

            val count = value / square + findMinCount(value % square)
            minCount = minOf(minCount, count)
        }

        memory[value] = minCount
        return minCount
    }

    return findMinCount(n)
}