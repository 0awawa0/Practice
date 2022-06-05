
/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.
*/

fun totalNQueens(n: Int): Int {
    var count = 0
    val matrix = Array<BooleanArray>(n) { BooleanArray(n) }
        
    fun canPlaceQueen(x: Int, y: Int): Boolean {
        for (r in matrix.indices) {
            for (c in matrix[r].indices) {
                if (matrix[r][c])
                    if (y == c || (x - r) == abs(y - c)) return false
            }
        }
        return true
    }
        
    fun backtrack(x: Int) {
        if (x == n) {
            count++
            return
        }
            
        for (y in matrix[x].indices) {
            if (canPlaceQueen(x, y)) {
                matrix[x][y] = true
                backtrack(x + 1)
                matrix[x][y] = false
            }
        }
    }
        
    backtrack(0)
    return count
}