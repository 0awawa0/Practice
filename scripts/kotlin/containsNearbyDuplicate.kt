/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
  var distance = k + 1
  val counts = HashMap<Int, Int>()
        
  for (i in nums.indices) {
    counts[nums[i]] = (counts[nums[i]] ?: 0) + 1
    if (i - distance >= 0) counts[nums[i - distance]] = (counts[nums[i - distance]] ?: 1) - 1
    if (counts[nums[i]]!! > 1) return true
  }
        
  return false
}
