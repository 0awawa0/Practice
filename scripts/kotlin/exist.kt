
/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
*/

fun exist(board: Array<CharArray>, word: String): Boolean {
        
    val visited = Array<BooleanArray>(board.size) { BooleanArray(board[it].size) }
        
    fun search(x: Int, y: Int, wordIndex: Int): Boolean {
        if (wordIndex == word.length) return true
        if (x < 0 || x >= board.size) return false
        if (y < 0 || y >= board[x].size) return false
        if (visited[x][y]) return false
        if (board[x][y] != word[wordIndex]) return false
            
        visited[x][y] = true
        if (search(x - 1, y, wordIndex + 1) || search(x + 1, y, wordIndex + 1) || search(x, y - 1, wordIndex + 1) || search(x, y + 1, wordIndex + 1)) return true
        visited[x][y] = false
            
        return false
    }
        
    for (x in board.indices) {
        for (y in board[x].indices) {
            if (search(x, y, 0)) return true
        }
    }
        
    return false
}