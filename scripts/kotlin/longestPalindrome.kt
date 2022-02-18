
/*
Given a string s, return the longest palindromic substring in s.
*/

fun longestPalindrome(s: String): String {
  if (s.isEmpty()) return ""
        
  var start = 0
  var end = 0
  for (i in s.indices) {
    val maxLength = maxOf(getPalindromeLength(s, i, i), getPalindromeLength(s, i, i + 1))
    if (maxLength > end - start) {
      start = i - (maxLength - 1) / 2
      end = i + maxLength / 2
    }
  }
        
  return s.substring(start, end + 1)
}
    
private fun getPalindromeLength(s: String, start: Int, end: Int): Int {
  var left = start
  var right = end
  while (left >= 0 && right < s.length && s[left] == s[right]) {
    left--
    right++
  }
  return right - left - 1
}
