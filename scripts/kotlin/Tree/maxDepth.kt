
/*
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

fun maxDepth(root: Node?, depth: Int = 0): Int {
    if (root == null) return depth
    var mD = depth
    for (child in root.children) mD = maxOf(mD, maxDepth(child, depth))
    return mD + 1
}