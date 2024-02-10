
/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
*/

fun checkInclusion(s1: String, s2: String): Boolean {
  if (s1.length > s2.length) return false
  val freqs = IntArray(26)
  for (i in 0 until s1.length) {
    freqs[s1[i] - 'a']++
    freqs[s2[i] - 'a']--
  }
        
  if (freqs.none { it > 0 }) return true
        
  for (i in s1.length until s2.length) {
    freqs[s2[i - s1.length] - 'a']++
    freqs[s2[i] - 'a']--
    if (freqs.none { it > 0 }) return true
  }
        
  return freqs.none { it > 0 }
}
