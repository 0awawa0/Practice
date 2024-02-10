
/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
*/

fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val wordFrequencies = HashMap<String, Int>()
    words.forEach { wordFrequencies[it] = (wordFrequencies[it] ?: 0) + 1 }
    
    val queue = PriorityQueue<Pair<String, Int>>(compareByDescending <Pair<String, Int>>{ it.second }.thenBy { it.first })
    queue.addAll(wordFrequencies.map { it.key to it.value })
    val result = ArrayList<String>(k)
    repeat(k) { result.add(queue.poll().first) }
    return result
}


fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val wordFrequencies = HashMap<String, Int>()
    words.forEach { wordFrequencies[it] = (wordFrequencies[it] ?: 0) + 1 }
    
    val buckets = MutableList<MutableList<String>>(words.size) { mutableListOf() }
    
    for (key in wordFrequencies.keys) buckets[wordFrequencies[key]!! - 1].add(key)
    
    val result = ArrayList<String>()
    for (i in words.lastIndex downTo 0) {
        if (buckets[i].size == 0) continue
        buckets[i].sort()
        repeat(minOf(k - result.size, buckets[i].size)) { result.add(buckets[i][it]) }
        if (result.size == k) break
    }
    return result
}