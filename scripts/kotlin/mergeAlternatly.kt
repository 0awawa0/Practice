
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/

fun mergeAlternately(word1: String, word2: String): String {
  var pointer1 = 0
  var pointer2 = 0
  var turn = true
  val result = StringBuilder()
  while (pointer1 < word1.length && pointer2 < word2.length) {
    if (turn) result.append(word1[pointer1++])
    else result.append(word2[pointer2++])
    turn = !turn
  }
        
  while (pointer1 < word1.length) result.append(word1[pointer1++])
  while (pointer2 < word2.length) result.append(word2[pointer2++])
        
  return result.toString()
}
