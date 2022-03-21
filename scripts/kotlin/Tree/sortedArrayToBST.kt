/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
*/

fun sortedArrayToBST(nums: IntArray): TreeNode? {
        
  fun process(left: Int, right: Int): TreeNode? {
    if (right - left == 1) {
      val root = TreeNode(nums[right])
      root.left = TreeNode(nums[left])
      return root
    }
    if (left == right) return TreeNode(nums[left])
            
    val middle = left + (right - left) / 2
    val middleNode = TreeNode(nums[middle])
    val leftSubtree = process(left, middle - 1)
    val rightSubtree = process(middle + 1, right)
            
    middleNode.left = leftSubtree
    middleNode.right = rightSubtree
    return middleNode
  }
        
  return process(0, nums.size - 1)
}
