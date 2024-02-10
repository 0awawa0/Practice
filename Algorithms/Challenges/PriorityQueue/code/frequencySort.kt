
/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.
*/


fun frequencySort(s: String): String {
    val freqs = HashMap<Char, Int>()
    for (char in s) freqs[char] = (freqs[char] ?: 0) + 1
        
    val queue = PriorityQueue<Pair<Char, Int>>(compareByDescending { it.second })
    for ((key, freq) in freqs) queue.add(Pair(key, freq))
        
    val builder = StringBuilder()
    while(queue.isNotEmpty()) {
        val (char, count) = queue.poll()
        repeat(count) { builder.append(char) }
    }
        
    return builder.toString()
}