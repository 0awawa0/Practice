
/*
You have n computers. You are given the integer n and a 0-indexed integer array batteries where the ith battery can run a computer for batteries[i] minutes. You are interested in running all n computers simultaneously using the given batteries.

Initially, you can insert at most one battery into each computer. After that and at any integer time moment, you can remove a battery from a computer and insert another battery any number of times. The inserted battery can be a totally new battery or a battery from another computer. You may assume that the removing and inserting processes take no time.

Note that the batteries cannot be recharged.

Return the maximum number of minutes you can run all the n computers simultaneously.
*/

fun maxRunTime(n: Int, batteries: IntArray): Long {
  batteries.sort()
  var s = 0L
  for (b in batteries) s += b

  var k = 0
  while (batteries[batteries.lastIndex - k] > s / (n - k)) s -= batteries[batteries.lastIndex - k++]
  return s / (n - k)
}
