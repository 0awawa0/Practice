
/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
*/

fun solveNQueens(n: Int): List<List<String>> {
    val result = LinkedList<List<String>>()
    val matrix = Array<CharArray>(n) { CharArray(n) { '.' }}
        
    fun canPlaceQueen(x: Int, y: Int): Boolean {
            
        for (r in 0 until x) {
            for (c in matrix[r].indices) {
                if (matrix[r][c] == 'Q') {
                    if (c == y || x - r == abs(y - c)) return false
                }
            }
        }
        return true
    }
        
    fun backtrack(x: Int) {
        if (x == matrix.size) {
            val answer = LinkedList<String>()
            for (row in matrix) answer.add(String(row))
            result.add(answer)
            return
        }
            
        for (y in matrix[x].indices) {
            matrix[x][y] = 'Q'
            if (canPlaceQueen(x, y)) backtrack(x + 1)
            matrix[x][y] = '.'
        }
    }
        
    backtrack(0)
        
    return result
}