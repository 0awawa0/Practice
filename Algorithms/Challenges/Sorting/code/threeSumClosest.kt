
/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers.

You may assume that each input would have exactly one solution.
*/

fun threeSumClosest(nums: IntArray, target: Int): Int {
        
  nums.sort()
  var smallestDiff = Int.MAX_VALUE
        
  for (i in nums.indices) {
    var left = i + 1
    var right = nums.size - 1
    while (left < right) {
      val currDiff = target - (nums[i] + nums[left] + nums[right])
      if (abs(smallestDiff) > abs(currDiff)) smallestDiff = currDiff
      if (smallestDiff == 0) return target
                
      if (currDiff > 0) left++
      else right--
    }
  }
        
  return target - smallestDiff
}
