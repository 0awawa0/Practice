
/*
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

    + s = s1 + s2 + ... + sn
    + t = t1 + t2 + ... + tm
    + |n - m| <= 1
    + The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...

Note: a + b is the concatenation of strings a and b.
*/

fun isInterleave(s1: String, s2: String, s3: String): Boolean {
    if (s3.length != s1.length + s2.length) return false
    
    val mem = BooleanArray(s2.length + 1)
    for (i in 0..s1.length) {
        for (j in 0..s2.length) {
            if (i == 0 && j == 0) mem[j] = true
            else if (i == 0) mem[j] = mem[j - 1] && s2[j - 1] == s3[i + j - 1]
            else if (j == 0) mem[j] = mem[j] && s1[i - 1] == s3[i + j - 1]
            else mem[j] = (mem[j] && s1[i - 1] == s3[i + j - 1]) || (mem[j - 1] && s2[j - 1] == s3[i + j - 1])
        }
    }
    return mem.last()
}