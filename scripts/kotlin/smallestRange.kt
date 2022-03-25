
/*
You are given an integer array nums and an integer k.

For each index i where 0 <= i < nums.length, change nums[i] to be either nums[i] + k or nums[i] - k.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after changing the values at each index.
*/


fun smallestRangeII(nums: IntArray, k: Int): Int {
  nums.sort()
        
  var result = nums.last() - nums.first()
  for (i in 0 until nums.lastIndex) {
    val a = nums[i]
    val b = nums[i + 1]
    val h = maxOf(nums.last() - k, a + k)
    val l = minOf(nums.first() + k, b - k)
    result = minOf(result, h - l)
  }
        
  return result
}
