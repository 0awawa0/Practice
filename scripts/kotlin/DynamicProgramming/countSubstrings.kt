
/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.
*/

fun countSubstrings(s: String): Int {
        
    fun countPalindromes(start: Int, end: Int): Int {
        var count = 0
        var left = start
        var right = end
        while (left >= 0 && right < s.length) {
            if (s[left--] != s[right++]) return count
            count++
        }
        return count
    }
        
    var result = 0
    for (i in s.indices) result += countPalindromes(i, i) + countPalindromes(i, i + 1)
    return result
}