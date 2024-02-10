
/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
*/

fun reverseVowels(s: String): String {
  val arr = s.toCharArray()
  val vowels = setOf('a', 'e', 'i', 'o', 'A', 'E', 'I', 'O', 'u', 'U')
  var left = 0
  var right = arr.lastIndex
  while (left < right) {
    val leftCheck = arr[left] in vowels
    val rightCheck = arr[right] in vowels
    if (leftCheck && rightCheck) {
      val t = arr[left]
      arr[left++] = arr[right]
      arr[right--] = t
    } else {
      if (!leftCheck) left++
      if (!rightCheck) right--
    }
  }
        
  return String(arr)
}
