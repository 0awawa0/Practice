
/*
For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 10^9 + 7.
*/

fun kInversePairs(n: Int, k: Int): Int {
    val modulus = 1_000_000_007
    val mem = Array<IntArray>(n + 1) { IntArray(k + 1) }
    
    for (i in 1..n) {
        for (j in 0..k) {
            if (j == 0) mem[i][j] = 1
            else for (p in 0..minOf(i - 1, j)) mem[i][j] = (mem[i][j] + mem[i - 1][j - p]) % modulus
        }
    }
    
    return mem[n][k]
}