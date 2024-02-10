
/*
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
*/

class Codec() {
	// Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        if (root == null) return ""
        
        val result = StringBuilder()
        with(result) {
            append(root.`val`)
            val left = serialize(root.left)
            val right = serialize(root.right)
            if (left != "" || right != "") append("($left)")
            if (right != "") append("($right)")
        }
        
        return result.toString()
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if (data.isBlank()) return null
        
        var position = 0
        
        fun dfs(): TreeNode? {
            if (data[position] == ')') {
                position++
                return null
            }
            
            val sign = if (data[position] == '-') -1 else 1
            if (sign < 0) position++
            
            var number = Character.getNumericValue(data[position++])
            while(position < data.length && data[position].isDigit()) 
                number = number * 10 + Character.getNumericValue(data[position++])
            
            val node = TreeNode(sign * number)
            if (position < data.length && data[position] == '(') {
                position++
                node.left = dfs()
            }
            if (position < data.length && data[position] == '(') {
                position++
                node.right = dfs()
            }
            position++
            return node
        }
        
        return dfs()
    }
}