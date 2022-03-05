
/*
You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

    Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.

Return the maximum number of points you can earn by applying the above operation some number of times.
*/

fun deleteAndEarn(nums: IntArray): Int {
        
  val freqs = HashMap<Int, Int>()
  for (num in nums) freqs[num] = (freqs[num] ?: 0) + num
  val sortedSet = freqs.keys.toList().sorted()
        
  var b2 = 0
  var b1 = freqs[sortedSet[0]]!!
        
  for (i in 1 until sortedSet.size) {
    val curr = sortedSet[i]
    val t = b1
    if (curr == sortedSet[i - 1] + 1) b1 = maxOf(b1, b2 + freqs[curr]!!)
    else b1 += freqs[curr]!!
    b2 = t
  }
        
  return b1
}
