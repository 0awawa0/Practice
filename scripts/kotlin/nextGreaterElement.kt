
/*
Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.
*/

fun nextGreaterElement(n: Int): Int {
  val digits = ArrayList<Int>()
  var k = n
  while (k > 0) {
    digits.add(0, k % 10)
    k /= 10
  }
        
  var left = digits.lastIndex - 1
  while (left >= 0 && digits[left] >= digits[left + 1]) left--
  if (left < 0) return -1
        
        
  var right = digits.lastIndex
  while (right > left) {
    if (digits[right] > digits[left]) {
      val t = digits[right]
      digits[right] = digits[left]
      digits[left] = t
      break
    }
    right--
  }
        
  left++
  right = digits.lastIndex
  while (left <= right) {
    val t = digits[right]
    digits[right] = digits[left]
    digits[left] = t
    left++
    right--
  }
        
  var newInt = 0L
  for (digit in digits) {
    newInt = newInt * 10L + digit.toLong()
    if (newInt > Int.MAX_VALUE) return -1
  }
  return newInt.toInt()
}
