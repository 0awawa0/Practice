
/*
You are given an m x n integer matrix grid, where you can move from a cell to any adjacent cell in all 4 directions.

Return the number of strictly increasing paths in the grid such that you can start from any cell and end at any cell. Since the answer may be very large, return it modulo 109 + 7.

Two paths are considered different if they do not have exactly the same sequence of visited cells.
*/

fun countPaths(grid: Array<IntArray>): Int {
    val modulo = 1_000_000_007
    val mem = Array<LongArray>(grid.size) { LongArray(grid[it].size) { -1L }}
    
    fun dfs(i: Int, j: Int): Long {
        if (mem[i][j] != -1L) return mem[i][j]
        
        val leftPath = if (j > 0 && grid[i][j - 1] > grid[i][j]) dfs(i, j - 1) else 0L
        val rightPath = if (j < grid[i].lastIndex && grid[i][j + 1] > grid[i][j]) dfs(i, j + 1) else 0L
        
        val topPath = if (i > 0 && grid[i - 1][j] > grid[i][j]) dfs(i - 1, j) else 0L
        val bottomPath = if (i < grid.lastIndex && grid[i + 1][j] > grid[i][j]) dfs(i + 1, j) else 0L
        
        val component1 = (leftPath + rightPath) % modulo
        val component2 = (bottomPath +  topPath) % modulo
        val result = (component1 + component2 + 1L) % modulo
        
        mem[i][j] = result
        return result
    }
    
    var result = 0L
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            result = (result + dfs(i, j)) % modulo
        }
    }
    return result.toInt()
}