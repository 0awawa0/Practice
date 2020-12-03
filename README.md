# Practice

## Description

This repository contains some simple scripts I made just to improve my programming skills. Also there are solutions for common interview questions.

## Scripts

### 1. [calculate_Pi.py](./scripts/calculate_Pi.py)

This script contains three functions to calculate Pi. Scripts measures time evaluated to calculate n numbers of Pi using different functions. I used three formulas:

1. Bellard's formula:

![bellard](./src/bellard.svg)

2. Bailey-Borwein-Plouff formula:

![bbp](./src/bbp.svg)

3. Chudnovsky formula:

![chudnovsky](./src/chudnovsky.svg)

### 2. [crypto_numbers.py](./scripts/crypto_numbers.py)

This script contains useful functions I used for my cryptography related projects such as generating random prime numbers, factorization of numbers etc.

### 3. [integral_calculator.py](./scripts/integral_calculator.py)

This script contains three functions to calculate integrals:

1. [Rectangle method](https://ipfs.io/ipfs/QmXoypizjW3WknFiJnKLwHCnL72vedxjQkDDP1mXWo6uco/wiki/Rectangle_method.html)

2. [Trapezoidal method](https://en.wikipedia.org/wiki/Trapezoidal_rule)

3. [Simpson's method](https://en.wikipedia.org/wiki/Simpson%27s_rule)

### 4. [Calculator](./scripts/Calculator)

Every beginner programmer must write its own calculator, so here is mine.

### 5. [max_subarray.py](./scripts/max_subarray.py)

This script contains one function that implements searching of the subbarray with highest sum of elements.
Example:

    array: 1 2 3 -9 9 1 -2
    
    max_subarray: 9 1

### 6. [sort.py](./scripts/sort.py)

This script contains different sorting algorithm implementations.


### 7. [fibonacci.py](./scripts/fibonacci.py)

This script contains two functions to calculate n-th number of Fibonacci sequence - slow and fast realisations. Also there is a function to calculate Pisano period and a function for fast calculation of Fn mod m.


### Kotlin

Each script in kotlin folder is made to solve certain task.

| File | Task |
|------|------|
|[atoi](./scripts/kotlin/atoi.kt)| Implement atoi which converts a string to an integer.|
|[evenNumOfDigits](./scripts/kotlin/evenNumOfDigits.kt)|Given an array nums of integers, return how many of them contain an even number of digits.|
|[insertPosition](./scripts/kotlin/insertPosition.kt)|Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.|
|[intToRoman](./scripts/kotlin/intToRoman.kt)|Given an integer, convert it to a roman numeral.|
|[isNumberPalindrome](./scripts/kotlin/isNumberPalindrome.kt)|Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.|
|[lengthOfLongestSubstring](./scripts/kotlin/lengthOfLongestSubstring.kt)|Given string `s`. Find length of the longest substring without repeating characters.|
|[longestCommonPrefix](./scripts/kotlin/longestCommonPrefix.kt)|Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".|
|[maxVolume](./scripts/kotlin/maxVolume.kt)|Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water. Notice that you may not slant the container|
|[reverseInteger](./scripts/kotlin/reverseInteger.kt)|Given a 32-bit signed integer, reverse digits of an integer.|
|[romanToInt](./scripts/kotlin/romanToInt.kt)|Given a roman numeral, convert it to an integer.|
|[sumOfTwo](./scripts/kotlin/sumOfTwo.kt)|Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.|
|[validParentheses](./scripts/kotlin/validParentheses.kt)|Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.|
|[zigZagConvert](./scripts/kotlin/zigZagConvert.kt)|Write the code that will take a string and make this conversion given a number of rows.|
|[numIdenticalPairs](./scripts/kotlin/numIdenticalPairs.kt)|Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j. Return the number of good pairs.|
|[restoreString](./scripts/kotlin/restoreString.kt)|Given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string. Return the shuffled string.|
|[maximumNestingDepth](./scripts/kotlin/maximumNestingDepth.kt)|Given a VPS represented as string s, return the nesting depth of s.|
|[xorOperationInArray](./scripts/kotlin/xorOperationInArray.kt)|Given an integer n and an integer start.Define an array nums where `nums[i] = start + 2*i` (0 indexed) and n == nums.length. Return the bitwise XOR of all elements of nums.|
|[ParkingSystem](./scripts/kotlin/ParkingSystem.kt)|Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.|
|[removeOuterParentheses](./scripts/kotlin/removeOuterParentheses.kt)|Given a valid parentheses string S, consider its primitive decomposition: `S = P_1 + P_2 + ... + P_k`, where `P_i` are primitive valid parentheses strings. Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.|
|[OrderedStream](./scripts/kotlin/OrderedStream.kt)|There is a stream of n (id, value) pairs arriving in an arbitrary order, where id is an integer between 1 and n and value is a string. No two pairs have the same id. Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.|
|[matrixDiagonalSum](./scripts/kotlin/matrixDiagonalSum.kt)|Given a square matrix mat, return the sum of the matrix diagonals. Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.|
|[hammingDistance](./scripts/kotlin/hammingDistance.kt)|The Hamming distance between two integers is the number of positions at which the corresponding bits are different. Given two integers x and y, calculate the Hamming distance.|
|[arrayPairSum](./scripts/kotlin/arrayPairSum.kt)|Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,(an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.|
|[freqAlphabets](./scripts/kotlin/freqAlphabets.kt)|Given a string s formed by digits (`'0'` - `'9'`) and `'#'` . We want to map s to English lowercase characters as follows: Characters (`'a'` to `'i'`) are represented by (`'1'` to `'9'`) respectively. Characters (`'j'` to `'z'`) are represented by (`'10#'` to `'26#'`) respectively. Return the string formed after mapping. It's guaranteed that a unique mapping will always exist.|
|[RecentCounter](./scripts/kotlin/RecentCounter.kt)|You have a RecentCounter class which counts the number of recent requests within a certain time frame. Implement the RecentCounter class|

#### Linked list
| File | Task |
|------|------|
|[MyLinkedList](./scripts/kotlin/LinkedList/MyLinkedList.kt)| Doubly linked list implementation|
|[hasLoop](./scripts/kotlin/LinkedList/hasLoop.kt)|Given head, the head of a linked list, determine if the linked list has a cycle in it.|
|[findLoopStart](./scripts/kotlin/LinkedList/findLoopStart.kt)|Given a linked list, return the node where the cycle begins. If there is no cycle, return null.|
|[findIntersection](./scripts/kotlin/LinkedList/findIntersection.kt)|Write a program to find the node at which the intersection of two singly linked lists begins.|
|[middleNode](./scripts/kotlin/LinkedList/middleNode.kt)|Given a non-empty, singly linked list with head node head, return a middle node of linked list. If there are two middle nodes, return the second middle node.|
