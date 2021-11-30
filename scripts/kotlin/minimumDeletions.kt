
/*
You are given a 0-indexed array of distinct integers nums.

There is an element in nums that has the lowest value and an element that has the highest value. We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array.

A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array.

Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.
*/

fun minimumDeletions(nums: IntArray): Int {
  var minimum = nums[0]
  var minIndex = 0
  var maximum = nums[0]
  var maxIndex = 0
        
  for (i in 0 until nums.size) {
    if (nums[i] < minimum) {
      minimum = nums[i]
      minIndex = i
    }
            
    if (nums[i] > maximum) {
      maximum = nums[i]
      maxIndex = i
    }
  }
        
  var left = 0
  var right = nums.size - 1
        
  var lowerIndex = minOf(minIndex, maxIndex)
  var higherIndex = maxOf(minIndex, maxIndex)
        
  val lowerDistance = minOf(lowerIndex - left, right - lowerIndex)
  val higherDistance = minOf(higherIndex - left, right - higherIndex)
        
  var totalCount = 0
        
  if (lowerDistance > higherDistance) lowerIndex = higherIndex.also  { higherIndex = lowerIndex }
        
  if (lowerIndex - left < right - lowerIndex) {
    totalCount += lowerIndex - left + 1
    left = lowerIndex + 1
  } else {
    totalCount += right - lowerIndex + 1
    right = lowerIndex - 1
  }
        
  if (higherIndex > right || higherIndex < left) return totalCount
        
  if (higherIndex - left < right - higherIndex) {
    totalCount += higherIndex - left + 1
  } else {
    totalCount += right - higherIndex + 1
  }
        
        
  return totalCount
}
