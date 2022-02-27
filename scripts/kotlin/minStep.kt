import kotlin.math.abs


/*
You are given two strings s and t. In one step, you can append any character to either s or t. Return the minimum number of steps to make s and t anagrams of each other.

An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
*/

fun minSteps(s: String, t: String): Int {
  val freqs = IntArray(26)
  for (i in 0 until maxOf(s.length, t.length)) {
    if (i < s.length) freqs[s[i] - 'a']++
    if (i < t.length) freqs[t[i] - 'a']--
  }
        
  var count = 0
  for (freq in freqs) count += abs(freq)
  return count
}
