
/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

    countAndSay(1) = "1"
    countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.

To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.
Given a positive integer n, return the nth term of the count-and-say sequence.
*/

fun countAndSay(n: Int): String {
    if (n == 1) return "1"
    val recRes = countAndSay(n - 1)
        
    val result = StringBuilder()
    var dig = recRes[0]
    var currCount = 1
    for (i in 1 until recRes.length) {
        if (recRes[i] != dig) {
            result.append(currCount)
            result.append(dig)
            currCount = 1
            dig = recRes[i]
        } else currCount++
    }
        
    result.append(currCount)
    result.append(dig)
    return result.toString()
}