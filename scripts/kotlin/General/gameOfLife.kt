
/*
The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

    Any live cell with fewer than two live neighbors dies as if caused by under-population.
    Any live cell with two or three live neighbors lives on to the next generation.
    Any live cell with more than three live neighbors dies, as if by over-population.
    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
*/

fun gameOfLife(board: Array<IntArray>): Unit {
    val oneIndicator = -1
    val zeroIndicator = 2
        
    fun checkAlive(x: Int, y: Int): Boolean {
        if (x < 0 || y < 0 || x >= board.size || y >= board[x].size) return false
        return board[x][y] == 1 || board[x][y] == oneIndicator
    }
        
        
        
    for (x in board.indices) {
        for (y in board[x].indices) {
            var aliveNeighbors = 0
                
            if (checkAlive(x - 1, y - 1)) aliveNeighbors++
            if (checkAlive(x - 1, y)) aliveNeighbors++
            if (checkAlive(x - 1, y + 1)) aliveNeighbors++
                
            if (checkAlive(x, y - 1)) aliveNeighbors++
            if (checkAlive(x, y + 1)) aliveNeighbors++
                
            if (checkAlive(x + 1, y - 1)) aliveNeighbors++
            if (checkAlive(x + 1, y)) aliveNeighbors++
            if (checkAlive(x + 1, y + 1)) aliveNeighbors++
                
            if (board[x][y] == 0) {
                if (aliveNeighbors == 3) board[x][y] = zeroIndicator
            } else {
                if (aliveNeighbors > 3 || aliveNeighbors < 2) board[x][y] = oneIndicator
            }
        }
    }
        
    for (x in board.indices) {
        for (y in board[x].indices) {
            if (board[x][y] == oneIndicator) board[x][y] = 0
            if (board[x][y] == zeroIndicator) board[x][y] = 1
        }
    }
}