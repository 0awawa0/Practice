# Linked List

## [MyLinkedList](./code/MyLinkedList.kt)
Doubly linked list implementation

## [Has Loop](./code/hasLoop.kt)
Given head, the head of a linked list, determine if the linked list has a cycle in it.

## [Find Loop Start](./code/findLoopStart.kt)
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

## [Find Intersection](./code/findIntersection.kt)
Write a program to find the node at which the intersection of two singly linked lists begins.

## [Middle Node](./code/middleNode.kt)
Given a non-empty, singly linked list with head node head, return a middle node of linked list. If there are two middle nodes, return the second middle node.

## [Remove Nth From End](./code/removeNthFromEnd.kt)
Given the head of a linked list, remove the nth node from the end of the list and return its head.

## [Reverse List](./code/reverseList.kt)
Reverse a singly linked list.

## [Remove Elements](./code/removeElements.kt)
Remove all elements from a linked list of integers that have value val.

## [Odd Even List](./code/oddEvenList.kt)
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes. You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

## [Palindrome](./code/palindrome.kt)
Given a singly linked list, determine if it is a palindrome.

## [Merge Two Lists](./code/mergeTwoLists.kt)
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

## [Add Two Numbers](./code/addTwoNumbers.kt)
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## [Rotate Right](./code/rotateRight.kt)
Given the head of a linked list, rotate the list to the right by k places.

## [Flatten Linked List](./code/flattenLinkedList.kt)
You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure. Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

## [Linked List Random](./code/linkedListRandom.kt)
Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

## [Delete Duplicates](./code/deleteDuplicates.kt)
Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

## [Swap Pairs](./code/swapPairs.kt)
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

## [Sort List](./code/sortList.kt)
Given the head of a linked list, return the list after sorting it in ascending order.

## [Delete Duplicates 2](./code/deleteDuplicates2.kt)
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

## [Copy Random List](./code/copyRandomList.kt)
A linked list of length `n` is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly `n` brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes `X` and `Y` in the original list, where `X.random --> Y`, then for the corresponding two nodes `x` and `y` in the copied list, `x.random --> y`.

Return the head of the copied linked list.

## [Add Two Numbers](./code/addTwoNumbers.kt)
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number `0` itself.

## [Swap Nodes](./code/swapNodes.kt)
You are given the head of a linked list, and an integer `k`. Return the head of the linked list after swapping the values of the `k`th node from the beginning and the `k`th node from the end (the list is 1-indexed).

## [NestedIterator](./code/NestedIterator.kt)
You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:

    * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
    * int next() Returns the next integer in the nested list.
    * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

Your code will be tested with the following pseudocode:

## [Reverse K Group](./code/reverseKGroup.kt)
Given the head of a linked list, reverse the nodes of the list `k` at a time, and return the modified list. `k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is. You may not alter the values in the list's nodes, only nodes themselves may be changed.

## [Reverse Between](./code/reverseBetween.kt)
Given the head of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position left to position right, and return the reversed list.

## [Partition](./code/partition.kt)
Given the head of a linked list and a value `x`, partition it such that all nodes less than `x` come before nodes greater than or equal to `x`. You should preserve the original relative order of the nodes in each of the two partitions.

## [LRUCache](./code/LRUCache.kt)
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

    LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
    int get(int key) Return the value of the key if the key exists, otherwise return -1.
    void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.