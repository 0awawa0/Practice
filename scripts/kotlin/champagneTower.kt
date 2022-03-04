
/*
We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.  Each glass holds one cup of champagne.

Then, some champagne is poured into the first glass at the top.  When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately to the left and right of it.  When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.  (A glass at the bottom row has its excess champagne fall on the floor.)

For example, after one cup of champagne is poured, the top most glass is full.  After two cups of champagne are poured, the two glasses on the second row are half full.  After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.  After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.
Now after pouring some non-negative integer cups of champagne, return how full the jth glass in the ith row is (both i and j are 0-indexed.)
*/

fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
  val firstRow = DoubleArray(100)
  val secondRow = DoubleArray(100)
        
  firstRow[0] = poured.toDouble()
  for (row in 1 .. query_row) {
    for (glass in 0 until row + 1) {
      if (row % 2 != 0) {
        secondRow[glass] = 0.0
        val prevGlass1 = firstRow.getOrNull(glass - 1)?.minus(1.0)?.div(2.0) ?: 0.0
        val prevGlass2 = (firstRow[glass] - 1.0) / 2.0
        if (prevGlass1 > 0.0) secondRow[glass] += prevGlass1
        if (prevGlass2 > 0.0) secondRow[glass] += prevGlass2
      } else {
        firstRow[glass] = 0.0
        val prevGlass1 = secondRow.getOrNull(glass - 1)?.minus(1.0)?.div(2.0) ?: 0.0
        val prevGlass2 = (secondRow[glass] - 1.0) / 2.0
        if (prevGlass1 > 0.0) firstRow[glass] += prevGlass1
        if (prevGlass2 > 0.0) firstRow[glass] += prevGlass2
      }
    }
  }
        
  if (query_row % 2 == 1) return minOf(1.0, secondRow[query_glass])
  else return minOf(1.0, firstRow[query_glass])
}
