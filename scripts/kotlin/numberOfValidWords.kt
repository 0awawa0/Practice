
/*
With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:

    * word contains the first letter of puzzle.
    * For each letter in word, that letter is in puzzle.
        For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage", while
        invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).

Return an array answer, where answer[i] is the number of words in the given word list words that is valid with respect to the puzzle puzzles[i]. 
*/

fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
  val result = LinkedList<Int>()
  val wordsMap = HashMap<Int, Int>()
        
  for (word in words) {
    val mask = bitmask(word)
    wordsMap[mask] = (wordsMap[mask] ?: 0) + 1
  }
        
  for (puzzle in puzzles) {
    val firstCharBit = 1.shl((puzzle[0] - 'a').toInt())
    var count = wordsMap[firstCharBit] ?: 0
            
    val mask = bitmask(puzzle.substring(1))
    var submask = mask
    while (submask != 0) {
      count += wordsMap[submask.or(firstCharBit)] ?: 0
      submask = (submask - 1).and(mask)
    }
    result.add(count)
  }
        
  return result
}
    
private fun bitmask(word: String): Int {
  var mask = 0
  for (char in word) mask = mask.or(1.shl((char - 'a').toInt()))
  return mask
}
