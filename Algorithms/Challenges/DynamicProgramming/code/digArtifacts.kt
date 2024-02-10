
/*
There is an n x n 0-indexed grid with some artifacts buried in it. You are given the integer n and a 0-indexed 2D integer array artifacts describing the positions of the rectangular artifacts where artifacts[i] = [r1i, c1i, r2i, c2i] denotes that the ith artifact is buried in the subgrid where:

    + (r1i, c1i) is the coordinate of the top-left cell of the ith artifact and
    + (r2i, c2i) is the coordinate of the bottom-right cell of the ith artifact.

You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.

Given a 0-indexed 2D integer array dig where dig[i] = [ri, ci] indicates that you will excavate the cell (ri, ci), return the number of artifacts that you can extract.

*/

fun digArtifacts(n: Int, artifacts: Array<IntArray>, dig: Array<IntArray>): Int {
  val matrix = Array<IntArray>(n) { IntArray(n) { -1 } }
  val partsCount = HashMap<Int, Int>()
  for (i in artifacts.indices) {
    val (x1, y1, x2, y2) = artifacts[i]
    var x = x1
    var y = y1
    var parts = 0
    while(true) {
      matrix[x++][y] = i
      parts++
      if (x > x2)
        if (y == y2) break
        else {
          x = x1
          y++
        }
    }
    partsCount[i] = parts
  }
        
  var result = 0
  for (d in dig) {
    val artifact = matrix[d[0]][d[1]]
    if (artifact >= 0) {
        partsCount[artifact] = (partsCount[artifact] ?: 0) - 1
        if (partsCount[artifact] == 0) result++
    }
  }
        
  return result
}
