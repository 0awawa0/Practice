
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

fun isAnagram(s: String, t: String): Boolean {
  if (s.length != t.length) return false
        
  val freqs = IntArray(26) { 0 }
  for (i in s.indices) {
    freqs[s[i] - 'a']++
    freqs[t[i] - 'a']--
  }
        
  return freqs.all { it == 0 }
}
