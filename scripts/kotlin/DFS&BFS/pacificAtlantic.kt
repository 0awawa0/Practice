
/*
There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.

The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.

Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
*/

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
    val reachedPacific = HashSet<List<Int>>()
    val reachedAtlantic = HashSet<List<Int>>()
    
    fun dfs(x: Int, y: Int, prevHeight: Int, currSet: HashSet<List<Int>>) {
        if (x < 0 || x > heights.lastIndex) return
        if (y < 0 || y > heights[x].lastIndex) return
        if (prevHeight > heights[x][y]) return
        if (listOf(x, y) in currSet) return
        
        currSet.add(listOf(x, y))
        dfs(x - 1, y, heights[x][y], currSet)
        dfs(x, y - 1, heights[x][y], currSet)
        dfs(x + 1, y, heights[x][y], currSet)
        dfs(x, y + 1, heights[x][y], currSet)
    }

    for (x in heights.indices) {
        dfs(x, 0, 0, reachedPacific)
        dfs(x, heights[x].lastIndex, 0, reachedAtlantic)
    }
    
    for (y in heights[0].indices) {
        dfs(0, y, 0, reachedPacific)
        dfs(heights.lastIndex, y, 0, reachedAtlantic)
    }
    
    return reachedPacific.intersect(reachedAtlantic).toList()
}