
/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
*/

fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    var preorderIdx = 0
    val idxMap = HashMap<Int, Int>()
    inorder.forEachIndexed { idx, value -> idxMap[value] = idx }
        
    fun build(start: Int = 0, end: Int = inorder.lastIndex): TreeNode? {
        if (start > end) return null
            
        val root = TreeNode(preorder[preorderIdx++])
            
        val middle = idxMap[root.`val`]!!
        root.left = build(start, middle - 1)
        root.right = build(middle + 1, end)
            
        return root
    }
        
    return  build()
}