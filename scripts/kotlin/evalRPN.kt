
/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.
*/


fun evalRPN(tokens: Array<String>): Int {
  val stack = LinkedList<Int>()
  for (token in tokens) {
    when (token) {
      "*" -> stack.push(stack.pop() * stack.pop())
      "+" -> stack.push(stack.pop() + stack.pop())
      "-" -> {
        val n1 = stack.pop()
        val n2 = stack.pop()
        stack.push(n2 - n1)
      }
      "/" -> {
        val n1 = stack.pop()
        val n2 = stack.pop()
        stack.push(n2 / n1)
      }
      else -> stack.push(token.toInt())
    }
  }
        
  return stack.pop()
}
