/*
You are given an m x n integer array grid where grid[i][j] could be:

    1 representing the starting square. There is exactly one starting square.
    2 representing the ending square. There is exactly one ending square.
    0 representing empty squares we can walk over.
    -1 representing obstacles that we cannot walk over.

Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
*/

fun uniquePaths(grid: Array<IntArray>): Int {
  var zeroesCount = 0
  var startX = 0
  var startY = 0

  // Count all squares we can step on and also find starting coordinates
  for (x in 0 until grid.size) {
    for (y in 0 until grid[x].size) {
      if (grid[x][y] == 0) zeroesCount++
      if (grid[x][y] == 1) {
        startX = x  
        startY = y
      }
    }
  }
        
  return search(startX, startY, grid, zeroesCount)
}

// Auxiliary function performin deep-first search of the finish square
private fun search(x: Int, y: Int, grid: Array<IntArray>, zeroesCount: Int): Int {

  // If we stepped out of the grid boundaries or stepped on the square we already visited - return 0
  if (x < 0 || y < 0 || x >= grid.size || y >= grid[x].size || grid[x][y] == -1) return 0
  
  // If we reached finish and we have visited all zero cells, then return 1
  // Otherwise return 0 - this path doesn't contain all zero cells
  if (grid[x][y] == 2) return if (zeroesCount < 0) 1 else 0

  // Set this cell to -1 so we don't step on it again on the path
  grid[x][y] = -1

  // Count paths from adjacent cells
  val top = search(x - 1, y, grid, zeroesCount - 1)
  val bot = search(x + 1, y, grid, zeroesCount - 1)
  val left = search(x, y - 1, grid, zeroesCount - 1)
  val right = search(x, y + 1, grid, zeroesCount - 1)

  // Set this cell back to 0 so other paths can count this cell
  grid[x][y] = 0

  return top + bot + left + right
}
