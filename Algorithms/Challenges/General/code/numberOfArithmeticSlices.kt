
/*
An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

    For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.

Given an integer array nums, return the number of arithmetic subarrays of nums.

A subarray is a contiguous subsequence of the array.
*/

fun numberOfArithmeticSlices(nums: IntArray): Int {
  var totalCount = 0
  var currCount = 0
  for (i in 2 until nums.size) {
    if (nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]) {
      currCount++
      totalCount += currCount
    } else {
      currCount = 0
    }
  }
        
  return totalCount
}
