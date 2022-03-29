
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/

fun findDuplicate(nums: IntArray): Int {
  var fast = nums[nums[nums[0]]]
  var slow = nums[nums[0]]
        
  while (fast != slow) {
    fast = nums[nums[fast]]
    slow = nums[slow]
  }
        
  slow = nums[0]
  while (slow != fast) {
    slow = nums[slow]
    fast = nums[fast]
  }
        
  return fast
}
