
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

fun singleNumber(nums: IntArray): Int {
  var answer = 0
  for (num in nums) answer = answer.xor(num)
  return answer
}
