
/*
Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k. 
*/

fun countPairs(nums: IntArray, k: Int): Int {
  var count = 0
  for (i in nums.indices) {
    for (j in i + 1 until nums.size) {
      if (i * j % k == 0 && nums[i] == nums[j]) count++
    }
  }
  
  return count
}
