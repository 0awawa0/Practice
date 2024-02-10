
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
*/

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (char in s) {
        if (char in "({[") stack.push(char)
        if (char in ")}]") {
            if (stack.size == 0) return false
            val topChar = stack.pop()
            when (char) {
                ')' -> if (topChar != '(') return false
                '}' -> if (topChar != '{') return false
                ']' -> if (topChar != '[') return false
            }
        }
    }
        
    return stack.size == 0
}

fun main(args: Array<String>) {
    println("Check of ${args[0]} returns ${isValid(args[0])}")
}
