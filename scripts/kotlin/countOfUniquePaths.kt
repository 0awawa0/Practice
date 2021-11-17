
/*
A robot is located at the top-left corner of a m x n grid.

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid.

How many possible unique paths are there?
*/

fun uniquePaths(m: Int, n: Int): Int {
  val memory = HashMap<Pair<Int, Int>, Int>()
  return dfs(0, 0, m, n, memory)
}
    
private fun dfs(x: Int, y: Int, m: Int, n: Int, memory: HashMap<Pair<Int, Int>, Int>): Int {
  if (x >= m || y >= n) return 0
  if (x == m - 1 && y == n - 1) return 1
  if (Pair(x, y) in memory) return memory[Pair(x, y)]!!
        
  val bottom = dfs(x + 1, y, m, n, memory)
  val right = dfs(x, y + 1, m, n, memory)
  memory[Pair(x, y)] = bottom + right
        
  return bottom + right
}

// More efficient solution using combinatorics
fun uniquePaths1(m: Int, n: Int): Int {
  var N = (n + m - 2).toLong()
  val k = minOf(n - 1, m - 1).toLong()
  var result = 1L
  for (i in 1..k) {
    result = (result * N--) / i
  }
  return result.toInt()
}
