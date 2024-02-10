
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/

fun firstUniqChar(s: String): Int {
  val freqs = IntArray(26)
  for (char in s) freqs[char - 'a']++
  for (i in s.indices) if (freqs[s[i] - 'a'] == 1) return i
  return -1
}
