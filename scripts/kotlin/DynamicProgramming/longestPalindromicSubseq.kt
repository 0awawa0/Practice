
/*
Given a string s, find the longest palindromic subsequence's length in s.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
*/

fun longestPalindromeSubseq(s: String): Int {
    val mem = Array<IntArray>(s.length) { IntArray(s.length) }
    for (i in s.lastIndex downTo 0) {
        mem[i][i] = 1
        for (j in i + 1 until s.length) {
            if (s[i] == s[j]) mem[i][j] = mem[i + 1][j - 1] + 2
            else mem[i][j] = maxOf(mem[i + 1][j], mem[i][j - 1])
        }
    }
    return mem[0].last()
}