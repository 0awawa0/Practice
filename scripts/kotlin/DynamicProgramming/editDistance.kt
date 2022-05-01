
/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

    + Insert a character
    + Delete a character
    + Replace a character

*/

fun minDistance(word1: String, word2: String): Int {
    val mem = Array<IntArray>(word1.length + 1) { IntArray(word2.length + 1) }
    for (i in 0..word1.length) mem[i][0] = i
    for (i in 0..word2.length) mem[0][i] = i
        
    for (i in word1.indices) {
        for (j in word2.indices) {
            if (word1[i] == word2[j]) mem[i + 1][j + 1] = mem[i][j]
            else {
                mem[i + 1][j + 1] = if (mem[i][j] < mem[i][j + 1]) 
                    minOf(mem[i][j], mem[i + 1][j]) 
                else 
                    minOf(mem[i][j + 1], mem[i + 1][j])
                mem[i + 1][j + 1]++
            }
        }
    }
    return mem[word1.length][word2.length]
}