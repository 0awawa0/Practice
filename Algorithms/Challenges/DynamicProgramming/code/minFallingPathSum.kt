

/*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
*/

fun minFallingPathSum(matrix: Array<IntArray>): Int {
    val mem = HashMap<Pair<Int, Int>, Int>()
    
    fun dfs(x: Int, y: Int): Int {
        if (mem[x to y] != null) return mem[x to y]!!
        if (x == matrix.lastIndex) {
            mem[x to y] = matrix[x][y]
            return mem[x to y]!!
        }
        
        val leftChild = if (y > 0) dfs(x + 1, y - 1) else Int.MAX_VALUE
        val rightChild = if (y < matrix[x].lastIndex) dfs(x + 1, y + 1) else Int.MAX_VALUE
        val bottomChild = dfs(x + 1, y)
        val min = minOf(minOf(leftChild, rightChild), bottomChild)
        mem[x to y] = matrix[x][y] + min
        return mem[x to y]!!
    }
    
    var minSum = Int.MAX_VALUE
    for (i in matrix[0].indices) minSum = minOf(minSum, dfs(0, i))
    return minSum
}