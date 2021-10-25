
/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.
*/

class Solution {
    
    fun frequencySort(s: String): String {
        
        val frequencies = HashMap<Char, Int>()
        val sets = HashMap<Int, Node?>()
        val string = s.toCharArray()
        
        var maximumFreq = 0
        
        sets[0] = Node(0)
        for (char in string) {
            
            val freq = frequencies[char] ?: 0
            val currSet = sets[freq]!!
            val nextSet = sets[freq + 1] ?: Node(freq + 1)
            
            currSet.characterSet.remove(char)
            nextSet.characterSet.add(char)
            
            linkNodes(currSet, nextSet)
            
            maximumFreq = maxOf(maximumFreq, freq + 1)
            frequencies[char] = freq + 1
            
            sets[freq + 1] = nextSet
        }
        
        val result = CharArray(string.size) { ' ' }
        var insertPointer = 0
        var currNode = sets[maximumFreq]
        while (currNode != null) {
            for (char in currNode.characterSet) {
                for (i in 0 until currNode.freq) {
                    result[insertPointer++] = char
                }
            }
            currNode = currNode.prev
        }
        
        return String(result)
    }
    
    private fun linkNodes(node1: Node, node2: Node) {
        if (node1.characterSet.isEmpty()) {
            if (node1.next != null 
                && (node1.next?.freq ?: 0) != node2.freq) 
            {
                node1.next?.prev = node2
                node2.next = node1.next
            }
            node1.prev?.next = node2
            node2.prev = node1.prev ?: node1
            node1.next = node2
        } else {
            node2.prev = node1
            if (node1.next != null 
                && (node1.next?.freq ?: 0) > node2.freq) 
            {
            	node1.next?.prev = node2
            	node2.next = node1.next
            }
        	node1.next = node2
        }
    }
    
    private data class Node(
        val freq: Int,
        var prev: Node? = null,
        var next: Node? = null,
        val characterSet: HashSet<Char> = HashSet<Char>()
    )
}
