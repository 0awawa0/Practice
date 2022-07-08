
/*
There is a row of m houses in a small city, each house must be painted with one of the n colors (labeled from 1 to n), some houses that have been painted last summer should not be painted again.

A neighborhood is a maximal group of continuous houses that are painted with the same color.

    + For example: houses = [1,2,2,3,3,2,1,1] contains 5 neighborhoods [{1}, {2,2}, {3,3}, {2}, {1,1}].

Given an array houses, an m x n matrix cost and an integer target where:

    + houses[i]: is the color of the house i, and 0 if the house is not painted yet.
    + cost[i][j]: is the cost of paint the house i with the color j + 1.

Return the minimum cost of painting all the remaining houses in such a way that there are exactly target neighborhoods. If it is not possible, return -1.
*/

fun minCost(houses: IntArray, cost: Array<IntArray>, m: Int, n: Int, target: Int): Int {
        
    val maxCost = 1000001
    val mem = Array<Array<IntArray>>(100) { Array<IntArray>(100) { IntArray(21) { -1 } } }
    
    fun findCost(currIndex: Int, neighborhoodCount: Int, prevHouseColor: Int): Int {
        if (currIndex == houses.size) return if (neighborhoodCount == target) 0 else maxCost
        if (neighborhoodCount > target) return maxCost
        if (mem[currIndex][neighborhoodCount][prevHouseColor] != -1) return mem[currIndex][neighborhoodCount][prevHouseColor]
        
        var minCost = maxCost
        if (houses[currIndex] != 0) {
            val newNeighborhoodCount = neighborhoodCount + (if (houses[currIndex] != prevHouseColor) 1 else 0)
            minCost = findCost(currIndex + 1, newNeighborhoodCount, houses[currIndex])
        } else {
            for (color in 1 .. cost[0].size) {
                val newNeighborhoodCount = neighborhoodCount + (if (color != prevHouseColor) 1 else 0)
                val currCost = cost[currIndex][color - 1] + findCost(currIndex + 1, newNeighborhoodCount, color)
                minCost = minOf(minCost, currCost)
            }
        }
        
        mem[currIndex][neighborhoodCount][prevHouseColor] = minCost
        return minCost
    }
    
    val minCost = findCost(0, 0, 0)
    return if (minCost == maxCost) -1 else minCost
}