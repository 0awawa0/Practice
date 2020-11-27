
/*
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation. 
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, 
with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
*/

fun removeOuterParentheses(S: String): String {
    val result = StringBuilder()
        
    var currentPrimitive = StringBuilder()
    var countOfOpen = 0
        
    for (i in 0 until S.length) {
        if (S[i] == '(') {
            countOfOpen += 1
            currentPrimitive.append(S[i])
        } else {
            countOfOpen -= 1
            if (countOfOpen == 0) {
                result.append(currentPrimitive.substring(1))
                currentPrimitive = StringBuilder()
            } else {
                currentPrimitive.append(S[i])
            }
        }
    }
        
    return result.toString()
}

fun main(args: Array<String>) {
    print("Enter valid parentheses string >> ")
    val s = readLine()!!
    print("Removed outer parentheses: ${removeOuterParentheses(s)}")
}
