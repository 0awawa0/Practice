
/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
*/

fun findMaxLength(nums: IntArray): Int {
  var map = HashMap<Int, Int>()
  map[0] = -1
  var count = 0
  var maxLength = 0
  for (i in nums.indices) {
    count = if (nums[i] == 0) count + 1 else count - 1
    if (map[count] != null) {
      maxLength = maxOf(maxLength, i - map[count]!!)
    } else {
      map[count] = i
    }
  }
  return maxLength
}
