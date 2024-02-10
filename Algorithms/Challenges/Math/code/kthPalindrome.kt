
/*
Given an integer array queries and a positive integer intLength, return an array answer where answer[i] is either the queries[i]th smallest positive palindrome of length intLength or -1 if no such palindrome exists.

A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.
*/

fun kthPalindrome(queries: IntArray, intLength: Int): LongArray {
  val result = LongArray(queries.size) { -1 }
  var i = 0
  val halfLength = if (intLength % 2 != 0) intLength / 2 + 1 else intLength / 2
  var higherHalf = 1L
  repeat(halfLength - 1) { higherHalf *= 10L }
  var currPalindrome = 1
  for (i in queries.indices) {
    val k = queries[i]
    higherHalf += (k - currPalindrome).toLong()
            
    val palindrome = StringBuilder()
    palindrome.append(higherHalf)
    palindrome.append(higherHalf.toString().reversed()) 
    if (intLength % 2 != 0) palindrome.deleteCharAt(palindrome.length / 2)
    if (palindrome.length == intLength) result[i] = palindrome.toString().toLong()
    currPalindrome = k
  }
        
  return result
}
