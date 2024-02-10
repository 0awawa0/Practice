
/*
Design a special dictionary with some words that searchs the words in it by a prefix and a suffix.

Implement the WordFilter class:

    WordFilter(string[] words) Initializes the object with the words in the dictionary.
    f(string prefix, string suffix) Returns the index of the word in the dictionary, which has the prefix prefix and the suffix suffix. If there is more than one valid index, return the largest of them. If there is no such word in the dictionary, return -1.

*/


class WordFilter(words: Array<String>) {

    data class TrieNode(var weight: Int = 0, val children: Array<TrieNode?> = Array(27) { null })
    
    private val trie = TrieNode()
    init {
        for (weight in words.indices) {
            val word = words[weight] + "{"
            for (i in word.indices) {
                var curr = trie
                curr.weight = weight
                for (j in i until 2 * word.length - 1) {
                    val k = word[j % word.length] - 'a'
                    if (curr.children[k] == null) curr.children[k] = TrieNode()
                    curr = curr.children[k]!!
                    curr.weight = weight
                }
            }
        }
    }
    
    fun f(prefix: String, suffix: String): Int {
        var curr = trie
        for (letter in suffix + "{"+ prefix) curr = curr.children[letter - 'a'] ?: return -1    
        return curr.weight
    }

}