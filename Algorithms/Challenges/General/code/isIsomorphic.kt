/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
*/

fun isIsomorphic(s: String, t: String): Boolean {
  val map = HashMap<Char, Char>()
  val mappedChars = HashSet<Char>()
        
  for (i in 0 until minOf(s.length, t.length)) {
    if (map[s[i]] == null) {
      if (t[i] in mappedChars) return false
                
      map[s[i]] = t[i]
      mappedChars.add(t[i])
    }
    if (map[s[i]] != t[i]) return false
  }
        
  return true
}
