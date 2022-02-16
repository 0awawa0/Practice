
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

fun majorityElement(nums: IntArray): Int {
  var candidate = nums[0]
  var count = 0
  for (num in nums) {
    if (count == 0) candidate = num
    if (num == candidate) count++
    else count--
            
  }
        
  return candidate
}
