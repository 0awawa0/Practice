
/*
Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
*/

fun sumOfThree(num: Long): LongArray {
  if (num % 3 != 0L) return LongArray(0)
  else return longArrayOf(num / 3 - 1, num / 3, num / 3 + 1)
}
