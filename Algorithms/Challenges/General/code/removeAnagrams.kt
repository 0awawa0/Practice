
/*
You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.

In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.

Return words after performing all operations. It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the original letters exactly once. For example, "dacb" is an anagram of "abdc".
*/

fun removeAnagrams(words: Array<String>): List<String> {
    var anchor = 0
    val result = LinkedList<String>()
    result.add(words[anchor])
        
    for (i in 1 until words.size) {
        if (!areAnagrams(words[anchor], words[i])) {
            result.add(words[i])
            anchor = i
        }
    }
        
    return result
}
    
fun areAnagrams(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    
    val freqs = IntArray(26)
    for (i in word1.indices) {
        freqs[word1[i] - 'a']++
        freqs[word2[i] - 'a']--
    }
        
    return freqs.all { it == 0 }
}