
/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

    0 <= i < j < nums.length
    |nums[i] - nums[j]| == k

Notice that |val| denotes the absolute value of val.
*/

fun findPairs(nums: IntArray, k: Int): Int {
  val freqs = HashMap<Int, Int>()
  for (num in nums) freqs[num] = (freqs[num] ?: 0) + 1
        
  if (k == 0) return freqs.count { it.value >= 2 }
        
  val pairs = HashSet<Int>()
  for (num in nums) {
    if (freqs[num + k] != null) pairs.add(num + k + num)
    if (freqs[num - k] != null) pairs.add(num - k + num)
  }
        
  return pairs.size    
}
