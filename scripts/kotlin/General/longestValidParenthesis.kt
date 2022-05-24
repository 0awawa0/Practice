
/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
*/

fun longestValidParentheses(s: String): Int {
    var o = 0
    var c = 0
    var maxLen = 0
    for (char in s) {
        if (char == '(') o++
        else c++
            
        if (o == c) maxLen = maxOf(maxLen, o + c)
        else {
            if (c >= o) {
                o = 0
                c = 0
            }
        }
    }
        
    o = 0
    c = 0
    for (i in s.lastIndex downTo 0) {
        val char = s[i]
            
        if (char == '(') o++
        else c++
            
        if (o == c) maxLen = maxOf(maxLen, o + c)
        else {
            if (o >= c) {
                o = 0
                c = 0
            }
        }
    }
        
    return maxLen
}