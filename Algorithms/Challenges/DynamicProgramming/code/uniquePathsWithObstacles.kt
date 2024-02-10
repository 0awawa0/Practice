
/*
You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m-1][n-1]). The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
*/

fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
    val counts = Array<IntArray>(obstacleGrid.size) { IntArray(obstacleGrid[it].size) }
        
    for (x in obstacleGrid.indices) {
        for (y in obstacleGrid[x].indices) {
            when {
                obstacleGrid[x][y] == 1 -> counts[x][y] = 0
                x == 0 && y == 0 -> counts[x][y] = 1
                else -> {
                    val top = if (x > 0) counts[x - 1][y] else 0
                    val left = if (y > 0) counts[x][y - 1] else 0
                    counts[x][y] = top + left
                }
            }
        }
    }
        
    return counts.last().last()
}