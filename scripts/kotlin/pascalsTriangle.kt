
/*
Given an integer numRows, return the first numRows of Pascal's triangle.
*/

fun generate(numRows: Int): List<List<Int>> {
  val result = LinkedList<List<Int>>()
  result.add(listOf(1))
        
  for (i in 1 until numRows) {
    val newList = ArrayList<Int>(result.last().size + 1)
    for (j in 0 until result.last().size + 1) {
      val elem = result.last().getOrElse(j - 1) { 0 } + result.last().getOrElse(j) { 0 }
      newList.add(elem)
    }
    result.add(newList)
  }
        
  return result
}
