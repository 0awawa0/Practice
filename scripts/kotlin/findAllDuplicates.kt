

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/


fun findDuplicates(nums: IntArray): List<Int> {
  val result = ArrayList<Int>()
  for (i in 0 until nums.size) {
    val pointer = abs(nums[i]) - 1
    if (nums[pointer] < 0) result.add(pointer + 1)
    else nums[pointer] = -nums[pointer]
  }
  return result
}
