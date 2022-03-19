
/*
Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
*/

fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
  for (i in 0 .. 4) {
    if (matricesEqual(mat, target)) return true
    rotate(mat)
  }
  return false
}
    
private fun rotate(matrix: Array<IntArray>): Unit {
        
  val li = matrix.lastIndex
  for (i in 0 until matrix.size / 2) {
    for (k in i until li - i) {
      val l = i + k
      var mem = matrix[i][k]
      matrix[i][k] = matrix[li - k][i]
      matrix[li - k][i] = matrix[li - i][li - k]
      matrix[li - i][li - k] = matrix[k][li - i]
      matrix[k][li - i] = mem
    }
  }
}
    
private fun matricesEqual(mat1: Array<IntArray>, mat2: Array<IntArray>): Boolean {
  if (mat1.size != mat2.size) return false
  for (i in mat1.indices) {
    if (mat1[i].size != mat2[i].size) return false
    for (j in mat1[i].indices) {
      if (mat1[i][j] != mat2[i][j]) return false
    }
  }
  return true
}
