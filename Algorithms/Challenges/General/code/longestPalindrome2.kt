
/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters. Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
*/

fun longestPalindrome(s: String): Int {
  val freqs = HashMap<Char, Int>()
  for (char in s) freqs[char] = (freqs[char] ?: 0) + 1
        
  var totalLength = 0
  var middleFound = false
  for (freq in freqs) {
    if (freq.value % 2 != 0) {
      if (!middleFound) {
        middleFound = true
        totalLength += freq.value
      } else {
        totalLength += freq.value - 1
      }
    } else {
      totalLength += freq.value
    }
  }
        
  return totalLength
}
