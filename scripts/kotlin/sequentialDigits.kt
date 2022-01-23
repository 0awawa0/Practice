
/*
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
*/

fun sequentialDigits(low: Int, high: Int): List<Int> {
  val result = LinkedList<Int>()
    
  for (length in low.toString().length .. high.toString().length) {
    for (start in 1 .. (10 - length)) {
      var currNumber = 0
      for (i in start until start + length) currNumber = (currNumber * 10) + i
      if (currNumber >= low && currNumber <= high) result.add(currNumber)
    }
  }
        
  return result
}
