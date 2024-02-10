
/*
A valid encoding of an array of words is any reference string s and array of indices indices such that:

    words.length == indices.length
    The reference string s ends with the '#' character.
    For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].

Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
*/

class Trie {
    data class Node(val char: Char, val children: Array<Node?> = Array(26) { null }, var childrenCount: Int = 0)
    
    val root = Node('_')
    fun insert(word: String): Node {
        var curr = root
        for (char in word) {
            if (curr.children[char - 'a'] == null) {
                curr.children[char - 'a'] = Node(char)
                curr.childrenCount++
            }
            curr = curr.children[char - 'a']!!
        }
        return curr
    }
}

fun minimumLengthEncoding(words: Array<String>): Int {
    val trie = Trie()
    val map = HashMap<Trie.Node, String>()
    for (word in words) map[trie.insert(word.reversed())] = word
    
    var result = 0
    for (node in map) {
        if (node.key.childrenCount == 0) result += node.value.length + 1
    }
    return result
}