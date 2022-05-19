
/*
Given an m x n integers matrix, return the length of the longest increasing path in matrix.

From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
*/

fun longestIncreasingPath(matrix: Array<IntArray>): Int {
    val longestPath = Array<IntArray>(matrix.size) { IntArray(matrix[it].size) { -1 } }
        
    fun dfs(x: Int, y: Int): Int {
        if (longestPath[x][y] != -1) return longestPath[x][y]
            
        val currElem = matrix[x][y]
        val topElem = if (x > 0) matrix[x - 1][y] else -1
        val botElem = if (x < matrix.lastIndex) matrix[x + 1][y] else -1
        val leftElem = if (y > 0) matrix[x][y - 1] else -1
        val rightElem = if (y < matrix[x].lastIndex) matrix[x][y + 1] else -1
            
        val topPath = if (currElem < topElem) 1 + dfs(x - 1, y) else 1
        val botPath = if (currElem < botElem) 1 + dfs(x + 1, y) else 1
        val leftPath = if (currElem < leftElem) 1 + dfs(x, y - 1) else 1
        val rightPath = if (currElem < rightElem) 1 + dfs(x, y + 1) else 1
            
        longestPath[x][y] = maxOf(maxOf(topPath, botPath), maxOf(leftPath, rightPath))
        return longestPath[x][y]
    }
        
    var result = 0
    for (i in matrix.indices)
        for (j in matrix[i].indices) 
            result = maxOf(result, dfs(i, j))
    return result
}