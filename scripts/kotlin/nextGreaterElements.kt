
/*
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
*/

fun nextGreaterElements(nums: IntArray): IntArray {
  if (nums.size < 2) return IntArray(nums.size) { -1 }
        
  val result = IntArray(nums.size) { -1 }
  val stack = LinkedList<Int>()
  repeat(2) {
    nums.forEachIndexed { idx, value -> 
      while(stack.isNotEmpty() && value > nums[stack.peek()]) result[stack.pop()] = value
      stack.push(idx)
    }
  }
        
  return result
}
