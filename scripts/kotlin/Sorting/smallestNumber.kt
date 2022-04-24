

/*
You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.

Return the rearranged number with minimal value.

Note that the sign of the number does not change after rearranging the digits.
*/

fun smallestNumber(num: Long): Long {
  val digits = LinkedList<Long>()
  var n = if (num > 0) num else -num
  while (n != 0L) {
    digits.add(n % 10)
    n /= 10
  }
  digits.sort()
  val zeroes = LinkedList<Long>()
  if (digits.isEmpty()) return 0L
  while (digits.first() == 0L) zeroes.add(digits.removeFirst())
        
  var result = 0L
  if (num < 0) {
    while (digits.isNotEmpty()) result = result * 10L + digits.removeLast()
    while (zeroes.isNotEmpty()) result = result * 10L + zeroes.removeFirst()
    return -result
  } else {
    result = digits.removeFirst()
    while (zeroes.isNotEmpty()) result = result * 10L + zeroes.removeFirst()
    while (digits.isNotEmpty()) result = result * 10L + digits.removeFirst()
    return result
  }
}
