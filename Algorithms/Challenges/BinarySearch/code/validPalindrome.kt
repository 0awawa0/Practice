/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
*/

fun validPalindrome(s: String): Boolean {
  var left = 0
  var right = s.lastIndex
  var isDeleted = false
  while (left < right) {
    if (s[left] != s[right]) return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)
    left++
    right--
  }
  return true
}
    
private fun isPalindrome(s: String, start: Int, finish: Int): Boolean {
  var left = start
  var right = finish
  while (left < right) {
    if (s[left] != s[right]) return false
    left++
    right--
  }
  return true
}
