
/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.
*/

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
  nums.sort()
  return kSum(nums, 4, target, 0)
}
    
private fun kSum(nums: IntArray, k: Int, target: Int, index: Int): List<List<Int>> {
  val result = LinkedList<List<Int>>()
        
  if (k == 2) {
    var left = index
    var right = nums.size - 1
    while (left < right) {
      val s = nums[left] + nums[right]
      when {
        s == target -> {
          result.add(listOf(nums[left], nums[right]))
          while (left < right && nums[left] == nums[left + 1]) left++
          while (left < right && nums[right] == nums[right - 1]) right--
          left++
          right--
        }
        s < target -> left++
        s > target -> right--
      }
    }
    return result
  } else {
    var fix = index
    while (fix < nums.size - k + 1) {
      val newTarget = target - nums[fix]
      val reducedSolution = kSum(nums, k - 1, newTarget, fix + 1)
      for (list in reducedSolution) result.add(listOf(nums[fix]) + list)
      while (fix < nums.size - k + 1 && nums[fix] == nums[fix + 1]) fix++
      fix++
    }
      return result
  }
}
