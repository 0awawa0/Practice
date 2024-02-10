
/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
*/

fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
  val comparator = compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first }
  val queue = PriorityQueue<Pair<Int, Int>>(comparator)
  for (r in mat.indices) {
    var w = 0
    for (c in mat[r]) if (c != 1) break else w++
    queue.offer(Pair(r, w))
  }
        
  return IntArray(k) { queue.poll().first }
}
