
/*
Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
*/

class Trie {
    class Node(
	    val value: Char, 
		val children: Array<Node?> = arrayOfNulls(26), 
		var endsCount: Int = 0
	)
        
    private val root = Node('_')
        
    fun insert(word: String) {
        var currNode = root
        for (char in word) {
            if (currNode.children[char - 'a'] == null)
	            currNode.children[char - 'a'] = Node(char)
            currNode = currNode.children[char - 'a']!!
        }
        currNode.endsCount++
    }
        
    fun countWords(
	    target: String, 
		searchPosition: Int, 
		currNode: Node? = root
	): Int {
        if (currNode == null) return 0
        val nextPosition = target.indexOf(
	        currNode.value, 
	        searchPosition
	    )
        if (currNode.value != '_' && nextPosition == -1) return 0
        var result = currNode.endsCount
        for (i in 0..25) 
	        result += countWords(
		        target, 
		        nextPosition + 1, 
		        currNode.children[i]
		    )
        return result
    }
}
    
fun numMatchingSubseq(s: String, words: Array<String>): Int {
    val trie = Trie()
    for (word in words) trie.insert(word)
    return trie.countWords(s, 0)
}
