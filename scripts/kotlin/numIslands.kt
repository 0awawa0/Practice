
/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/


fun numIslands(grid: Array<CharArray>): Int {
        
    val visited = Array<BooleanArray>(grid.size) { BooleanArray(grid[it].size) { false } }
    fun traverseIsland(x: Int, y: Int) {
        if (visited[x][y] == true) return
        visited[x][y] = true
            
        val top = x - 1
        val bot = x + 1
        val left = y - 1
        val right = y + 1
        if (top >= 0 && grid[top][y] == '1') traverseIsland(top, y)
        if (bot < grid.size && grid[bot][y] == '1') traverseIsland(bot, y)
        if (left >= 0 && grid[x][left] == '1') traverseIsland(x, left)
        if (right < grid[x].size && grid[x][right] == '1') traverseIsland(x, right)
    }
        
    var count = 0
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (visited[i][j]) continue
            if (grid[i][j] == '1') {
                count++
                traverseIsland(i, j)
            }
        }
    }
        
    return count
}