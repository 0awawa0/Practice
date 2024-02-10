
/*
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times. Return the 2D grid after applying shift operation k times.

In one shift operation:

    Element at grid[i][j] moves to grid[i][j + 1].
    Element at grid[i][n - 1] moves to grid[i + 1][0].
    Element at grid[m - 1][n - 1] moves to grid[0][0].
*/


fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        
    val result = ArrayList<ArrayList<Int>>()
    for (i in grid.indices) {
        val list = ArrayList<Int>()
        for (j in grid[i].indices) list.add(grid[i][j])
        result.add(list)
    }
        
    val mod = grid.size * grid[0].size
    var writeIndex = k % mod
    var readIndex = 0
        
    do {
        val readRow = readIndex / grid[0].size
        val readCol = readIndex % grid[0].size
        val writeRow = writeIndex / grid[0].size
        val writeCol = writeIndex % grid[0].size
            
        result[writeRow][writeCol] = grid[readRow][readCol]
        writeIndex = (writeIndex + 1) % mod
        readIndex = (readIndex + 1) % mod
    } while (readIndex != 0)
        
    return result
}