
/*
You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.

A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.

Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
*/


fun minimumEffortPath(heights: Array<IntArray>): Int {
        
    val directions = arrayOf(Pair(0, 1), Pair(1, 0), Pair(0, -1), Pair(-1, 0))
    val rows = heights.size
    val cols = heights[0].size
        
    val efforts = Array<IntArray>(rows) { 
        x -> IntArray(cols) { 
            y -> if (x == 0 && y == 0) 0 else Int.MAX_VALUE 
        }
    }
        
    val queue = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third })
    queue.add(Triple(0, 0, 0))
        
    while (queue.isNotEmpty()) {
        val (x, y, effort) = queue.poll()
            
        if (x == rows - 1 && y == cols - 1) return effort
            
        for (direction in directions) {
            val nextX = x + direction.first
            val nextY = y + direction.second
            if (nextX !in 0 until rows || nextY !in 0 until cols) continue
                
            val nextEffort = maxOf(effort, abs(heights[x][y] - heights[nextX][nextY]))
            if (efforts[nextX][nextY] > nextEffort) {
                efforts[nextX][nextY] = nextEffort
                queue.add(Triple(nextX, nextY, nextEffort))
            }
        }
    }
        
    return 0
}