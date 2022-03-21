
/*
A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.
You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.

Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.
*/

fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
  val result = LinkedList<Boolean>()
  for (i in l.indices) result.add(checkRange(nums, l[i], r[i]))
  return result
}
    
private fun checkRange(nums: IntArray, start: Int, end: Int): Boolean {
        
  val numbers = HashSet<Int>()
  var maxNumber = Int.MIN_VALUE
  var minNumber = Int.MAX_VALUE
  for (i in start..end) {
    numbers.add(nums[i])
    maxNumber = maxOf(maxNumber, nums[i])
    minNumber = minOf(minNumber, nums[i])
  }
        
  if (minNumber == maxNumber) return true
  if ((maxNumber - minNumber) % (end - start) != 0) return false
  val diff = (maxNumber - minNumber) / (end - start)
        
  for (n in minNumber..maxNumber step diff) if (n !in numbers) return false
        
  return true
}
