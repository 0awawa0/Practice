
/*
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.
*/

fun partitionLabels(s: String): List<Int> {
  val lastIndex = IntArray(26)
  s.forEachIndexed { index, char -> 
    lastIndex[char - 'a'] = index
  }
        
  val result = LinkedList<Int>()
  var intervalStart = 0
  var intervalEnd = 0
  s.forEachIndexed { index, char ->
    intervalEnd = maxOf(intervalEnd, lastIndex[char - 'a'])
    if (index == intervalEnd) {
      result.add(intervalEnd - intervalStart + 1)
      intervalStart = index + 1
    }
  }
  return result
}
