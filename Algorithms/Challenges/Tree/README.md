# Tree

## [Preorder Traversal](./code/preorderTraversal.kt)
Given the root of a binary tree, return the preorder traversal of its nodes' values.

## [Inorder Traversal](./code/inorderTraversal.kt)
Given the root of a binary tree, return the inorder traversal of its nodes' values.

## [Postorder Traversal](./code/postorderTraversal.kt)
Given the root of a binary tree, return the postorder traversal of its nodes' values.

## [Good Nodes](./code/goodNodes.kt)
Given a binary tree `root`, a node `X` in the tree is named good if in the path from root to `X` there are no nodes with a value greater than `X`. Return the number of good nodes in the binary tree.

## [Merge Two Trees](./code/mergeTwoTrees.kt)
You are given two binary trees `root1` and `root2`. Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree. Return the merged tree. Note: The merging process must start from the root nodes of both trees.

## [Populate Next Right Pointer](./code/populateNextRightPointer.kt)
You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

## [Invert Tree](./code/invertTree.kt)
Given the `root` of a binary tree, invert the tree, and return its `root`.

## [Max Ancestor Diff](./code/maxAncestorDiff.kt)
Given the root of a binary tree, find the maximum value `v` for which there exist different nodes `a` and `b` where `v = \|a.val - b.val\|` and `a` is an ancestor of `b`. A node `a` is an ancestor of `b` if either: any child of `a` is equal to `b` or any child of `a` is an ancestor of `b`.

## [Is Same Tree](./code/isSameTree.kt)
Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not. Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

## [Sorted Array to BST](./code/sortedArrayToBST.kt)
Given an integer array `nums` where the elements are sorted in ascending order, convert it to a height-balanced binary search tree. A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

## [Is Balanced](./code/isBalanced.kt)
Given a binary tree, determine if it is height-balanced. A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than `1`.

## [Min Depth](./code/minDepth.kt)
Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node. Note: A leaf is a node with no children.

## [Has Path Sum](./code/hasPathSum.kt)
Given the root of a binary tree and an integer `targetSum`, return `true` if the tree has a root-to-leaf path such that adding up all the values along the path equals `targetSum`.

## [Width of Binary Tree](./code/widthOfBinaryTree.kt)
Given the root of a binary tree, return the maximum width of the given tree.

## [Binary Tree Paths](./code/binaryTreePaths.kt)
Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children.

## [Lowest Common Ancestor](./code/lowestCommonAncestor.kt)
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

## [Nary Preorder Traversal](./scripts/kotlin/Tree/naryPreorderTraversal.kt)
Given the root of an `n`-ary tree, return the preorder traversal of its nodes' values.

## [Is Subpath](./code/isSubPath.kt)
Given a binary tree `root` and a linked list with `head` as the first node. Return `True` if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return `False`.

## [Find Mode](./code/findMode.kt)
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it. If the tree has more than one mode, return them in any order.

## [Level Order](./code/levelOrder.kt)
Given an `n`-ary tree, return the level order traversal of its nodes' values.

## [Num of Minutes](./code/numOfMinutes.kt)
A company has n employees with a unique ID for each employee from 0 to n - 1. The head of the company is the one with headID.

Each employee has one direct manager given in the manager array where manager[i] is the direct manager of the i-th employee, manager[headID] = -1. Also, it is guaranteed that the subordination relationships have a tree structure.

The head of the company wants to inform all the company employees of an urgent piece of news. He will inform his direct subordinates, and they will inform their subordinates, and so on until all employees know about the urgent news.

The i-th employee needs informTime[i] minutes to inform all of his direct subordinates (i.e., After informTime[i] minutes, all his direct subordinates can start spreading the news).

Return the number of minutes needed to inform all the employees about the urgent news.

## [BSTIterator](./code/BSTIterator.kt)
Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):

    BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
    boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
    int next() Moves the pointer to the right, then returns the number at the pointer.

Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.

## [Get Minimum Difference](./code/getMinimumDifference.kt)
Given the `root` of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

## [Search BST](./code/searchBST.kt)
You are given the root of a binary search tree (BST) and an integer `val`. Find the node in the BST that the node's value equals `val` and return the subtree rooted with that node. If such a node does not exist, return `null`.

## [Trim BST](./code/trimBST.kt)
Given the root of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer. Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.

## [Convert BST](./code/convertBST.kt)
Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.

## [Increasing BST](./code/increasingBST.kt)
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

## [kth Smallest](./code/kthSmallest.kt)
Given the root of a binary search tree, and an integer `k`, return the `k`th smallest value (`1`-indexed) of all the values of the nodes in the tree.

## [Recover Tree](./code/recoverTree.kt)
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.

## [Connect](./code/connect.kt)
Given a binary tree. Populate each `next` pointer to point to its next right node. If there is no next right node, the `next` pointer should be set to `NULL`. Initially, all next pointers are set to `NULL`.

## [Is Subtree](./code/isSubtree.kt)
Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values of `subRoot` and `false` otherwise. A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

## [MyCalendar](./code/MyCalendar.kt)
You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.

A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).

The event can be represented as a pair of integers start and end that represents a booking on the half-open interval [start, end), the range of real numbers x such that start <= x < end.

Implement the MyCalendar class:

    * MyCalendar() Initializes the calendar object.
    * boolean book(int start, int end) Returns true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.

## [SeatManager](./code/SeatManager.kt)
Design a system that manages the reservation state of n seats that are numbered from 1 to n.

Implement the SeatManager class:

    + SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n. All seats are initially available.
    + int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
    + void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.

## [Minimum Deviation](./code/minimumDeviation.kt)
You are given an array nums of n positive integers.

You can perform two types of operations on any element of the array any number of times:

    If the element is even, divide it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
    If the element is odd, multiply it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].

The deviation of the array is the maximum difference between any two elements in the array.

Return the minimum deviation the array can have after performing some number of operations.

## [WordDictionary](./code/WordDictionary.kt)
Design a data structure that supports adding new words and finding if a string matches any previously added string.

## [Find Min Height Trees](./code/findMinHeightTrees.kt)
Given a tree of n nodes labelled from `0` to `n - 1`, and an array of `n - 1` edges where `edges[i] = [ai, bi]` indicates that there is an undirected edge between the two nodes `ai` and `bi` in the tree, you can choose any node of the tree as the root. When you select a node `x` as the root, the result tree has height `h`. Among all possible rooted trees, those with minimum height (i.e. `min(h)`)  are called minimum height trees (MHTs). Return a list of all MHTs' root labels. You can return the answer in any order.

## [Max Depth](./code/maxDepth.kt)
Given a `n`-ary tree, find its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## [Postorder](./code/postorder.kt)
Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

## [Average of Subtree](./code/averageOfSubtree.kt)
Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.

## [Tree2Str](./code/tree2str.kt)
Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it. Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

## [Average of Levels](./code/averageOfLevels.kt)
Given the `root` of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within `10^-5` of the actual answer will be accepted.

## [Get Target Copy](./code/getTargetCopy.java)
Given two binary trees `original` and `cloned` and given a reference to a node `target` in the original tree. The `cloned` tree is a copy of the `original` tree. Return a reference to the same node in the `cloned` tree. Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.

## [Is Valid BST](./code/isValidBST.kt)
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

## [Find Target](./code/findTarget.kt)
Given the root of a Binary Search Tree and a target number `k`, return true if there exist two elements in the BST such that their sum is equal to the given target.

## [Zig Zag Level Order](./code/zigZagLevelOrder.kt)
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

## [Build Tree](./code/buildTree.kt)
Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return the binary tree.

## [Right Side View](./code/rightSideView.kt)
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

## [Path Sum](./code/pathSum.kt)
Given the root of a binary tree and an integer `targetSum`, return all root-to-leaf paths where the sum of the node values in the path equals `targetSum`. Each path should be returned as a list of the node values, not node references. A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

## [TreeSerialization](./code/TreeSerialization.kt)
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment. Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

## [Min Camera Cover](./code/minCameraCover.kt)
You are given the root of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children. Return the minimum number of cameras needed to monitor all nodes of the tree.

## [WordFilter](./code/WordFilter.kt)
Design a special dictionary with some words that searchs the words in it by a prefix and a suffix.

## [Suggest Product](./code/suggestProducts.kt)
You are given an array of strings `products` and a string `searchWord`. Design a system that suggests at most three product names from `products` after each character of `searchWord` is typed. Suggested products should have common prefix with `searchWord`. If there are more than three products with a common prefix return the three lexicographically minimums products. Return a list of lists of the suggested products after each character of `searchWord` is typed.

## [Minimum Length Encoding](./code/minimumLengthEncoding.kt)
A valid encoding of an array of words is any reference string s and array of indices indices such that:

    words.length == indices.length
    The reference string s ends with the '#' character.
    For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].

Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.

## [Evaluate Tree](./code/evaluateTree.kt)
You are given the root of a full binary tree with the following properties:

    Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
    Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.

The evaluation of a node is as follows:

    If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
    Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.

Return the boolean result of evaluating the root node.

A full binary tree is a binary tree where each node has either 0 or 2 children.

A leaf node is a node that has zero children.

## [Num Matching Subseq](./code/numMatchingSubseq.kt)
Given a string `s` and an array of strings `words`, return the number of `words[i]` that is a subsequence of `s`. A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

## [Flatten](./code/flatten.kt)
Given the root of a binary tree, flatten the tree into a "linked list":

    The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
    The "linked list" should be in the same order as a pre-order traversal of the binary tree.

## [Reachable Nodes](./code/reachableNodes.kt)
There is an undirected tree with `n` nodes labeled from `0` to `n - 1` and `n - 1` edges. You are given a 2D integer array `edges` of length `n - 1` where `edges[i] = [ai, bi]` indicates that there is an edge between nodes `ai` and `bi` in the tree. You are also given an integer array `restricted` which represents restricted nodes. Return the maximum number of nodes you can reach from node `0` without visiting a restricted node. Note that node `0` will not be a restricted node.

## [Amount of Time](./code/amountOfTime.kt)
You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.

Each minute, a node becomes infected if:

    The node is currently uninfected.
    The node is adjacent to an infected node.

Return the number of minutes needed for the entire tree to be infected.

## [Path Sum III](./code/pathSumIII.kt)
Given the root of a binary tree and an integer `targetSum`, return the number of paths where the sum of the values along the path equals `targetSum`. The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

## [Distance K](./code/distanceK.kt)
Given the root of a binary tree, the value of a target node `target`, and an integer `k`, return an array of the values of all nodes that have a distance `k` from the target node. You can return the answer in any order.

## [Vertical Traversal](./code/verticalTraversal.kt)
Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

Return the vertical order traversal of the binary tree.

## [Min Groups](./code/minGroups.kt)
You are given a 2D integer array `intervals` where `intervals[i] = [lefti, righti]` represents the **inclusive** interval `[lefti, righti]`. You have to divide the intervals into one or more **groups** such that each interval is in **exactly** one group, and no two intervals that are in the same group **intersect** each other. Return _the **minimum** number of groups you need to make_. Two intervals **intersect** if there is at least one common number between them. For example, the intervals `[1, 5]` and `[5, 8]` intersect.

## [Pseudo Palindromic Paths](./code/pseudoPalindromicPaths.kt)
Given a binary tree where node values are digits from `1` to `9`. A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome. Return the number of pseudo-palindromic paths going from the root node to leaf nodes.

## [Reverse Odd Levels](./code/reverseOddLevels.kt)
Given the root of a perfect binary tree, reverse the node values at each odd level of the tree. Return the root of the reversed tree. A binary tree is perfect if all parent nodes have two children and all leaves are on the same level. The level of a node is the number of edges along the path between it and the root node.

## [Sum Prefix Scores](./code/sumPrefixScores.kt)
You are given an array words of size `n` consisting of non-empty strings. We define the score of a string `word` as the number of strings `words[i]` such that `word` is a prefix of `words[i]`. Return an array answer of size `n` where `answer[i]` is the sum of scores of every non-empty prefix of `words[i]`. Note that a string is considered as a prefix of itself.

## [Add One Row](./code/addOneRow.kt)
Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.

Note that the root node is at depth 1.

The adding rule is:

    Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.
    cur's original left subtree should be the left subtree of the new left subtree root.
    cur's original right subtree should be the right subtree of the new right subtree root.
    If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.

## [Max Level Sum](./code/maxLevelSum.kt)
Given the root of a binary tree, the level of its root is `1`, the level of its children is `2`, and so on. Return the smallest level `x` such that the sum of all the values of nodes at level `x` is maximal.
