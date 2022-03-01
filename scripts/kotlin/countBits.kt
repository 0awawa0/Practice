
/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
*/

fun countBits(n: Int): IntArray {
  val result = IntArray(n + 1)
  for (i in 0..n) result[i] = result[i.shr(1)] + i.and(1)
  return result
}
