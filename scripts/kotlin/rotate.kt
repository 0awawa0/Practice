
/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/


fun rotate(matrix: Array<IntArray>): Unit {      
  val li = matrix.lastIndex
  for (i in 0 until matrix.size / 2) {
    for (k in i until li - i) {
      val mem = matrix[i][k]
      matrix[i][k] = matrix[li - k][i]
      matrix[li - k][i] = matrix[li - i][li - k]
      matrix[li - i][li - k] = matrix[k][li - i]
      matrix[k][li - i] = mem
    }
  }
}
