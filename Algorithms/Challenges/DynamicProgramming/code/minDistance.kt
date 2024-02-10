
/*
Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
In one step, you can delete exactly one character in either string.
*/

fun minDistance(word1: String, word2: String): Int {
    val mem = Array<IntArray>(word1.length + 1) { IntArray(word2.length + 1) }
    for (i in 0..word1.length) {
        for (j in 0..word2.length) {
            if (i == 0 || j == 0) mem[i][j] = i + j
            else if (word1[i - 1] == word2[j - 1]) mem[i][j] = mem[i - 1][j - 1]
            else mem[i][j] = minOf(mem[i - 1][j], mem[i][j - 1]) + 1            
        }        
    }
        
    return mem[word1.length][word2.length]
}