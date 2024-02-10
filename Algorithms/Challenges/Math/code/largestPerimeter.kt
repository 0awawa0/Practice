
/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
*/

fun largestPerimeter(nums: IntArray): Int {
  nums.sort()
  for (i in nums.size - 3 downTo 0) {
    if (nums[i] + nums[i + 1] > nums[i + 2]) return nums[i] + nums[i + 1] + nums[i + 2]
  }
  return 0
}
