
/*
Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.

Return the length of n. If there is no such n, return -1.

Note: n may not fit in a 64-bit signed integer.
*/

fun smallestRepunitDivByK(k: Int): Int {
  if (k % 2 == 0) return -1
  if (k % 5 == 0) return -1

  var n = 1
  var size = 1
  val seen = HashSet<Int>()
  while (n % k != 0) {
    if (n in seen) return -1
    seen.add(n)
    n = ((n * 10) + 1) % k
    size++
  }
        
  return size
}
