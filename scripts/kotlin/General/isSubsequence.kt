
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/

fun isSubsequence(s: String, t: String): Boolean {
  var nextChar = 0
  for (i in t.indices) {
    if (nextChar == s.length) break
    if (t[i] == s[nextChar]) nextChar++
  }
        
  return nextChar == s.length
}
