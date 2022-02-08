
/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/

fun addDigits(num: Int): Int {
  var sum = 0
  var n = num
  while (n > 0) {
    sum += n % 10
    n /= 10
    if (n == 0 && sum > 9) {
      n = sum
      sum = 0
    }
  }
  return sum
}

fun addDigits(num: Int): Int {
  if (num == 0) return 0
  if (num % 9 == 0) return 9
  return num % 9
}
