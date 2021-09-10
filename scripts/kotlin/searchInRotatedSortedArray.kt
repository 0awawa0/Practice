
/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
*/

fun search(nums: IntArray, target: Int): Int {
  var left = 0
  var right = nums.size - 1
  var middle = left + (right - left) / 2
        
  if (nums.size <= 2) { 
    if (nums[left] == target) return left
    if (nums[right] == target) return right
    return -1
  }
        
  while (left < right) {
    if (nums[left] == target) return left
    if (nums[right] == target) return right
    if (nums[middle] == target) return middle
            
    // First, check which side of the array is sorted
    if (nums[middle] > nums[left]) {
                
      if (nums[left] > target) {
        // Target is definitely not in the left part
        // because left part is properly sorted and its minimum is greater than target
        // So move to the right side
        left = middle + 1
      } else {
        // Otherwise, if middle is greater than target
        // then if target is in the array, so it is definitely in the left part
        if (nums[middle] > target) {
          // Move to left part
          right = middle - 1
        } else {
          // Target is greater than middle, so it might be in the right part
          left = middle + 1
        }
      }
    } else {
      // Here the right part of the array is properly and left part contains peak
      if (nums[right] < target) {
        // Target is definitely not in the right part
        // because right part is properly sorted and its maximum is lower than target
        // So move to the left side
        right = middle - 1
      } else {
        // Otherwise if middle is lower than target
        // then if target is in the array, so it is definitely in the right part
        if (nums[middle] < target) {
          // Move to right part
          left = middle + 1
        } else {
          // Target is lower than middle, so it might be in the left part
          right = middle - 1
        }
      }
    }
            
    middle = left + (right - left)
  }
        
  return if (nums[middle] == target) middle else -1
}
