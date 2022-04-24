
/*
You are given an array nums of positive integers. In one operation, you can choose any number from nums and reduce it to exactly half the number. (Note that you may choose this reduced number in future operations.)

Return the minimum number of operations to reduce the sum of nums by at least half.
*/

fun halveArray(nums: IntArray): Int {
  val queue = PriorityQueue<Double>(Collections.reverseOrder())
  var currSum = 0.0
  for (num in nums) {
    val n = num.toDouble()
    currSum += n
    tree.add(n)
  }
  var newSum = 0.0
  var operations = 0
  while (currSum - newSum > currSum / 2) {
    val n = queue.poll()
    newSum += n / 2
    tree.add(n / 2)
    operations++
  }
  return operations
}
