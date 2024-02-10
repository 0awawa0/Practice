
/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
*/

fun areAlmostEqual(s1: String, s2: String): Boolean {
  var swapPosition = -1
  var didSwap = false
  for (i in s1.indices) {
    if (s1[i] != s2[i]) {
      if (didSwap) return false
                
      if (swapPosition != -1) {
        if (s1[swapPosition] == s2[i] && s1[i] == s2[swapPosition]) {
          didSwap = true
          swapPosition = -1
        } else return false
      } else swapPosition = i
    }
  }
        
  return swapPosition == -1
}
