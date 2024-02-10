
/*
You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.

You have two robots that can collect cherries for you:

    Robot #1 is located at the top-left corner (0, 0), and
    Robot #2 is located at the top-right corner (0, cols - 1).

Return the maximum number of cherries collection using both robots by following the rules below:

    From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
    When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
    When both robots stay in the same cell, only one takes the cherries.
    Both robots cannot move outside of the grid at any moment.
    Both robots should reach the bottom row in grid.

*/

fun cherryPickup(grid: Array<IntArray>): Int {
  val mem = HashMap<Triple<Int, Int, Int>, Int>()
        
  fun dp(row: Int, col1: Int, col2: Int): Int {
    if (col1 < 0 || col1 >= grid[row].size) return 0
    if (col2 < 0 || col2 >= grid[row].size) return 0
            
    val t = Triple(row, col1, col2)
    if (mem[t] != null) return mem[t]!!
            
    var res = 0
    res += grid[row][col1]
    if (col1 != col2) res += grid[row][col2]
            
    if (row != grid.size - 1) {
      var max = 0
      for (newCol1 in col1 - 1..col1 + 1)
        for (newCol2 in col2 - 1..col2 + 1)
          max = maxOf(max, dp(row + 1, newCol1, newCol2))
                
      res += max
    }
            
    mem[t] = res
    return res
  }
        
  return dp(0, 0, grid[0].size - 1)
}
