/*
You are given a 0-indexed array nums consisting of n positive integers.

The array nums is called alternating if:

    nums[i - 2] == nums[i], where 2 <= i <= n - 1.
    nums[i - 1] != nums[i], where 1 <= i <= n - 1.

In one operation, you can choose an index i and change nums[i] into any positive integer.

Return the minimum number of operations required to make the array alternating.
*/

fun minimumOperations(nums: IntArray): Int {
  if (nums.size < 2) return 0
        
  val evenFreqs = HashMap<Int, Int>()
  val oddFreqs = HashMap<Int, Int>()
  for (i in 0 until nums.size) {
    if (i % 2 == 0) evenFreqs[nums[i]] = (evenFreqs[nums[i]] ?: 0) + 1
    else oddFreqs[nums[i]] = (oddFreqs[nums[i]] ?: 0) + 1
  }
  val sortedEvenFreqs = evenFreqs.toList().sortedByDescending { it.second }
  val sortedOddFreqs = oddFreqs.toList().sortedByDescending { it.second }
  var evenElem = sortedEvenFreqs.first()
  var oddElem = sortedOddFreqs.first()
  if (oddElem.first == evenElem.first) {
    if (oddElem.second < evenElem.second) oddElem = sortedOddFreqs.getOrNull(1) ?: return nums.size / 2
    else evenElem = sortedEvenFreqs.getOrNull(1) ?: return nums.size / 2
  }

  return nums.size - (evenElem.second + oddElem.second)
}
