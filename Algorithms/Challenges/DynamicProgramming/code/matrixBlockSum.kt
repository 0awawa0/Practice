
/*
Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:

    + i - k <= r <= i + k,
    + j - k <= c <= j + k, and
    + (r, c) is a valid position in the matrix.

*/


fun matrixBlockSum(mat: Array<IntArray>, k: Int): Array<IntArray> {
    val mem = Array<IntArray>(mat.size + 1) { IntArray(mat[0].size + 1) }
    for (i in mat.indices) {
        for (j in mat[i].indices) {
            mem[i + 1][j + 1] = mem[i + 1][j] + mem[i][j + 1] - mem[i][j] + mat[i][j]
        }
    }
    
    val result = Array<IntArray>(mat.size) { IntArray(mat[it].size) }
    for (i in mat.indices) {
        for (j in mat[i].indices) {
            val row1 = maxOf(0, i - k)
            val row2 = minOf(mat.size, i + k + 1)
            val col1 = maxOf(0, j - k)
            val col2 = minOf(mat[i].size, j + k + 1)
            result[i][j] = mem[row2][col2] - mem[row2][col1] - mem[row1][col2] + mem[row1][col1]
        }
    }
    return result
}