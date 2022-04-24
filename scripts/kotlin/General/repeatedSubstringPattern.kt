
/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
*/

fun repeatedSubstringPattern(s: String): Boolean {
  for (length in 1 .. s.length / 2) {
    if (s.length % length != 0) continue
    val sub = s.substring(0, length)
    var matches = true
    for (i in 1 until s.length / length) {
      if (sub != s.substring(i * length, i * length + length)) {
        matches = false
        break
      }
    }
    if (matches) return true
  }
        
  return false
}
