
/*
A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.
*/

fun minDeletions(s: String): Int {
    val freqs = IntArray(26)
    for (char in s) freqs[char - 'a']++
    
    freqs.sortDescending()
    
    var count = 0
    var maxFreq = freqs[0]
    
    for (i in freqs.indices) {
        if (freqs[i] > maxFreq) {
            count += freqs[i] - maxFreq
            freqs[i] = maxFreq
        }
        
        maxFreq = maxOf(0, freqs[i] - 1)
    }
    return count
}