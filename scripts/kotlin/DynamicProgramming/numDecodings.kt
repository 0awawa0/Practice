

/*
A message containing letters from A-Z can be encoded into numbers using the following mapping:

'A' -> "1"
'B' -> "2"
...
'Z' -> "26"

To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

    "AAJF" with the grouping (1 1 10 6)
    "KJF" with the grouping (11 10 6)

Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

Given a string s containing only digits, return the number of ways to decode it.
*/

fun numDecodings(s: String): Int {
    val mem = IntArray(s.length + 1)
    mem[0] = 1
    mem[1] = if (s[0] == '0') 0 else 1
        
    for (i in 2 .. s.length) {
        val firstNum = s.substring(i - 1 until i).toInt()
        val secondNum = s.substring(i - 2 until i).toInt()
        if (firstNum in 1..9) mem[i] += mem[i - 1]
        if (secondNum in 10..26) mem[i] += mem[i - 2]
    }
    return mem.last()
}