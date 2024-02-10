
/*
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.
*/

fun checkPerfectNumber(num: Int): Boolean {
  val primes = intArrayOf(2, 3, 5, 7, 13, 17, 19, 31)
  for (prime in primes) {
    if (1.shl(prime - 1) * (1.shl(prime) - 1) == num) return true
  }
  return false
}
