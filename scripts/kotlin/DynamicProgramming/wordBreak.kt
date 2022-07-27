
/*
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
*/

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val mem = HashMap<Int, Boolean>()
        
    fun checkCanSplit(currString: String): Boolean {
        if (currString.isEmpty()) return true
        if (mem[currString.length] != null) return mem[currString.length]!!
            
        wordDict.forEach {
            if (currString.startsWith(it)) {
                if (checkCanSplit(currString.substring(it.length))) {
                    mem[currString.length] = true
                    return true
                }
            }
        }
            
        mem[currString.length] = false
        return false
    }
        
    return checkCanSplit(s)
}

class Trie(words: List<String>) {
	class Node(val value: Char) {
		var isWord = false
		val children = Array<Node?>(26) { null }
	}
	val root = Node('_')

	init { for (word in words) insert(word) }

	fun insert(word: String) {
		var currNode = root
		for (char in word) {
			if (currNode.children[char - 'a'] == null)
				currNode.children[char - 'a'] = Node(char)
			currNode = currNode.children[char - 'a']
		}

		currNode.isWord = true
	}
}

fun wordBreak(s: String, wordDict: List<String>): Boolean {
	// This array remembers if we started our 
	// check for each index of s
	val checked = BooleanArray(s.length)

	// This array remembers if we have suceeded in segmenting string
	// starting from certain index of s
	val result = BooleanArray(s.length)

	val trie = Trie(wordDict)

	fun checkCanSplit(
		idx: Int,
		currNode: Trie.Node, 
		isWordStart: Boolean
	): Boolean {
		// When we reached the end of the string check that
		// the current trie node marked as an end of a word
		if (idx >= s.length) return currNode.isWord

		// If this is a start of the word and we have already
		// tried segmenting starting from this index then we
		// can return remembered answer
		if (isWordStart && checkd[idx]) return result[idx]

		var answer = false
		val childNode = currNode.children[s[idx] - 'a']
		if (childNode != null) {
			// If the word is ended here, then we can either
			// continue searching a longer word, or start looking
			// for a new word from the top of the trie
			if (childNode.isWord) 
				answer = answer || checkCanSplit(
					idx + 1, 
					trie.root, 
					true
				)

			answer = answer || checkCanSplit(
				idx + 1, 
				childNode, 
				false
			)
		}

		// We only remember result if the word started at this index
		if (isWordStart) {
			checked[idx] = true
			result[idx] = answer
		}

		return answer
	}

	return checkCanSplit(0, trie.root, true)
}