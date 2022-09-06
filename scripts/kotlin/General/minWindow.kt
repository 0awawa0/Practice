
/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.
*/

fun minWindow(s: String, t: String): String {
    if (t.length > s.length) return ""
    if (t.length == 0) return ""
    
    val counts = HashMap<Char, Int>()
    val tChars = t.toSet()
    val requiredChars = HashSet<Char>()
    for (char in t) { 
        counts[char] = (counts[char] ?: 0) + 1
        requiredChars.add(char)
    }
    
    var left = 0
    var right = 0
    var bestPair = Pair(s.lastIndex, s.lastIndex)
    
    while (true) {
        if (requiredChars.isNotEmpty()) {
            if (right > s.lastIndex) break
            
            val newCount = (counts[s[right]] ?: 1) - 1
            counts[s[right]] = newCount
            
            if (s[right] in tChars && newCount <= 0) requiredChars.remove(s[right])
            right++
            
        } else {
            if (left >= right) break
            
            val currBest = bestPair.second - bestPair.first + 1
            if (right - left + 1 < currBest || bestPair.first == s.lastIndex) bestPair = left to right
            
            val newCount = (counts[s[left]] ?: 0) + 1
            counts[s[left]] = newCount
            
            if (s[left] in tChars && newCount > 0) requiredChars.add(s[left])
            left++
        }
    }
    
    return s.substring(bestPair.first, bestPair.second)
}