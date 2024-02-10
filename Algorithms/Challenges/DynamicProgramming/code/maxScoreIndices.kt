/*
You are given a 0-indexed binary array nums of length n. nums can be divided at index i (where 0 <= i <= n) into two arrays (possibly empty) numsleft and numsright:

    numsleft has all the elements of nums between index 0 and i - 1 (inclusive), while numsright has all the elements of nums between index i and n - 1 (inclusive).
    If i == 0, numsleft is empty, while numsright has all the elements of nums.
    If i == n, numsleft has all the elements of nums, while numsright is empty.

The division score of an index i is the sum of the number of 0's in numsleft and the number of 1's in numsright.

Return all distinct indices that have the highest possible division score. You may return the answer in any order.
*/

fun maxScoreIndices(nums: IntArray): List<Int> {
  if (nums.size == 1) return if (nums[0] == 0) listOf(1) else listOf(0)
  
  val zeroesBefore = IntArray(nums.size + 1)
  val onesAfter = IntArray(nums.size + 1)
        
  var count = 0
  for (i in nums.indices) {
    zeroesBefore[i] = count
    if (nums[i] == 0) count++
  }
  zeroesBefore[nums.size] = count
        
  count = 0
  onesAfter[nums.size] = 0
  for (i in nums.lastIndex downTo 0) {
    if (nums[i] == 1) count++
    onesAfter[i] = count
  }
        
  var maxScore = 0
  for (i in zeroesBefore.indices) {
    val score = zeroesBefore[i] + onesAfter[i]
    maxScore = maxOf(score, maxScore)
  }
        
  val result = LinkedList<Int>()
        
  for (i in zeroesBefore.indices) {
    val score = zeroesBefore[i] + onesAfter[i]
    if (score == maxScore) result.add(i)
  }
  return result
}
