
/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.
*/

fun isMonotonic(nums: IntArray): Boolean {
  return isIncreasing(nums) || isDecreasing(nums)
}
    
private fun isIncreasing(nums: IntArray): Boolean {
  for (i in 1 until nums.size) if (nums[i] < nums[i - 1]) return false
  return true
}
    
private fun isDecreasing(nums: IntArray): Boolean {
  for (i in 1 until nums.size) if (nums[i] > nums[i - 1]) return false
  return true
}
