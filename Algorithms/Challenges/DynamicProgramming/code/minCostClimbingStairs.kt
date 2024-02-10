
/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.
*/

fun minCostClimbingStairs(cost: IntArray): Int {
    val minCosts = IntArray(cost.size + 1) { 0 }
    for (i in 2 until minCosts.size) 
        minCosts[i] = minOf(cost[i - 1] + minCosts[i - 1], cost[i - 2] + minCosts[i - 2])
    return minCosts.last()
}