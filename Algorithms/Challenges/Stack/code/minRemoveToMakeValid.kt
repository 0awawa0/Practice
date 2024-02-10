
/*
Given a string s of '(' , ')' and lowercase English characters. Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

    + It is the empty string, contains only lowercase characters, or
    + It can be written as AB (A concatenated with B), where A and B are valid strings, or
    + It can be written as (A), where A is a valid string.

*/

fun minRemoveToMakeValid(s: String): String {
  val stack = LinkedList<Int>()
  for (i in s.indices) {
    when (s[i]) {
      '(' -> stack.push(i)
      ')' -> if (stack.isNotEmpty() && s[stack.peek()] == '(') stack.pop() else stack.push(i)
    }
  }
        
  val removeSet = stack.toSet()
  val result = StringBuilder()
  for (i in s.indices) if (i !in removeSet) result.append(s[i])
  return result.toString()
}
