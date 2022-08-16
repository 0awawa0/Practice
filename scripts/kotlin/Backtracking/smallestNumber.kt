
/*
You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.

A 0-indexed string num of length n + 1 is created using the following conditions:

    num consists of the digits '1' to '9', where each digit is used at most once.
    If pattern[i] == 'I', then num[i] < num[i + 1].
    If pattern[i] == 'D', then num[i] > num[i + 1].

Return the lexicographically smallest possible string num that meets the conditions.
*/

fun smallestNumber(pattern: String): String {
        
    val usedChars = BooleanArray(9)
    fun backtrack(idx: Int, currentString: String): String? {
        if (idx > pattern.lastIndex) {
            return currentString
        }
        
        val prevChar = currentString.last()
        for (num in '1'..'9') {
            if (usedChars[num - '1']) continue
            if (pattern[idx] == 'I') {
                if (num > prevChar) {
                    usedChars[num - '1'] = true
                    val res = backtrack(idx + 1, currentString + num)
                    usedChars[num - '1'] = false
                    if (res != null) return res
                }
            } 
                
            if (pattern[idx] == 'D') {
                if (num < prevChar) {
                    usedChars[num - '1'] = true
                    val res = backtrack(idx + 1, currentString + num)
                    usedChars[num - '1'] = false
                    if (res != null) return res
                }
            }
        }
        return null
    }
    
    for (startingNum in '1'..'9') {
        usedChars[startingNum - '1'] = true
        val res = backtrack(0, startingNum.toString())
        if (res != null) return res
        usedChars[startingNum - '1'] = false
    }
    
    return ""
}