
/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:
    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.

*/
fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rowSets = Array<HashSet<Char>>(board.size) { HashSet<Char>() }
    val colSets = Array<HashSet<Char>>(board.size) { HashSet<Char>() }
    val boxSize = sqrt(board.size.toDouble()).toInt()
    val boxSets = Array<Array<HashSet<Char>>>(boxSize) { 
        Array<HashSet<Char>>(boxSize) { 
            HashSet<Char>()
        }
    }
       
    for (i in 0 until board.size) {
        for (j in 0 until board[i].size) {
            val char = board[i][j]
            if (char == '.') continue
            if (char in rowSets[i]) return false
            if (char in colSets[j]) return false
            if (char in boxSets[i / boxSize][j / boxSize]) return false
            rowSets[i].add(char)
            colSets[j].add(char)
            boxSets[i / boxSize][j / boxSize].add(char)
        }
    }
        
    return true
}
