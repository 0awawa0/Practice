
/*
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

    Every adjacent pair of words differs by a single letter.
    Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
    sk == endWord

Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
*/

fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
  val wordList = wordList.toSet()
  if (endWord !in wordList) return 0
        
  val queue = LinkedList<String>()
  val visited = HashSet<String>()
  queue.add(beginWord)
  visited.add(beginWord)
        
  var changes = 1
  while (queue.isNotEmpty()) {
    val queueSize = queue.size
    for (i in 0 until queueSize) {
      val word = queue.poll()
      if (word == endWord) return changes
                
      val arr = word.toCharArray()
      for (j in word.indices) {
        val oldChar = arr[j]
        for (char in 'a'..'z') {
          arr[j] = char
          val str = String(arr)
          if (str in wordList && str !in visited) {
            queue.add(str)
            visited.add(str)
          }
        }
        arr[j] = oldChar
      }
    }
    changes++
  }
        
  return 0
}
