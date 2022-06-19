
/*
You are given an array of strings products and a string searchWord.

Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return a list of lists of the suggested products after each character of searchWord is typed.
*/

class Trie {
    class Node(var isWord: Boolean = false, val children: Array<Node?> = Array(26) { null })
    
    val root = Node()
    
    fun insert(word: String) {
        var curr = root
        for (char in word) {
            if (curr.children[char - 'a'] == null) curr.children[char - 'a'] = Node()
            curr = curr.children[char - 'a']!!
        }
        
        curr.isWord = true
    }
    
    fun getWordsStartingWith(prefix: String): List<String> {
        var curr = root
        val result = LinkedList<String>()
        for (char in prefix) {
            curr = curr.children[char - 'a'] ?: return result
        }
        
        fun dfs(node: Trie.Node, currPrefix: String) {
            if (result.size == 3) return
            if (node.isWord) result.add(currPrefix)
            
            for (char in 'a'..'z') {
                if (node.children[char - 'a'] != null) 
                    dfs(node.children[char - 'a']!!, currPrefix + char)
            }
        }
        
        dfs(curr, prefix)
        return result
    }
}

fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    val trie = Trie()
    val result = LinkedList<List<String>>()
    for (word in products) trie.insert(word)
    var prefix = ""
    for (char in searchWord) {
        prefix += char
        result.add(trie.getWordsStartingWith(prefix))
    }
    return result
}