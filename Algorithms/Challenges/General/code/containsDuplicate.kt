
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

fun containsDuplicate(nums: IntArray): Boolean {
  val met = HashSet<Int>()
  for (num in nums) {
    if (num in met) return true
    met.add(num)
  }
        
  return false
}
