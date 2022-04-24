
/*
You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. 
The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
*/


fun islandPerimeter(grid: Array<IntArray>): Int {
  var verticals = 0
  var horizontals = 0
  for (i in 0 until grid.size) {
    var prevIsWater = true
    for (j in 0 until grid[i].size) {
      if (grid[i][j] == 1) {
        if (prevIsWater) verticals += 1
        if (i == 0) horizontals++
        if (i > 0 && grid[i - 1][j] == 0) horizontals++
        if (i == grid.size - 1) horizontals++
        if (i < grid.size - 1 && grid[i + 1][j] == 0) horizontals++
        prevIsWater = false
      } else {
        if (!prevIsWater) verticals += 1
        prevIsWater = true
      }
    }
    if (!prevIsWater) verticals++
  }
  return verticals + horizontals
}
