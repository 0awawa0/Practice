
/*
Given a string s, return the number of segments in the string. A segment is defined to be a contiguous sequence of non-space characters.
*/

fun countSegments(s: String): Int {
  val arr = s.toCharArray()
  var count = 0
  for (i in arr.indices) {
    if (arr[i] != ' ')
      if (i == 0 || arr[i - 1] == ' ') 
        count++
  }
  return count
}
