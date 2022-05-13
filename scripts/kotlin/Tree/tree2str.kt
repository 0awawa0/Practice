
/*
Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.
*/

fun tree2str(root: TreeNode?): String {
    val result = StringBuilder()
        
    fun traverse(node: TreeNode?) {
        if (node == null) return
        result.append(node.`val`)
        if (node.left != null) {
            result.append('(')
            traverse(node.left)
            result.append(')')
        }
            
        if (node.right != null) {
            if (node.left == null) result.append("()")
            result.append('(')
            traverse(node.right)
            result.append(')')
        }
    }
        
    traverse(root)
    return result.toString()
}