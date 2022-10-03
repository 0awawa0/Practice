
/*
You are given an m x n integer matrix grid. Return the maximum sum of the elements of an hourglass.

Note that an hourglass cannot be rotated and must be entirely contained within the matrix.
*/


fun maxSum(grid: Array<IntArray>): Int {
    var maxSum = Int.MIN_VALUE
    for (x in 1 until grid.lastIndex) {
        for (y in 1 until grid[x].lastIndex) {
            maxSum = maxOf(
                grid[x - 1][y - 1] + grid[x - 1][y] + grid[x - 1][y + 1] + grid[x][y] + grid[x + 1][y - 1] + grid[x + 1][y] + grid[x + 1][y + 1],
                maxSum
            )
        }
    }
    return maxSum
}