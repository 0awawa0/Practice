
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/
fun threeSum(nums: IntArray): List<List<Int>> {
  val sortedNums = nums.sorted()
  val result = HashSet<List<Int>>()
        
  for (i in 0 until sortedNums.size - 2) {
    var left = i + 1
    var right = sortedNums.size - 1
    val first = sortedNums[i]
    while (left < right) {
      val second = sortedNums[left]
      val third = sortedNums[right]
      val s = first + second + third
      when {
        s == 0 -> {
          result.add(listOf(first, second, third))
          left++
          right--
        }
        s > 0 -> right--
        s < 0 -> left++
      }
    }
  }
        
  return result.toList()
}
