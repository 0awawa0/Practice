
/*
Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
*/

fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
  val stack = LinkedList<Int>()
  var popPointer = 0
        
  for (num in pushed) {
    stack.push(num)
    while (stack.isNotEmpty() && stack.peek() == popped[popPointer]) {
      stack.pop()
      popPointer++
    }
  }
        
  return popPointer == popped.size
}
