
/*
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
*/

fun countOdds(low: Int, high: Int): Int {
  val totalNumbers = high - low + 1
  val startsOrEndsWithOdd = if (high % 2 != 0 || low % 2 != 0) 1 else 0
  return if (totalNumbers % 2 == 0) totalNumbers / 2 else totalNumbers / 2 + startsOrEndsWithOdd
}
