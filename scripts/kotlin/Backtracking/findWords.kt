
/*
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
*/

class Trie(words: Array<String>) {
    class Node(
        val value: Char, 
        val children: Array<Node?> = Array<Node?>(26) { null }, 
        var isWord: Boolean = false
    )
        
    val root = Node('_')
        
    init { words.forEach { add(it) } }
        
    fun add(word: String) {
        var currNode = root
        for (char in word) {
            if (currNode.children[char - 'a'] == null) 
	            currNode.children[char - 'a'] = Node(char)
            currNode = currNode.children[char - 'a']!!
        }
            
        currNode.isWord = true
    }
}
    
fun findWords(
	board: Array<CharArray>, 
	words: Array<String>
): List<String> {
    val trie = Trie(words)
    val result = HashSet<String>()
    val visited = Array<BooleanArray>(board.size) { 
	    BooleanArray(board[it].size) 
	}
        
    fun backtrack(
	    x: Int, 
	    y: Int, 
	    currNode: Trie.Node, 
	    currWord: String
	) {
        if (x < 0 || x > board.lastIndex) return
        if (y < 0 || y > board[x].lastIndex) return
        if (visited[x][y]) return
            
        val childNode = currNode.children[board[x][y] - 'a']
        if (childNode == null) return
            
        visited[x][y] = true
        val newWord = currWord + childNode.value
            
        if (childNode.isWord) result.add(newWord)
        backtrack(x - 1, y, childNode, newWord)
        backtrack(x + 1, y, childNode, newWord)
        backtrack(x, y - 1, childNode, newWord)
        backtrack(x, y + 1, childNode, newWord)
        visited[x][y] = false
    }
        
    for (x in board.indices)
        for (y in board[x].indices) 
	        backtrack(x, y, trie.root, "")
        
    return result.toList()
}