
/*
Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

Implement the FreqStack class:

    FreqStack() constructs an empty frequency stack.
    void push(int val) pushes an integer val onto the top of the stack.
    int pop() removes and returns the most frequent element in the stack.
        If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.

*/

class FreqStack() {
  private val freqs = HashMap<Int, Int>()
  private val stacks = HashMap<Int, Stack<Int>>()
  private var maxFreq = 0

  fun push(`val`: Int) {
    val freq = (freqs[`val`] ?: 0) + 1
    freqs[`val`] = freq
    maxFreq = maxOf(freq, maxFreq)
    if (stacks[freq] == null) stacks[freq] = Stack()
    stacks[freq]?.push(`val`)
  }

  fun pop(): Int {
    val res = stacks[maxFreq]!!.pop()
    freqs[res] = (freqs[res] ?: 1) - 1
    if (stacks[maxFreq]?.isEmpty() == true) maxFreq--
    return res
  }
}
