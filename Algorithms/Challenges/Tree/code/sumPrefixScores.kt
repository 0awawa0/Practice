
/*
You are given an array words of size n consisting of non-empty strings.

We define the score of a string word as the number of strings words[i] such that word is a prefix of words[i].

    For example, if words = ["a", "ab", "abc", "cab"], then the score of "ab" is 2, since "ab" is a prefix of both "ab" and "abc".

Return an array answer of size n where answer[i] is the sum of scores of every non-empty prefix of words[i].

Note that a string is considered as a prefix of itself.
*/


class Trie {
    class Node(
        val value: Char, 
        val children: Array<Node?> = arrayOfNulls(26), 
        var count: Int = 0
    )
    
    private val root = Node('_')
    
    fun add(word: String) {
        var currNode = root
        for (char in word) {
            if (currNode.children[char - 'a'] == null) 
                currNode.children[char - 'a'] = Node(char)
                
            currNode = currNode.children[char - 'a']!!
            currNode.count++
        }
    }
    
    fun count(word: String): Int {
        var currNode = root
        var total = 0
        for (char in word) {
            val nextNode = currNode.children[char - 'a'] ?: return total
            currNode = nextNode
            total += currNode.count
        }
        return total
    }
}

fun sumPrefixScores(words: Array<String>): IntArray {
    val trie = Trie()
    for (word in words) trie.add(word)
    return IntArray(words.size) { trie.count(words[it]) }
}