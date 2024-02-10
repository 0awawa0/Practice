/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.
*/

fun removeKdigits(num: String, k: Int): String {
  if (k == num.length) return "0"
        
  var k = k
  val stack = LinkedList<Char>()
  var i = 0
        
  while (i < num.length) {
            
    while (k > 0 && stack.isNotEmpty() && stack.peek() > num[i]) {
      stack.pop()
      k--
    }
            
    stack.push(num[i])
    i++
  }
        
  while (k > 0) {
    stack.pop()
    k--
  }
        
  val result = StringBuilder()
  while (stack.isNotEmpty()) result.append(stack.pop())
  result.reverse()
        
  while (result.length > 1 && result[0] == '0') result.deleteCharAt(0)
        
  return result.toString()
}
