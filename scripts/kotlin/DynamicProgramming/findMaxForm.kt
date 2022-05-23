
/*
You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
*/

fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
    val mem = Array<IntArray>(m + 1) { IntArray(n + 1) }
    for (str in strs) {
        var ones = 0
        var zeros = 0
        for (char in str) {
            if (char == '1') ones++
            else zeros++
        }
            
        for (i in m downTo zeros) {
            for (j in n downTo ones) {
                mem[i][j] = maxOf(mem[i][j], mem[i - zeros][j - ones] + 1)
            }
        }
    }
        
    return mem[m][n]
}