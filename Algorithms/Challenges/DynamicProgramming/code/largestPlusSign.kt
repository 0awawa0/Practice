
/*
You are given an integer n. 
You have an n x n binary grid grid with all values initially 1's except for some indices given in the array mines. 
The ith element of the array mines is defined as mines[i] = [xi, yi] where grid[xi][yi] == 0.

Return the order of the largest axis-aligned plus sign of 1's contained in grid. If there is none, return 0.

An axis-aligned plus sign of 1's of order k has some 
center grid[r][c] == 1 along with four arms of length k - 1 going up, down, left, and right, and made of 1's.
Note that there could be 0's or 1's beyond the arms of the plus sign, only the relevant area of the plus sign is checked for 1's.
*/

fun orderOfLargestPlusSign(n: Int, mines: Array<IntArray>): Int {
        
  // Setup initial state
  // This matrix stores minimum vertical and horizontal pathes to zero
  val minPathes = Array<Array<IntArray>>(n) {
    Array<IntArray>(n) { intArrayOf(Int.MAX_VALUE - 2, Int.MAX_VALUE - 2) }
  }
        
  // Place zeroes to the matrix
  for (mine in mines) {
    minPathes[mine[0]][mine[1]][0] = 0
    minPathes[mine[0]][mine[1]][1] = 0
  }
        
  // Walk through the grid forward from left to right and from top to bottom.
  // For each cell set minimum left path and minimum top path.
  // So if we at cell (1, 2) we would look up at cell (0, 2) and left
  // at cell (1, 1) to find out minimum top and left pathes to zero
  for (i in 0 until n) {
    for (j in 0 until n) {
    // Find out top path to zero which is top path of the top cell + 1, 
    // or 1 if there is no top cell
    val topPath = if (i > 0) minPathes[i - 1][j][0] + 1 else 1
                
    // Same for the left path
    val leftPath = if(j > 0) minPathes[i][j - 1][1] + 1 else 1
                
    // Now set minimum top and left pathes for current cell
    minPathes[i][j][0] = minOf(minPathes[i][j][0], topPath)
    minPathes[i][j][1] = minOf(minPathes[i][j][1], leftPath)
    }
  }
        
  var maxPath = 0
        
  // Now walk back through grid from right to left and from bottom to top.
  // Here we will find minimum right and bottom pathes to zeroes for each cell.
  // And as we already know left and top pathes, we can actually calculate maximum
  // vertical and horizontal pathes to zero and find out maximal plus sign order for
  // current cell. We track maximum plus sign order walking through the grid 
  // and return this value after all
  for (i in n - 1 downTo 0) {
    for (j in n - 1 downTo 0) {
      val bottomPath = if (i < n - 1) minPathes[i + 1][j][0] + 1 else 1
      val rightPath = if (j < n - 1) minPathes[i][j + 1][1] + 1 else 1
                
      minPathes[i][j][0] = minOf(minPathes[i][j][0], bottomPath)
      minPathes[i][j][1] = minOf(minPathes[i][j][1], rightPath)
      maxPath = maxOf(minPathes[i][j].min() ?: 0, maxPath)
    }
  }

  return maxPath
}
