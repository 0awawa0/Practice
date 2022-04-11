

/* 
You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

    An integer x - Record a new score of x.
    "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
    "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
    "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.

Return the sum of all the scores on the record.
*/

fun calPoints(ops: Array<String>): Int {
    val stack = LinkedList<Int>()
    for (op in ops) {
        when (op) {
            "C" -> stack.pop()
            "D" -> stack.push(stack.peek() * 2)
            "+" -> {
                val n1 = stack.pop()
                val n2 = stack.pop()
                stack.push(n2)
                stack.push(n1)
                stack.push(n1 + n2)
            }
            else -> stack.push(op.toInt())
        }
    }
        
    return stack.sum()!!
}