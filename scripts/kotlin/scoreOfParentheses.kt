
/*
Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:

    + "()" has score 1.
    + AB has score A + B, where A and B are balanced parentheses strings.
    + (A) has score 2 * A, where A is a balanced parentheses string.


*/

fun scoreOfParentheses(s: String): Int {
  var index = 0
  var total = 0
  var depth = 0
  while (index < s.length) {
    if (s[index] == '(') depth++
    else {
      if (s[index - 1] == '(') total += 1.shl(depth - 1)    
      depth--
    }
    index++
  }
        
  return total
}
