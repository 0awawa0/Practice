
/*
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) 
You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.
*/

fun islandArea(
    grid: Array<IntArray>, 
    startRow: Int, 
    startCol: Int, 
    visited: Array<BooleanArray>
): Int {
    if (grid[startRow][startCol] == 0) return 0
        
    var area = 0
    if (!visited[startRow][startCol]) {
        area++
        visited[startRow][startCol] = true
    } else {
        return 0
    }
        
    val topRow = startRow - 1
    val bottomRow = startRow + 1
    val leftCol = startCol - 1
    val rightCol = startCol + 1
        
    area += if (topRow >= 0) islandArea(grid, topRow, startCol, visited) else 0
    area += if (bottomRow < grid.size) islandArea(grid, bottomRow, startCol, visited) else 0
    area += if (leftCol >= 0) islandArea(grid, startRow, leftCol, visited) else 0
    area += if (rightCol < grid[startRow].size) islandArea(grid, startRow, rightCol, visited) else 0
    return area
}
    
fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    val visited = Array<BooleanArray>(grid.size) { BooleanArray(grid[it].size) }
    var maxArea = 0
    for (i in 0 until grid.size) {
        for (j in 0 until grid[i].size) {
            maxArea = maxOf(maxArea, islandArea(grid, i, j, visited))
        }
    }
    return maxArea
}
