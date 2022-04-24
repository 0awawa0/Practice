
/*
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
*/

fun removeDuplicateLetters(s: String): String {
  val freqs = IntArray(26)
  for (char in s) freqs[char - 'a']++
  val stack = LinkedList<Char>()
  val used = BooleanArray(26)
        
  for (char in s) {
    freqs[char - 'a']--
    if (used[char - 'a']) continue
            
    while (stack.isNotEmpty() && stack.peek() > char && freqs[stack.peek() - 'a'] != 0) used[stack.pop() - 'a'] = false
            
    stack.push(char)
    used[char - 'a'] = true
  }
        
  val result = StringBuilder()
  while (stack.isNotEmpty()) result.append(stack.pop())
        
  return result.toString().reversed()
}
