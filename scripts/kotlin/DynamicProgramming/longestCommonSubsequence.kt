
/*
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
A common subsequence of two strings is a subsequence that is common to both strings.
*/

fun longestCommonSubsequence(text1: String, text2: String): Int {
    val mem = Array<IntArray>(text1.length + 1) { IntArray(text2.length + 1) }
        
    for (i in text1.indices) {
        for (j in text2.indices) {
            if (text1[i] == text2[j]) mem[i + 1][j + 1] = mem[i][j] + 1
            else mem[i + 1][j + 1] = maxOf(mem[i][j + 1], mem[i + 1][j])
        }
    }
    return mem[text1.length][text2.length]
}