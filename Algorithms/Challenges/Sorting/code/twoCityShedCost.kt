
/*
A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti], the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.

Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
*/

fun twoCitySchedCost(costs: Array<IntArray>): Int {
  costs.sortBy { it[0] - it[1] }
  var totalCost = 0
  for (i in 0 until costs.size / 2) totalCost += costs[i][0] + costs[i + costs.size / 2][1]    
  return totalCost
}
