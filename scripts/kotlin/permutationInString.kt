

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise. 
In other words, return true if one of s1's permutations is the substring of s2.
*/

fun checkInclusion(s1: String, s2: String): Boolean {
        
    if (s1.length > s2.length) return false
        
    val firstCountsArray = IntArray(26)
    val secondCountsArray = IntArray(26)
        
    for (i in 0 until s1.length) {
        firstCountsArray[s1[i] - 'a']++
        secondCountsArray[s2[i] - 'a']++
    }
        
    var count = 0
    for (i in 0 until 26) {
        if (firstCountsArray[i] == secondCountsArray[i]) count++
    }
        
    for (i in 0 until s2.length - s1.length) {
        val left = s2[i] - 'a'
        val right = s2[i + s1.length] - 'a'
            
        if (count == 26) return true
            
        secondCountsArray[right]++
        if (secondCountsArray[right] == firstCountsArray[right]) count++
        else if (secondCountsArray[right] == firstCountsArray[right] + 1) count--
            
        secondCountsArray[left]--
        if (secondCountsArray[left] == firstCountsArray[left]) count++
        else if (secondCountsArray[left] == firstCountsArray[left] - 1) count--
    }
        
    return count == 26
}
