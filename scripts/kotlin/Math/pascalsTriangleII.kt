
/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
*/

fun getRow(rowIndex: Int): List<Int> {
  var prevRow = listOf(1)
  for (i in 0 until rowIndex) {
    val newRow = ArrayList<Int>(prevRow.size + 1)
    for (j in 0 until prevRow.size + 1) {
      newRow.add(
        prevRow.getOrElse(j - 1) { 0 } + prevRow.getOrElse(j) { 0 }
      )
    }
    prevRow = newRow
  }
  return prevRow
}
