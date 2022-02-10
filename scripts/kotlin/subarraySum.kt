
/*
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
*/

fun subarraySum(nums: IntArray, k: Int): Int {
  val sums = HashMap<Int, Int>()
  var currSum = 0
  var count = 0
  sums[0] = 1
  for (i in 0 until nums.size) {
    currSum += nums[i]
    if (sums[currSum - k] != null) count += sums[currSum - k]!!
    sums[currSum] = (sums[currSum] ?: 0) + 1
  }
        
  return count
}
