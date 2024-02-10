
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
*/

fun generateParenthesis(n: Int): List<String> {
    val result = LinkedList<String>()
        
    fun backtrack(currentString: String, opened: Int, closed: Int) {
        if (currentString.length == n * 2) {
            result.add(currentString)
            return
        }
            
        if (opened < n) backtrack(currentString + "(", opened + 1, closed)
        if (closed < opened) backtrack(currentString + ")", opened, closed + 1)
    }
        
    backtrack("", 0, 0)
    return result
}