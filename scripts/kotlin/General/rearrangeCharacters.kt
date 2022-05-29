
/*
You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.

Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.
*/

fun rearrangeCharacters(s: String, target: String): Int {
    val freqs = IntArray(26)
    for (ch in s) freqs[ch - 'a']++
        
    val freqs2 = IntArray(26)
    for (ch in target) freqs2[ch - 'a']++
        
    var min = Int.MAX_VALUE
    for (ch in target) min = minOf(min, freqs[ch - 'a'] / freqs2[ch - 'a'])
    return min
}