
/*
You are given two string arrays words1 and words2.

A string b is a subset of string a if every letter in b occurs in a including multiplicity.

    For example, "wrr" is a subset of "warrior" but is not a subset of "world".

A string a from words1 is universal if for every string b in words2, b is a subset of a.

Return an array of all the universal strings in words1. You may return the answer in any order.
*/

fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
    val requiredFrequencies = IntArray(26)
    for (word in words2) {
        val wordFrequencies = IntArray(26)
        for (char in word) {
            val idx = char - 'a'
            wordFrequencies[idx]++
            requiredFrequencies[idx] = maxOf(requiredFrequencies[idx], wordFrequencies[idx])
        }
    }
    
    val result = ArrayList<String>()
    for (word in words1) {
        val wordFrequencies = IntArray(26)
        for (char in word) wordFrequencies[char - 'a']++
        var isUniversal = true
        for (i in requiredFrequencies.indices) {
            if (wordFrequencies[i] < requiredFrequencies[i]) isUniversal = false
        }
        if (isUniversal) result.add(word)
    }
    
    return result
}