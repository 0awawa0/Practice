
/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard.
In the American keyboard:

    + the first row consists of the characters "qwertyuiop",
    + the second row consists of the characters "asdfghjkl", and
    + the third row consists of the characters "zxcvbnm".
*/

fun findWords(words: Array<String>): Array<String> {  
  val firstRow = "qwertyuiop".toSet()
  val secondRow = "asdfghjkl".toSet()
  val thirdRow = "zxcvbnm".toSet()
        
  val result = LinkedList<String>()
  for (word in words) {
    val row = when (word[0].toLowerCase()) {
      in firstRow -> 1
      in secondRow -> 2
      in thirdRow -> 3
      else -> 0
    }
    var isSingleRow = true
    for (char in word) {
      val nextRow = when (char.toLowerCase()) {
        in firstRow -> 1
        in secondRow -> 2
        in thirdRow -> 3
        else -> 0
      }
      if (row != nextRow) { 
        isSingleRow = false
        break
      }
    }
    if (isSingleRow) result.add(word)
  }
        
  return result.toTypedArray()
}
