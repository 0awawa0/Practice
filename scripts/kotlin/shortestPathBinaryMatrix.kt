
/*
Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.

A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:

    All the visited cells of the path are 0.
    All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner).

The length of a clear path is the number of visited cells of this path.
*/

fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
    if (grid[0][0] == 1 || grid[grid.size - 1][grid.size - 1] == 1) return -1
    val visited = Array<BooleanArray>(grid.size) { BooleanArray(grid[it].size) }
    val queue = LinkedList<Triple<Int, Int, Int>>()
        
    var minPath = -1
        
    queue.add(Triple(0, 0, 1))
    while (queue.isNotEmpty()) {
        val (x, y, currPath) = queue.poll()
            
        // Out of bounds
        if (x < 0 || x > grid.lastIndex) continue
        if (y < 0 || y > grid.lastIndex) continue
            
        // Blocked path or visited already
        if (grid[x][y] == 1) continue
        if (visited[x][y]) continue
            
        // Reached end
        if (x == grid.lastIndex && y == grid[x].lastIndex) {
            if (minPath == -1) minPath = currPath
            else minPath = minOf(minPath, currPath)
        }
            
        visited[x][y] = true
            
        queue.add(Triple(x - 1, y - 1, currPath + 1))
        queue.add(Triple(x - 1, y, currPath + 1))
        queue.add(Triple(x - 1, y + 1, currPath + 1))
        queue.add(Triple(x, y - 1, currPath + 1))
        queue.add(Triple(x, y + 1, currPath + 1))
        queue.add(Triple(x + 1, y - 1, currPath + 1))
        queue.add(Triple(x + 1, y, currPath + 1))
        queue.add(Triple(x + 1, y + 1, currPath + 1))
    }
        
    return minPath
}