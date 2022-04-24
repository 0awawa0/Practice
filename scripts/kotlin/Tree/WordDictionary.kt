
/*
Design a data structure that supports adding new words and finding if a string matches any previously added string.

Implement the WordDictionary class:

    WordDictionary() Initializes the object.
    void addWord(word) Adds word to the data structure, it can be matched later.
    bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.

*/

class WordDictionary() {
    
    private class Trie {
        private val root = Node('.')
        private class Node(val value: Char, val children: Array<Node?> = Array<Node?>(26) { null }, var isWord: Boolean = false)
        
        fun insert(word: String) {
            var currNode = root
            for (char in word) {
                if (currNode.children[char - 'a'] == null) currNode.children[char - 'a'] = Node(char)
                currNode = currNode.children[char - 'a']!!
            }
            currNode.isWord = true
        }
        
        fun _contains(node: Node, word: String, index: Int): Boolean {
            if (index == word.length - 1) {
                if (word[index] == '.') return node.children.any { it != null && it.isWord }
                else return node.children[word[index] - 'a']?.isWord ?: false
            }
            
            if (word[index] == '.') {
                for (n in node.children) {
                    if (n == null) continue
                    if (_contains(n!!, word, index + 1)) return true
                }
                return false
            } else {
                if (node.children[word[index] - 'a'] == null) return false
                return _contains(node.children[word[index] - 'a']!!, word, index + 1)
            }
            
            return false
        }
        
        fun contains(word: String): Boolean {
            return _contains(root, word, 0)
        }
    }

    private val trie = Trie()
    
    fun addWord(word: String) {
        trie.insert(word)
    }

    fun search(word: String): Boolean {
        return trie.contains(word)
    }

}
