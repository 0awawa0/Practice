

/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
*/

fun reverseStr(s: String, k: Int): String {
    var startIndex = 0
        
    val result = StringBuilder()
    while (startIndex < s.length) {
        var endIndex = minOf(s.lastIndex, startIndex + k - 1)
            
        for (i in endIndex downTo startIndex) result.append(s[i])
        for (i in endIndex + 1 .. endIndex + k) if (i < s.length) result.append(s[i])
        
        startIndex += 2 * k
    }
        
    return result.toString()
}