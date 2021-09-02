/*
You are given an m x n grid where each cell can have one of three values:

    0 representing an empty cell,
    1 representing a fresh orange, or
    2 representing a rotten orange.

Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
*/

fun orangesRotting(grid: Array<IntArray>): Int {
        
    val emptyCell = -1
    val freshCell = Int.MAX_VALUE - 2
    val queue = LinkedList<Pair<Int, Int>>()
    var totalOranges = 0
        
    val timesToRot = Array<IntArray>(grid.size) { i ->
        IntArray(grid[i].size) { j ->
            when (grid[i][j]) {
                0 -> emptyCell
                1 -> {
                    totalOranges++
                    freshCell
                }
                else -> {
                    totalOranges++
                    queue.addFirst(Pair(i, j))
                    0
                }
            }
        }
    }
        
    var maxTimeToRot = 0
    while (queue.isNotEmpty()) {
        val coordinates = queue.removeLast()
        val x = coordinates.first
        val y = coordinates.second
            
        val top = x - 1
        val left = y - 1
        val bottom = x + 1
        val right = y + 1
        totalOranges--
        maxTimeToRot = maxOf(timesToRot[x][y], maxTimeToRot)
            
        if (top >= 0 && timesToRot[top][y] > timesToRot[x][y] + 1) {
            timesToRot[top][y] = timesToRot[x][y] + 1
            queue.addFirst(Pair(top, y))
        }
            
        if (left >= 0 && timesToRot[x][left] > timesToRot[x][y] + 1) {
            timesToRot[x][left] = timesToRot[x][y] + 1
            queue.addFirst(Pair(x, left))
        }
            
        if (bottom < grid.size && timesToRot[bottom][y] > timesToRot[x][y] + 1) {
            timesToRot[bottom][y] = timesToRot[x][y] + 1
            queue.addFirst(Pair(bottom, y))
        }
            
        if (right < grid[x].size && timesToRot[x][right] > timesToRot[x][y] + 1) {
            timesToRot[x][right] = timesToRot[x][y] + 1
            queue.addFirst(Pair(x, right))
        }
    }
        
        
    return if (totalOranges <= 0) maxTimeToRot else -1
}
