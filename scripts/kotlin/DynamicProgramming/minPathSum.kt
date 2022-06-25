
/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
*/


fun minPathSum(grid: Array<IntArray>): Int {
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            val topPath = if (i == 0) Int.MAX_VALUE else grid[i - 1][j]
            val leftPath = if (j == 0) Int.MAX_VALUE else grid[i][j - 1]
            if (topPath == Int.MAX_VALUE && leftPath == Int.MAX_VALUE) continue
            
            grid[i][j] = grid[i][j] + minOf(topPath, leftPath)
        }
    }
    
    return grid.last().last()
}