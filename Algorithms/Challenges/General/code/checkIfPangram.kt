
/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
*/

fun checkIfPangram(sentence: String): Boolean {
    val freqs = IntArray(26)
    for (char in sentence) freqs[char - 'a']++
    return freqs.all { it > 0 }
}