
/*
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.

Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 10^9 + 7.
*/

fun findPaths(m: Int, n: Int, maxMove: Int, startRow: Int, startColumn: Int): Int {
    val modulo = 1_000_000_007
    val mem = HashMap<Triple<Int, Int, Int>, Int>()
    fun dfs(x: Int, y: Int, moves: Int): Int {
        if (x < 0 || x >= m) return 1
        if (y < 0 || y >= n) return 1
        if (moves == 0) return 0
        
        val triple = Triple(x, y, moves)
        if (mem[triple] != null) return mem[triple]!!
        
        val left = dfs(x, y - 1, moves - 1)
        val right = dfs(x, y + 1, moves - 1)
        val top = dfs(x - 1, y, moves - 1)
        val bottom = dfs(x + 1, y, moves - 1)
        
        mem[triple] = (((left + right) % modulo) +  ((top + bottom) % modulo)) % modulo
        return mem[triple]!!
    }
    
    return dfs(startRow, startColumn, maxMove)
}