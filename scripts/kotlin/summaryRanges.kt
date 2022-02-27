
/*
You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

    "a->b" if a != b
    "a" if a == b
*/

fun summaryRanges(nums: IntArray): List<String> {
  if (nums.isEmpty()) return emptyList()
        
  val result = LinkedList<String>()
  var currStart = nums[0]
  var nextExpected = currStart + 1
  for (i in 1 until nums.size) {
    if (nums[i] != nextExpected) {
      if (currStart == nextExpected - 1) result.add("$currStart")
      else result.add("$currStart->${nextExpected - 1}")
      currStart = nums[i]
      nextExpected = currStart + 1
    } else {
      nextExpected += 1
    }
  }
        
  if (currStart == nextExpected - 1) result.add("$currStart")
  else result.add("$currStart->${nextExpected - 1}")
        
  return result
}
