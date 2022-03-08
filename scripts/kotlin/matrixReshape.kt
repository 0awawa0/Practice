
/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
*/

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
  if (r * c != mat.size * mat[0].size) return mat 
  val newArray = Array<IntArray>(r) { IntArray(c) }
  var currR = 0
  var currC = 0
  for (i in mat.indices) {
    for (j in mat[i].indices) {
      newArray[currR][currC++] = mat[i][j]
      if (currC == c) {
        currR++
        currC = 0
      }
    }
  }
  return newArray
}
