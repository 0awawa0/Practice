
/*
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
*/

fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
  if (k <= 1) return 0
  var prod = 1
  var anchor = 0
  var result = 0
  for (i in nums.indices) {
    prod *= nums[i]
    while (prod >= k) prod /= nums[anchor++]
    result += i - anchor + 1
  }
        
        
  return result
}
