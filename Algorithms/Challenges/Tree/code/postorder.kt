
/*
Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
*/

fun postorder(root: Node?): List<Int> {
    if (root == null) return emptyList()
    val result = LinkedList<Int>()
    for (node in root.children) result.addAll(postorder(node))
    result.add(root.`val`)
    return result
}