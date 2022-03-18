
/*
You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.

The right interval for an interval i is an interval j such that startj >= endi and startj is minimized.

Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.
*/

fun findRightInterval(intervals: Array<IntArray>): IntArray {
  val treeMap = TreeMap<Int, Int>()
  for (i in intervals.indices) treeMap[intervals[i][0]] = i
  val result = IntArray(intervals.size) { -1 }
  for (i in intervals.indices) {
    val interval = treeMap.ceilingEntry(intervals[i][1]) ?: continue
    result[i] = interval.value
  }
        
  return result
}
