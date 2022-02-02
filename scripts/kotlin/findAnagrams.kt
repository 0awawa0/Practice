
/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

fun findAnagrams(s: String, p: String): List<Int> {
  if (p.length > s.length) return emptyList()
  val freqs = IntArray(26) { 0 }
  for (i in p.indices) {
    freqs[p[i] - 'a']++
    freqs[s[i] - 'a']--
  }
        
  val result = LinkedList<Int>()
  var index = 0
  while (index < s.length - p.length) {
    if (freqs.all { it == 0 }) result.add(index)
    freqs[s[index] - 'a']++
    freqs[s[index + p.length] - 'a']--
    index++
  }
        
  if (freqs.all { it == 0 }) result.add(index)
        
  return result
}
