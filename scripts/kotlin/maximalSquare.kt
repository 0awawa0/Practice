
/*
Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
*/

fun maximalSquare(matrix: Array<CharArray>): Int {
  val result = Array<IntArray>(matrix.size) { IntArray(matrix[it].size) }
  var maxSide = 0
        
  for (i in 0 until matrix.size) {
    for (j in 0 until matrix[i].size) {
      if (matrix[i][j] == '1') {
        val top = if (i > 0) result[i - 1][j] else 0
        val left = if (j > 0) result[i][j - 1] else 0
        val topLeft = if (i > 0 && j > 0) result[i - 1][j - 1] else 0
        result[i][j] = minOf(topLeft, minOf(top, left)) + 1
        maxSide = maxOf(maxSide, result[i][j])
      }
    }
  }
        
  return maxSide * maxSide
}
