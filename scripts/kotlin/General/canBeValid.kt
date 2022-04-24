/*
A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:

    It is ().
    It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
    It can be written as (A), where A is a valid parentheses string.

You are given a parentheses string s and a string locked, both of length n. locked is a binary string consisting only of '0's and '1's. For each index i of locked,

    If locked[i] is '1', you cannot change s[i].
    But if locked[i] is '0', you can change s[i] to either '(' or ')'.

Return true if you can make s a valid parentheses string. Otherwise, return false.
*/


fun canBeValid(s: String, locked: String): Boolean {
  if (s.length % 2 != 0) return false
  var balance = 0
        
  for (i in 0 until s.length) {
    if (s[i] == '(') balance++
    else balance += if (locked[i] == '1') -1 else 1
    if (balance < 0) return false
  }
  val forwardValid = balance >= 0
        
  balance = 0
  for (i in s.length - 1 downTo 0) {
    if (s[i] == ')') balance++
    else balance += if (locked[i] == '1') -1 else 1
    if (balance < 0) return false
  }
  val backwardValid = balance >= 0
        
  return forwardValid && backwardValid
}
