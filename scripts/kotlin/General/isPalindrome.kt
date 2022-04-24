
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/
fun isPalindrome(s: String): Boolean {
  val alphabet = "abcdefghijklmnopqrstuvwxyz1234567890".toSet()
  val s1 = s.toLowerCase()
  var left = 0
  var right = s.lastIndex
  while (left < right) {
    when {
      s1[left] !in alphabet -> left++
      s1[right] !in alphabet -> right--
      s1[left] != s1[right] -> return false
      else -> {
        left++
        right--
      }
    }
  }
        
  return true
}
