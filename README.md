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

Topics:
+ [General](#General)
+ [DFS & BFS](#dfs--bfs)
+ [Stack](#stack)
+ [Sorting](#sorting)
+ [PriorityQueue](#priorityqueue)
+ [Math](#math)
+ [Dynamic Programming](#dynamicprogramming)
+ [Backtracking](#backtracking)
+ [Tree](#tree)
+ [Binary Search](#binarysearch)
+ [Linked List](#linked-list)

#### General
|File|Task|
|-|-|
|[atoi](./scripts/kotlin/General/atoi.kt)| Implement atoi which converts a string to an integer.|
|[evenNumOfDigits](./scripts/kotlin/General/evenNumOfDigits.kt)|Given an array nums of integers, return how many of them contain an even number of digits.|
|[intToRoman](./scripts/kotlin/General/intToRoman.kt)|Given an integer, convert it to a roman numeral.|
|[lengthOfLongestSubstring](./scripts/kotlin/General/lengthOfLongestSubstring.kt)|Given string `s`. Find length of the longest substring without repeating characters.|
|[longestCommonPrefix](./scripts/kotlin/General/longestCommonPrefix.kt)|Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".|
|[maxVolume](./scripts/kotlin/General/maxVolume.kt)|Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water. Notice that you may not slant the container|
|[romanToInt](./scripts/kotlin/General/romanToInt.kt)|Given a roman numeral, convert it to an integer.|
|[sumOfTwo](./scripts/kotlin/General/sumOfTwo.kt)|Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.|
|[zigZagConvert](./scripts/kotlin/General/zigZagConvert.kt)|Write the code that will take a string and make this conversion given a number of rows.|
|[restoreString](./scripts/kotlin/General/restoreString.kt)|Given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string. Return the shuffled string.|
|[maximumNestingDepth](./scripts/kotlin/General/maximumNestingDepth.kt)|Given a VPS represented as string s, return the nesting depth of s.|
|[xorOperationInArray](./scripts/kotlin/General/xorOperationInArray.kt)|Given an integer n and an integer start.Define an array nums where `nums[i] = start + 2*i` (0 indexed) and n == nums.length. Return the bitwise XOR of all elements of nums.|
|[ParkingSystem](./scripts/kotlin/General/ParkingSystem.kt)|Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.|
|[removeOuterParentheses](./scripts/kotlin/General/removeOuterParentheses.kt)|Given a valid parentheses string S, consider its primitive decomposition: `S = P_1 + P_2 + ... + P_k`, where `P_i` are primitive valid parentheses strings. Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.|
|[OrderedStream](./scripts/kotlin/General/OrderedStream.kt)|There is a stream of n (id, value) pairs arriving in an arbitrary order, where id is an integer between 1 and n and value is a string. No two pairs have the same id. Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.|
|[matrixDiagonalSum](./scripts/kotlin/General/matrixDiagonalSum.kt)|Given a square matrix mat, return the sum of the matrix diagonals. Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.|
|[arrayPairSum](./scripts/kotlin/General/arrayPairSum.kt)|Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,(an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.|
|[freqAlphabets](./scripts/kotlin/General/freqAlphabets.kt)|Given a string s formed by digits (`'0'` - `'9'`) and `'#'` . We want to map s to English lowercase characters as follows: Characters (`'a'` to `'i'`) are represented by (`'1'` to `'9'`) respectively. Characters (`'j'` to `'z'`) are represented by (`'10#'` to `'26#'`) respectively. Return the string formed after mapping. It's guaranteed that a unique mapping will always exist.|
|[RecentCounter](./scripts/kotlin/General/RecentCounter.kt)|You have a RecentCounter class which counts the number of recent requests within a certain time frame. Implement the RecentCounter class|
|[reverseString](./scripts/kotlin/General/reverseString.kt)|Write a function that reverses a string. The input string is given as an array of characters char[]. Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory. You may assume all the characters consist of printable ascii characters.|
|[uniqueOccurrences](./scripts/kotlin/General/uniqueOccurrences.kt)|Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.|
|[removeDuplicates](./scripts/kotlin/General/removeDuplicates.kt)|Given a string `S` of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them. We repeatedly make duplicate removals on S until we no longer can. Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.|
|[findLucky](./scripts/kotlin/General/findLucky.kt)|Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value. Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.|
|[transposeMatrix](./scripts/kotlin/General/transposeMatrix.kt)|Given a matrix `A`, return the transpose of `A`. The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.|
|[distributeCandies](./scripts/kotlin/General/distributeCandies.kt)|We distribute some number of candies, to a row of `n = num_people people` in the following way: We then give `1` candy to the first person, `2` candies to the second person, and so on until we give n candies to the last person. Then, we go back to the start of the row, giving `n + 1` candies to the first person, `n + 2` candies to the second person, and so on until we give `2 * n` candies to the last person. This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift). Return an array (of length num_people and sum candies) that represents the final distribution of candies.|
|[groupAnagrams](./scripts/kotlin/General/groupAnagrams.kt)|Given an array of strings strs, group the anagrams together. You can return the answer in any order. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.|
|[findKClosestElements](./scripts/kotlin/General/findKClosestElements.kt)|Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.|
|[isValidSudoku](./scripts/kotlin/General/isValidSudoku.kt)|Determine if a `9 x 9` Sudoku board is valid|
|[permutationInString](./scripts/kotlin/General/permutationInString.kt)|Given two strings `s1` and `s2`, return true if `s2` contains a permutation of `s1`, or false otherwise. In other words, return true if one of `s1`'s permutations is the substring of `s2`.|
|[longestTurbulentSubarray](./scripts/kotlin/General/longestTurbulentSubarray.kt)|Given an integer array `arr`, return the length of a maximum size turbulent subarray of `arr`. A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.|
|[sprialMatrix](./scripts/kotlin/General/spiralMatrix.kt)|Given an `m x n` matrix, return all elements of the matrix in spiral order.|
|[findAllDuplicates](./scripts/kotlin/General/findAllDuplicates.kt)|Given an integer array nums of length `n` where all the integers of nums are in the range `[1, n]` and each integer appears once or twice, return an array of all the integers that appears twice.|
|[bestTimeToBuyStocks](./scripts/kotlin/General/bestTimeToBuyStocks.kt)|You are given an integer array prices where `prices[i]` is the price of a given stock on the `i`th day. On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day. Find and return the maximum profit you can achieve.|
|[canBeValid](./scripts/kotlin/General/canBeValid.kt)|A parentheses string is a non-empty string consisting only of `'('` and `')'`. It is valid if any of the following conditions is true: 1) It is `()`; 2) It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid parentheses strings. 3) It can be written as `(A)`, where `A` is a valid parentheses string. You are given a parentheses string `s` and a string `locked`, both of length `n`. `locked` is a binary string consisting only of `'0'`s and `'1'`s. For each index `i` of locked, if `locked[i]` is `'1'`, you cannot change `s[i]`. But if `locked[i]` is `'0'`, you can change `s[i]` to either `'('` or `')'`. Return `true` if you can make s a valid parentheses string. Otherwise, return `false`.|
|[findMinArrowShots](./scripts/kotlin/General/findMinArrowShots.kt)|Given the array `points`, return the minimum number of arrows that must be shot to burst all balloons.|
|[canPlaceFlowers](./scripts/kotlin/General/canPlaceFlowers.kt)|You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.|
|[canCompleteCircuit](./scripts/kotlin/General/canCompleteCircuit.kt)|There are `n` gas stations along a circular route, where the amount of gas at the `i`th station is `gas[i]`. You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from the `i`th station to its next `(i + 1)`th station. You begin the journey with an empty tank at one of the gas stations. Given two integer arrays `gas` and `cost`, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return `-1`.|
|[numberOfArrays](./scripts/kotlin/General/numberOfArrays.kt)|You are given a `0`-indexed array of `n` integers `differences`, which describes the differences between each pair of consecutive integers of a hidden sequence of length `(n + 1)`. More formally, call the hidden sequence `hidden`, then we have that `differences[i] = hidden[i + 1] - hidden[i]`. You are further given two integers `lower` and `upper` that describe the inclusive range of values `[lower, upper]` that the `hidden` sequence can contain. Return the number of possible hidden sequences there are. If there are no possible sequences, return `0`.|
|[sequentialDigits](./scripts/kotlin/General/sequentialDigits.kt)|An integer has sequential digits if and only if each digit in the number is one more than the previous digit. Return a sorted list of all the integers in the range `[low, high]` inclusive that have sequential digits.|
|[maximumDifference](./scripts/kotlin/General/maximumDifference.kt)|Given a `0`-indexed integer array nums of size `n`, find the maximum difference between `nums[i]` and `nums[j]` (i.e., `nums[j] - nums[i]`), such that `0 <= i < j < n` and `nums[i] < nums[j]`. Return the maximum difference. If no such i and j exists, return `-1`.|
|[findAnagrams](./scripts/kotlin/General/findAnagrams.kt)|Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in any order. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.|
|[isAnagram](./scripts/kotlin/General/isAnagram.kt)|Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.|
|[findMaxLength](./scripts/kotlin/General/findMaxLength.kt)|Given a binary array `nums`, return the maximum length of a contiguous subarray with an equal number of `0` and `1`.|
|[findTheDifference](./scripts/kotlin/General/findTheDifference.kt)|You are given two strings `s` and `t`. String t is generated by random shuffling string `s` and then add one more letter at a random position. Return the letter that was added to `t`.|
|[addDigits](./scripts/kotlin/General/addDigits.kt)|Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.|
|[findPairs](./scripts/kotlin/General/findPairs.kt)|Given an array of integers `nums` and an integer `k`, return the number of unique `k`-diff pairs in the array.|
|[subarraySum](./scripts/kotlin/General/subarraySum.kt)|Given an array of integers `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals to `k`.|
|[checkInclusion](./scripts/kotlin/General/checkInclusion.kt)|Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise. In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.|
|[subsets](./scripts/kotlin/General/subsets.kt)|Given an integer array `nums` of unique elements, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.|
|[isPalindrome](./scripts/kotlin/General/isPalindrome.kt)|Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.|
|[convertToTile](./scripts/kotlin/General/convertToTitle.kt)|Given an integer `columnNumber`, return its corresponding column title as it appears in an Excel sheet.|
|[titleToNumber](./scripts/kotlin/General/titleToNumber.kt)|Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.|
|[isIsomorphic](./scripts/kotlin/General/isIsomorphic.kt)|Given two strings `s` and `t`, determine if they are isomorphic.|
|[containsDuplicate](./scripts/kotlin/General/containsDuplicate.kt)|Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.|
|[containsNearbyDuplicate](./scripts/kotlin/General/containsNearbyDuplicate.kt)|Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.|
|[longestPalindrome](./scripts/kotlin/General/longestPalindrome.kt)|Given a string `s`, return the longest palindromic substring in `s`.|
|[countPairs](./scripts/kotlin/General/countPairs.kt)|Given a `0`-indexed integer array `nums` of length `n` and an integer `k`, return the number of pairs `(i, j)` where `0 <= i < j < n`, such that `nums[i] == nums[j]` and `(i * j)` is divisible by `k`.|
|[maximumEvenSplit](./scripts/kotlin/General/maximumEvenSplit.kt)|You are given an integer `finalSum`. Split it into a sum of a maximum number of unique positive even integers. Return a list of integers that represent a valid split containing a maximum number of integers. If no valid split exists for `finalSum`, return an empty list. You may return the integers in any order.|
|[compareVersion](./scripts/kotlin/General/compareVersion.kt)|Given two version numbers, `version1` and `version2`, compare them.|
|[minStep](./scripts/kotlin/General/minStep.kt)|You are given two strings `s` and `t`. In one step, you can append any character to either `s` or `t`. Return the minimum number of steps to make `s` and `t` anagrams of each other.|
|[summaryRanges](./scripts/kotlin/General/summaryRanges.kt)|You are given a sorted unique integer array `nums`. Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of `nums` is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.|
|[MyQueue](./scripts/kotlin/General/MyQueue.kt)|Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (`push`, `peek`, `pop`, and `empty`).|
|[reverseVowels](./scripts/kotlin/General/reverseVowels.kt)|Given a string `s`, reverse only all the vowels in the string and return it.|
|[isSubsequence](./scripts/kotlin/General/isSubsequence.kt)|Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise.|
|[fourSum](./scripts/kotlin/General/fourSum.kt)|Description is in the file.|
|[countOdds](./scripts/kotlin/General/countOdds.kt)|Given two non-negative integers `low` and `high`. Return the count of odd numbers between `low` and `high` (inclusive).|
|[averageSalary](./scripts/kotlin/General/averageSalary.kt)|You are given an array of unique integers salary where `salary[i]` is the salary of the `i`th employee. Return the average salary of employees excluding the minimum and maximum salary.|
|[numberOfArithmeticSlices](./scripts/kotlin/General/numberOfArithmeticSlices.kt)|Given an integer array `nums`, return the number of arithmetic subarrays of `nums`.|
|[intersection](./scripts/kotlin/General/intersection.kt)|Given two integer arrays `nums1` and `nums2`, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.|
|[firstUniqChar](./scripts/kotlin/General/firstUniqChar.kt)|Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return `-1`.|
|[areAlmostEqual](./scripts/kotlin/General/areAlmostEqual.kt)|You are given two strings `s1` and `s2` of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices. Return `true` if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return `false`.|
|[arraySign](./scripts/kotlin/General/arraySign.kt)|You are given an integer array `nums`. Let `product` be the product of all values in the array `nums`. Return `signFunc(product)`.|
|[deleteAndEarn](./scripts/kotlin/General/deleteAndEarn.kt)|Description in the file.|
|[sumOddLengthsSubarrays](./scripts/kotlin/General/sumOddLengthsSubarrays.kt)|Given an array of positive integers `arr`, calculate the sum of all possible odd-length subarrays. Return the sum of all odd-length subarrays of `arr`.|
|[matrixReshape](./scripts/kotlin/General/matrixReshape.kt)|Description in the file|
|[mergeAlternatly](./scripts/kotlin/General/mergeAlternatly.kt)|You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string. Return the merged string.|
|[longestPalindrome2](./scripts/kotlin/General/longestPalindrome2.kt)|Given a string `s` which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters. Letters are case sensitive, for example, `"Aa"` is not considered a palindrome here.|
|[addStrings](./scripts/kotlin/General/addStrings.kt)|Given two non-negative integers, `num1` and `num2` represented as string, return the sum of `num1` and `num2` as a string.|
|[readBinaryWatch](./scripts/kotlin/General/readBinaryWatch.kt)|A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right. Given an integer `turnedOn` which represents the number of LEDs that are currently on, return all possible times the watch could represent. You may return the answer in any order.|
|[toHex](./scripts/kotlin/General/toHex.kt)|Given an integer `num`, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.|
|[countSegments](./scripts/kotlin/General/countSegments.kt)|Given a string `s`, return the number of segments in the string. A segment is defined to be a contiguous sequence of non-space characters.|
|[addToArrayForm](./scripts/kotlin/General/addToArrayForm.kt)|The array-form of an integer `num` is an array representing its digits in left to right order. Given `num`, the array-form of an integer, and an integer `k`, return the array-form of the integer `num + k`.|
|[isMonotonic](./scripts/kotlin/General/isMonotonic.kt)|An array is monotonic if it is either monotone increasing or monotone decreasing. An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array nums is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`. Given an integer array `nums`, return `true` if the given array is monotonic, or `false` otherwise.|
|[licenseKeyFormatting](./scripts/kotlin/General/licenseKeyFormatting.kt)|You are given a license key represented as a string `s` that consists of only alphanumeric characters and dashes. The string is separated into `n + 1` groups by `n` dashes. You are also given an integer `k`. We want to reformat the string `s` such that each group contains exactly `k` characters, except for the first group, which could be shorter than `k` but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase. Return the reformatted license key.|
|[findKDistantIndices](./scripts/kotlin/General/findKDistantIndices.kt)|You are given a `0`-indexed integer array `nums` and two integers `key` and `k`. A `k`-distant index is an index `i` of `nums` for which there exists at least one index `j` such that `abs(i - j) <= k` and `nums[j] == key`. Return a list of all `k`-distant indices sorted in increasing order.|
|[simplifyPath](./scripts/kotlin/General/simplifyPath.kt)|Description in the file|
|[repeatedSubstringPattern](./scripts/kotlin/General/repeatedSubstringPattern.kt)|Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.|
|[findPoisonedDuration](./scripts/kotlin/General/findPoisonedDuration.kt)|Description in the file|
|[findWords](./scripts/kotlin/General/findWords.kt)|Given an array of strings `words`, return the words that can be typed using letters of the alphabet on only one row of American keyboard.|
|[converToBase7](./scripts/kotlin/General/converToBase7.kt)|Given an integer `num`, return a string of its base 7 representation.|
|[findRealtiveRanks](./scripts/kotlin/General/findRelativeRanks.kt)|Description in the file|
|[scoreOfParentheses](./scripts/kotlin/General/scoreOfParentheses.kt)|Given a balanced parentheses string `s`, return the score of the string.|
|[findRightInterval](./scripts/kotlin/General/findRightInterval.kt)|You are given an array of `intervals`, where `intervals[i] = [starti, endi]` and each `starti` is unique. The right interval for an interval `i` is an interval `j` such that `startj >= endi` and `startj` is minimized. Return an array of right interval indices for each interval `i`. If no right interval exists for interval `i`, then put `-1` at index `i`.|
|[rotate](./scripts/kotlin/General/rotate.kt)|You are given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise).|
|[findRotation](./scripts/kotlin/General/findRotation.kt)|Given two `n x n` binary matrices `mat` and `target`, return `true` if it is possible to make `mat` equal to `target` by rotating `mat` in 90-degree increments, or `false` otherwise.|
|[countCollisions](./scripts/kotlin/General/countCollisions.kt)|Description in the file|
|[minDominoRotations](./scripts/kotlin/General/minDominoRotations.kt)|Description in the file|
|[partitionLabels](./scripts/kotlin/General/partitionLabels.kt)|You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part. Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`. Return a list of integers representing the size of these parts.|
|[checkArithmeticSubarrays](./scripts/kotlin/General/checkArithmeticSubarrays.kt)|A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence `s` is arithmetic if and only if `s[i+1] - s[i] == s[1] - s[0]` for all valid `i`. You are given an array of `n` integers, `nums`, and two arrays of `m` integers each, `l` and `r`, representing the `m` range queries, where the `i`th query is the range `[l[i], r[i]]`. All the arrays are `0`-indexed. Return a list of boolean elements `answer`, where `answer[i]` is `true` if the subarray `nums[l[i]], nums[l[i]+1], ... , nums[r[i]]` can be rearranged to form an arithmetic sequence, and `false` otherwise.|
|[getSmallestString](./scripts/kotlin/General/getSmallestString.kt)|Description in the file|
|[nextGreaterElement](./scripts/kotlin/General/nextGreaterElement.kt)|Given a positive integer `n`, find the smallest integer which has exactly the same digits existing in the integer `n` and is greater in value than `n`. If no such positive integer exists, return `-1`. Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return `-1`.|
|[brokenCalc](./scripts/kotlin/General/brokenCalc.kt)|There is a broken calculator that has the integer `startValue` on its display initially. In one operation, you can: 1) multiply the number on display by `2`, or; 2) subtract `1` from the number on display. Given two integers `startValue` and `target`, return the minimum number of operations needed to display `target` on the calculator.|
|[numSubarrayProductLessThanK](./scripts/kotlin/General/numSubarrayProductLessThanK.kt)|Given an array of integers `nums` and an integer `k`, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than `k`.|
|[minDeletion](./scripts/kotlin/General/minDeletion.kt)|Description is in the file|
|[findDuplicate](./scripts/kotlin/General/findDuplicate.kt)|Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive. There is only one repeated number in `nums`, return this repeated number. You must solve the problem without modifying the array `nums` and uses only constant extra space.|
|[lemonadeChange](./scripts/kotlin/General/lemonadeChange.kt)|Description is in the file|
|[AuthenticationManager](./scripts/kotlin/General/AuthenticationManager.kt)|Description is in the file|
|[RandomizedSet](./scripts/kotlin/General/RandomizedSet.kt)|Description is in the file|
|[triangularSum](./scripts/kotlin/General/triangularSum.kt)|Description is in the file|
|[nextPermutation](./scripts/kotlin/General/nextPermutation.kt)|Description is in the file|
|[convertTime](./scripts/kotlin/General/convertTime.kt)|Description is in the file|
|[findWinners](./scripts/kotlin/General/findWinners.kt)|Description is in the file|
|[threeSumMulti](./scripts/kotlin/General/threeSumMulti.kt)|Given an integer array `arr`, and an integer `target`, return the number of tuples `i`, `j`, `k` such that `i < j < k` and `arr[i] + arr[j] + arr[k] == target`. As the answer can be very large, return it modulo `10^9 + 7`.|
|[reverseStr](./scripts/kotlin/General/reverseStr.kt)|Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string. If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.|
|[checkRecord](./scripts/kotlin/General/checkRecord.kt)|Description is in the file|
|[shiftGrid](./scripts/kotlin/General/shiftGrid.kt)|Given a 2D grid of size `m x n` and an integer `k`. You need to shift the grid `k` times. Return the 2D grid after applying shift operation `k` times.|
|[minimizeResult](./scripts/kotlin/General/minimizeResult.kt)|Description is in the file|
|[gameOfLife](./scripts/kotlin/General/gameOfLife.kt)|Description is in the file|
|[generateMatrix](./scripts/kotlin/General/generateMatrix.kt)|Given a positive integer `n`, generate an `n x n` matrix filled with elements from `1` to `n^2` in spiral order.|
|[findClosestNumber](./scripts/kotlin/General/findClosestNumber.kt)|Given an integer array `nums` of size `n`, return the number with the value closest to `0` in `nums`. If there are multiple answers, return the number with the largest value.|
|[ATM](./scripts/kotlin/General/ATM.kt)|Description is in the file|
|[minimumRounds](./scripts/kotlin/General/minimumRounds.kt)|You are given a `0`-indexed integer array `tasks`, where `tasks[i]` represents the difficulty level of a task. In each round, you can complete either `2` or `3` tasks of the same difficulty level. Return the minimum rounds required to complete all the tasks, or `-1` if it is not possible to complete all the tasks.|
|[digitSum](./scripts/kotlin/General/digitSum.kt)|Description is in the file|
|[backspaceCompare](./scripts/kotlin/General/backspaceCompare.kt)|Given two strings `s` and `t`, return `true` if they are equal when both are typed into empty text editors. `'#'` means a backspace character. Note that after backspacing an empty text, the text will continue empty.|
|[MyHashMap](./scripts/kotlin/General/MyHashMap.kt)|Description is in the file|
|[Codec](./scripts/kotlin/General/Codec.kt)|Description is in the file|
|[UndergroundSystem](./scripts/kotlin//General/UndergroundSystem.kt)|Description is in the file|
|[PeekingIterator](./scripts/kotlin/General/PeekingIterator.kt)|Description is in the file|
|[minimumAverageDifference](./scripts/kotlin/General/minimumAverageDifference.kt)|Description is in the file|
|[countUnguarded](./scripts/kotlin/General/countUnguarded.kt)|Description is in the file|
|[removeDigit](./scripts/kotlin/General/removeDigit.kt)|You are given a string `number` representing a positive integer and a character `digit`. Return the resulting string after removing exactly one occurrence of `digit` from `number` such that the value of the resulting string in decimal form is maximized.|
|[countDistinct](./scripts/kotlin/General/countDistinct.kt)|Given an integer array `nums` and two integers `k` and `p`, return the number of distinct subarrays which have at most `k` elements divisible by `p`.|
|[shuffleAnArray](./scripts/kotlin/General/shuffleAnArray.kt)|Description is in the file|
|[findUnsortedSubarray](./scripts/kotlin/General/findUnsortedSubarray.kt)|Given an integer array `nums`, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order. Return the shortest such subarray and output its length.|
|[maxOperations](./scripts/kotlin/General/maxOperations.kt)|You are given an integer array `nums` and an integer `k`. In one operation, you can pick two numbers from the array whose sum equals `k` and remove them from the array. Return the maximum number of operations you can perform on the array.|
|[maxPoints](./scripts/kotlin/General/maxPoints.kt)|Given an array of points where `points[i] = [xi, yi]` represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.|
|[distributeCandies2](./scripts/kotlin/General/distributeCandies2.kt)|Alice has `n` candies, where the `i`th candy is of type `candyType[i]`. Alice noticed that she started to gain weight, so she visited a doctor. The doctor advised Alice to only eat `n / 2` of the candies she has (`n` is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. Given the integer array `candyType` of length `n`, return the maximum number of different types of candies she can eat if she only eats `n / 2` of them.|
|[removeDuplicates2](./scripts/kotlin/General/removeDuplicates2.kt)|You are given a string `s` and an integer `k`, a `k` duplicate removal consists of choosing `k` adjacent and equal letters from `s` and removing them, causing the left and the right side of the deleted substring to concatenate together. We repeatedly make `k` duplicate removals on `s` until we no longer can. Return the final string after all such duplicate removals have been made.|
|[findLHS](./scripts/kotlin/General/findLHS.kt)|We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly `1`. Given an integer array `nums`, return the length of its longest harmonious subsequence among all its possible subsequences.|
|[findRestaurant](./scripts/kotlin/General/findRestaurant.kt)|Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings. You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement.|
|[waysToSplitArray](./scripts/kotlin/General/waysToSplitArray.kt)|Description is in the file|
|[divisorSubstrings](./scripts/kotlin/General/divisorSubstrings.kt)|Description is in the file|
|[removeAnagrams](./scripts/kotlin/General/removeAnagrams.kt)|You are given a `0`-indexed string array `words`, where `words[i]` consists of lowercase English letters. In one operation, select any index `i` such that `0 < i < words.length` and `words[i - 1]` and `words[i]` are anagrams, and delete `words[i]` from `words`. Keep performing this operation as long as you can select an index that satisfies the conditions. Return words after performing all operations. It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.|
|[maximumProduct](./scripts/kotlin/General/maximumProduct.kt)|Given an integer array `nums`, find three numbers whose product is maximum and return the maximum product.|
|[longestValidParenthesis](./scripts/kotlin/General/longestValidParenthesis.kt)|Given a string containing just the characters `'('` and `')'`, find the length of the longest valid (well-formed) parentheses substring.|
|[increasingTriplet](./scripts/kotlin/General/increasingTriplet.kt)|Given an integer array `nums`, return `true` if there exists a triple of indices `(i, j, k)` such that `i < j < k` and `nums[i] < nums[j] < nums[k]`. If no such indices exists, return `false`.|
|[setZeroes](./scripts/kotlin/General/setZeroes.kt)|Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`'s.|
|[countAndSay](./scripts/kotlin/General/countAndSay.kt)|Description is in the file|
|[longestConsecutive](./scripts/kotlin/General/longestConsecutive.kt)|Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.|
|[findRepeatedDnaSequences](./scripts/kotlin/General/findRepeatedDnaSequences.kt)|Description is in the file|
|[maxProduct](./scripts/kotlin/General/maxProduct.kt)|Given a string array `words`, return the maximum value of `length(word[i]) * length(word[j])` where the two words do not share common letters. If no such two words exist, return `0`.|
|[rearrangeCharacters](./scripts/kotlin/General/rearrangeCharacters.kt)|You are given two `0`-indexed strings `s` and `target`. You can take some letters from `s` and rearrange them to form new strings. Return the maximum number of copies of `target` that can be formed by taking letters from `s` and rearranging them.|
|[discountPrices](./scripts/kotlin/General/discountPrices.kt)|Description is in the file|
|[largestWordCount](./scripts/kotlin/General/largestWordCount.kt)|Desciprion is in the file|
|[findErrorNums](./scripts/kotlin/General/findErrorNums.kt)|You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in repetition of one number and loss of another number. You are given an integer array `nums` representing the data status of this set after the error. Find the number that occurs twice and the number that is missing and return them in the form of an array.|
|[runningSum](./scripts/kotlin/General/runningSum.kt)|Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`. Return the running sum of `nums`.|
|[minMaxGame](./scripts/kotlin/General/minMaxGame.kt)|Description is in the file|
|[arrayChange](./scripts/kotlin/General/arrayChange.kt)|Description is in the file|
|[TextEditor](./scripts/kotlin/General/TextEditor.kt)|Description is in the file|
|[findSmallestSetOfVertices](./scripts/kotlin/General/findSmallestSetOfVertices.kt)|Given a directed acyclic graph, with `n` vertices numbered from `0` to `n-1`, and an array `edges` where `edges[i] = [fromi, toi]` represents a directed edge from node `fromi` to node `toi`. Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists. Notice that you can return the vertices in any order.|

#### DFS & BFS

| File | Task |
|-|-|
|[shortestPathBinaryMatrix](./scripts/kotlin/DFS&BFS/shortestPathBinaryMatrix.kt)|Description is in the file|
|[findCircleNum](./scripts/kotlin/DFS&BFS/findCircleNum.kt)|Description is in the file|
|[numIslands](./scripts/kotlin/DFS&BFS/numIslands.kt)|Given an `m x n` 2D binary grid grid which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands.|
|[cloneGraph](./scripts/kotlin/DFS&BFS/cloneGraph.kt)|Given a reference of a `node` in a connected undirected graph. Return a __deep copy (clone)__ of the graph. Each node in the graph contains a `value` (`int`) and a `list` (`List[Node]`) of its neighbors.|
|[combinationSum](./scripts/kotlin/DFS&BFS/combinationSum.kt)|Given an array of distinct integers `candidates` and a target integer `target`, return a list of all unique combinations of candidates where the chosen numbers sum to `target`. |
|[ladderLength](./scripts/kotlin/DFS&BFS/ladderLength.kt)|Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, return the number of words in the shortest transformation sequence from `beginWord` to `endWord`, or `0` if no such sequence exists.|
|[findOrder](./scripts/kotlin/DFS&BFS/findOrder.kt)|There are a total of `numCourses` courses you have to take, labeled from `0` to `numCourses - 1`. You are given an array prerequisites where `prerequisites[i] = [ai, bi]` indicates that you must take course bi first if you want to take course ai. For example, the pair `[0, 1]`, indicates that to take course `0` you have to first take course `1`. Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.|
|[countOfUniquePaths](./scripts/kotlin/DFS&BFS/countOfUniquePaths.kt)|A robot is located at the top-left corner of a `m x n` grid. The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid. How many possible unique paths are there?|
|[allPathsFromSourceToTarget](./scripts/kotlin/DFS&BFS/allPathsFromSourceToTarget.kt)| Given a directed acyclic graph (DAG) of n nodes labeled from `0` to `n - 1`, find all possible paths from node `0` to node `n - 1` and return them in any order. The graph is given as follows: `graph[i]` is a list of all nodes you can visit from node `i` (i.e., there is a directed edge from node `i` to node `graph[i][j]`).|
|[uniquePaths](./scripts/kotlin/DFS&BFS/uniquePaths.kt)|You are given an `m x n` integer array grid where `grid[i][j]` could be: `1` representing the starting square. There is exactly one starting square. `2` representing the ending square. There is exactly one ending square. `0` representing empty squares we can walk over. `-1` representing obstacles that we cannot walk over. Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.|
|[sumRootToLeafNumbers](./scripts/kotlin/DFS&BFS/sumRootToLeafNumbers.kt)|You are given the root of a binary tree containing digits from `0` to `9` only. Each root-to-leaf path in the tree represents a number. For example, the root-to-leaf path `1 -> 2 -> 3` represents the number `123`. Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer. A leaf node is a node with no children.|
|[jumpGame3](./scripts/kotlin/DFS%26BFS/jumpGame3.kt)|Given an array of non-negative integers `arr`, you are initially positioned at `start` index of the array. When you are at index `i`, you can jump to `i + arr[i]` or `i - arr[i]`, check if you can reach to any index with value `0`. Notice that you can not jump outside of the array at any time.|
|[smallestStringWtihSwapes](./scripts/kotlin/DFS%26BFS/smallestStringWithSwapes.kt)|You are given a string `s`, and an array of pairs of indices in the string `pairs` where `pairs[i] = [a, b]` indicates 2 indices(`0`-indexed) of the string. You can swap the characters at any pair of indices in the given `pairs` any number of times. Return the lexicographically smallest string that `s` can be changed to after using the swaps.|
|[isBipartite](./scripts/kotlin/DFS%26BFS/isBipartite.kt)|Description is in the file|
|[calcEquation](./scripts/kotlin/DFS%26BFS/calcEquation.kt)|You are given an array of variable pairs equations and an array of real numbers values, where `equations[i] = [Ai, Bi]` and `values[i]` represent the equation `Ai / Bi = values[i]`. Each `Ai` or `Bi` is a string that represents a single variable. You are also given some queries, where `queries[j] = [Cj, Dj]` represents the `j`th query where you must find the answer for `Cj / Dj = ?`. Return the answers to all queries. If a single answer cannot be determined, return `-1.0`.|
|[criticalConnections](./scripts/kotlin/DFS%26BFS/criticalConnections.kt)|There are `n` servers numbered from `0` to `n - 1` connected by undirected server-to-server connections forming a network where `connections[i] = [ai, bi]` represents a connection between servers `ai` and `bi`. Any server can reach other servers directly or indirectly through the network. A critical connection is a connection that, if removed, will make some servers unable to reach some other server. Return all critical connections in the network in any order.|
|[longestIncreasingPath](./scripts/kotlin/DFS%26BFS/longestIncreasingPath.kt)|Given an `m x n` integers matrix, return the length of the longest increasing path in `matrix`. From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).|
|[canVisitAllRooms](./scripts/kotlin/DFS%26BFS/canVisitAllRooms.kt)|There are `n` rooms labeled from `0` to `n - 1` and all the rooms are locked except for room `0`. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key. When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms. Given an array `rooms` where `rooms[i]` is the set of keys that you can obtain if you visited room `i`, return `true` if you can visit all the rooms, or `false` otherwise.|

#### Stack

| File | Task |
|-|-|
|[validParentheses](./scripts/kotlin/Stack/validParentheses.kt)|Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.|
|[calPoints](./scripts/kotlin/Stack/calPoints.kt)|Description is in the file|
|[nextGreaterElements](./scripts/kotlin/Stack/nextGreaterElements.kt)|Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return the next greater number for every element in `nums`. The next greater number of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.|
|[FreqStack](./scripts/kotlin/Stack/FreqStack.kt)|Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.|
|[removeDuplicateLetters](./scripts/kotlin/Stack/removeDuplicateLetters.kt)|Given a string `s`, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.|
|[validateStackSequences](./scripts/kotlin/Stack/validateStackSequences.kt)|Given two integer arrays `pushed` and `popped` each with distinct values, return `true` if this could have been the result of a sequence of push and pop operations on an initially empty stack, or `false` otherwise.|
|[evalRPN](./scripts/kotlin/Stack/evalRPN.kt)|Evaluate the value of an arithmetic expression in Reverse Polish Notation.|
|[findContentChildren](./scripts/kotlin/Stack/findContentChildren.kt)|Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. Each child `i` has a greed factor `g[i]`, which is the minimum size of a cookie that the child will be content with; and each cookie `j` has a size `s[j]`. If `s[j] >= g[i]`, we can assign the cookie `j` to the child `i`, and the child `i` will be content. Your goal is to maximize the number of your content children and output the maximum number.|
|[minRemoveToMakeValid](./scripts/kotlin/Stack/minRemoveToMakeValid.kt)|Given a string `s` of `'('` , `')'` and lowercase English characters. Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any positions ) so that the resulting parentheses string is valid and return any valid string.|
|[removeKDigits](./scripts/kotlin/Stack/removeKDigits.kt)|Given string `num` representing a non-negative integer `num`, and an integer `k`, return the smallest possible integer after removing `k` digits from `num`.|
|[StockSpanner](./scripts/kotlin/Stack/StockSpanner.kt)|Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.|
|[minStack](./scripts/kotlin/Stack/minStack.kt)|Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.|
|[find132Pattern](./scripts/kotlin/Stack/find132Pattern.kt)|Given an array of `n` integers `nums`, a 132 pattern is a subsequence of three integers `nums[i]`, `nums[j]` and `nums[k]` such that `i < j < k` and `nums[i] < nums[k] < nums[j]`. Return `true` if there is a 132 pattern in `nums`, otherwise, return `false`.|

#### Sorting

| File | Task |
|-|-|
|[subsetsWithDup](./scripts/kotlin/Sorting/subsetsWithDup.kt)|Given an integer array `nums` that may contain duplicates, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.|
|[smallestRange](./scripts/kotlin/Sorting/smallestRange.kt)|You are given an integer array `nums` and an integer `k`. For each index `i` where `0 <= i < nums.length`, change `nums[i]` to be either `nums[i] + k` or `nums[i] - k`. The score of `nums` is the difference between the maximum and minimum elements in `nums`. Return the minimum score of `nums` after changing the values at each index.|
|[twoCitySchedCost](./scripts/kotlin/Sorting/twoCityShedCost.kt)|A company is planning to interview `2n` people. Given the array costs where `costs[i] = [aCosti, bCosti]`, the cost of flying the `i`th person to city `a` is `aCosti`, and the cost of flying the `i`th person to city `b` is `bCosti`. Return the minimum cost to fly every person to a city such that exactly `n` people arrive in each city.|
|[numRescueBoats](./scripts/kotlin/Sorting/numRescueBoats.kt)|You are given an array people where `people[i]` is the weight of the `i`th person, and an infinite number of boats where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit. Return the minimum number of boats to carry every given person.|
|[sortByBits](./scripts/kotlin/Sorting/sortByBits.kt)|You are given an integer array `arr`. Sort the integers in the array in ascending order by the number of `1`'s in their binary representation and in case of two or more integers have the same number of `1`'s you have to sort them in ascending order. Return the array after sorting it.|
|[threeSumClosest](./scripts/kotlin/Sorting/threeSumClosest.kt)|Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is closest to target. Return the sum of the three integers.|
|[minimumOperations](./scripts/kotlin/Sorting/minimumOperations.kt)|You are given a `0`-indexed array `nums` consisting of `n` positive integers. Return the minimum number of operations required to make the array alternating.|
|[smallestNumber](./scripts/kotlin/Sorting/smallestNumber.kt)|You are given an integer `num`. Rearrange the digits of `num` such that its value is minimized and it does not contain any leading zeros. Return the rearranged number with minimal value. Note that the sign of the number does not change after rearranging the digits.|
|[maxRunTime](./scripts/kotlin/Sorting/maxRunTime.kt)|You have `n` computers. You are given the integer `n` and a `0`-indexed integer array batteries where the `i`th battery can run a computer for `batteries[i]` minutes. You are interested in running all n computers simultaneously using the given batteries. Return the maximum number of minutes you can run all the n computers simultaneously.|
|[threeSum](./scripts/kotlin/Sorting/threeSum.kt)|Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.|
|[frequencySort](./scripts/kotlin/Sorting/frequencySort.kt)|Given a string `s`, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string. Return the sorted string. If there are multiple answers, return any of them.|
|[canMakeArithmeticProgression](./scripts/kotlin/Sorting/canMakeArithmeticProgression.kt)|Given an array of numbers `arr`. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same. Return `true` if the array can be rearranged to form an arithmetic progression, otherwise, return `false`.|
|[minSubsequence](./scripts/kotlin/Sorting/minSubsequence.kt)|Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence.|
|[numIdenticalPairs](./scripts/kotlin/Sorting/numIdenticalPairs.kt)|Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j. Return the number of good pairs.|
|[maxConsecutive](./scripts/kotlin/Sorting/maxConsecutive.kt)|Alice manages a company and has rented some floors of a building as office space. Alice has decided some of these floors should be special floors, used for relaxation only. You are given two integers `bottom` and `top`, which denote that Alice has rented all the floors from `bottom` to `top` (inclusive). You are also given the integer array `special`, where `special[i]` denotes a `special` floor that Alice has designated for relaxation. Return the maximum number of consecutive floors without a special floor.|
|[maximumBags](./scripts/kotlin/Sorting/maximumBags.kt)|You have `n` bags numbered from `0` to `n - 1`. You are given two `0`-indexed integer arrays `capacity` and `rocks`. The `i`th bag can hold a maximum of `capacity[i]` rocks and currently contains `rocks[i]` rocks. You are also given an integer `additionalRocks`, the number of additional rocks you can place in any of the bags. Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.|
|[maximumImportance](./scripts/kotlin/Sorting/maximumImportance.kt)|Description is in the file|
|[partitionArray](./scripts/kotlin/Sorting/partitionArray.kt)|You are given an integer array `nums` and an integer `k`. You may partition `nums` into one or more subsequences such that each element in `nums` appears in exactly one of the subsequences. Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each subsequence is at most `k`. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.|

#### PriorityQueue

| File | Task |
|-|-|
|[maximumProduct](./scripts/kotlin/PriorityQueue/maximumProduct.kt)|You are given an array of non-negative integers `nums` and an integer `k`. In one operation, you may choose any element from `nums` and increment it by `1`. Return the maximum product of `nums` after at most `k` operations. Since the answer may be very large, return it modulo `10^9 + 7`.|
|[topKFrequent](./scripts/kotlin/PriorityQueue/topKFrequent.kt)|Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in any order.|
|[KthLargest](./scripts/kotlin/PriorityQueue/KthLargest.kt)|Description is in the file|
|[lastStoneWieght](./scripts/kotlin/PriorityQueue/lastStoneWeight.kt)|Description is in the file|
|[maximumCandies](./scripts/kotlin/PriorityQueue/maximumCandies.kt)|You are given a `0`-indexed integer array `candies`. Each element in the array denotes a pile of candies of size `candies[i]`. You can divide each pile into any number of sub piles, but you cannot merge two piles together. You are also given an integer `k`. You should allocate piles of candies to `k` children such that each child gets the same number of candies. Each child can take at most one pile of candies and some piles of candies may go unused. Return the maximum number of candies each child can get.|
|[kWeakestRows](./scripts/kotlin/PriorityQueue/kWeakestRows.kt)|Description is in the file|
|[halveArray](./scripts/kotlin/PriorityQueue/halveArray.kt)|You are given an array `nums` of positive integers. In one operation, you can choose any number from `nums` and reduce it to exactly half the number. (Note that you may choose this reduced number in future operations.) Return the minimum number of operations to reduce the sum of `nums` by at least half.|
|[highestRankedKItems](./scripts/kotlin/PriorityQueue/highestRankedKItems.kt)|Description is inside the code file|
|[carPooling](./scripts/kotlin/PriorityQueue/carPooling.kt)|There is a car with `capacity` empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west). You are given the integer `capacity` and an array `trips` where `trip[i] = [numPassengersi, fromi, toi]` indicates that the `ith` trip has `numPassengersi` passengers and the locations to pick them up and drop them off are `fromi` and `toi` respectively. The locations are given as the number of kilometers due east from the car's initial location. Return `true` if it is possible to pick up and drop off all passengers for all the given trips, or `false` otherwise.|
|[minCostPriorityQueue](./scripts/kotlin/PriorityQueue/minCostConnectPoints.kt)|Description is in the file|
|[minimumEffortPath](./scripts/kotlin/PriorityQueue/minimumEffortPath.kt)|Description is in the file|
|[networkDelayTime](./scripts/kotlin/PriorityQueue/networkDelayTime.kt)|You are given a network of `n` nodes, labeled from `1` to `n`. You are also given times, a list of travel times as directed edges `times[i] = (ui, vi, wi)`, where `ui` is the source node, `vi` is the target node, and `wi` is the time it takes for a signal to travel from source to target. We will send a signal from a given node `k`. Return the time it takes for all the `n` nodes to receive the signal. If it is impossible for all the `n` nodes to receive the signal, return `-1`.|

#### Math

| File | Task |
|-|-|
|[isNumberPalindrome](./scripts/kotlin/Math/isNumberPalindrome.kt)|Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.|
|[reverseInteger](./scripts/kotlin/Math/reverseInteger.kt)|Given a 32-bit signed integer, reverse digits of an integer.|
|[waysToBuyPensPencils](./scripts/kotlin/Math/waysToBuyPensPencils.kt)|You are given an integer `total` indicating the amount of money you have. You are also given two integers `cost1` and `cost2` indicating the price of a pen and pencil respectively. You can spend part or all of your money to buy multiple quantities (or none) of each kind of writing utensil. Return the number of distinct ways you can buy some number of pens and pencils.|
|[largestInteger](./scripts/kotlin/Math/largestInteger.kt)|You are given a positive integer `num`. You may swap any two digits of `num` that have the same parity (i.e. both odd digits or both even digits). Return the largest possible value of `num` after any number of swaps.|
|[numberOfWays](./scripts/kotlin/Math/numberOfWays.kt)|Description is in the file|
|[kthPalindrome](./scripts/kotlin/Math/kthPalindrome.kt)|Given an integer array `queries` and a positive integer `intLength`, return an array `answer` where `answer[i]` is either the `queries[i]`th smallest positive palindrome of length `intLength` or `-1` if no such palindrome exists. A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.|
|[checkPerfectNumber](./scripts/kotlin/Math/checkPerfectNumber.kt)|A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer `x` is an integer that can divide `x` evenly. Given an integer `n`, return `true` if `n` is a perfect number, otherwise return `false`.|
|[multiply](./scripts/kotlin/Math/multiply.kt)|Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.|
|[constructRectangle](./scripts/kotlin/Math/constructRectangle.kt)|Description in the file|
|[countOfOrders](./scripts/kotlin/Math/countOfOrders.kt)|Given `n` orders, each order consist in pickup and delivery services. Count all valid pickup/delivery possible sequences such that `delivery(i)` is always after of `pickup(i)`.|
|[checkStraightLine](./scripts/kotlin/Math/checkStraightLine.kt)|You are given an array coordinates, `coordinates[i] = [x, y]`, where `[x, y]` represents the coordinate of a point. Check if these points make a straight line in the XY plane.|
|[nearestValidPoint](./scripts/kotlin/Math/nearestValidPoint.kt)|Description in the file|
|[champagneTower](./scripts/kotlin/Math/champagneTower.kt)|Description in the file|
|[largestPerimeter](./scripts/kotlin/Math/largestPerimeter.kt)|Given an integer array `nums`, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return `0`.|
|[isPerfectSquare](./scripts/kotlin/Math/isPerfectSquare.kt)|Given a positive integer `num`, write a function which returns `True` if `num` is a perfect square else `False`.|
|[countBits](./scripts/kotlin/Math/countBits.kt)|Given an integer `n`, return an array `ans` of length `n + 1` such that for each `i` (`0 <= i <= n`), `ans[i]` is the number of `1`'s in the binary representation of `i`.|
|[sumOfThree](./scripts/kotlin/Math/sumOfThree.kt)|Given an integer `num`, return three consecutive integers (as a sorted array) that sum to `num`. If num cannot be expressed as the sum of three consecutive integers, return an empty array.|
|[isUgly](./scripts/kotlin/Math/isUgly.kt)|An ugly number is a positive integer whose prime factors are limited to `2`, `3`, and `5`. Given an integer `n`, return `true` if `n` is an ugly number.|
|[reverseBits](./scripts/kotlin/Math/reverseBits.kt)|Reverse bits of a given 32 bits unsigned integer.|
|[happyNumber](./scripts/kotlin/Math/happyNumber.kt)|Write an algorithm to determine if a number `n` is happy.|
|[majorityElement](./scripts/kotlin/Math/majorityElement.kt)|Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.|
|[pascalsTriangle](./scripts/kotlin/Math/pascalsTriangle.kt)|Given an integer `numRows`, return the first `numRows` of Pascal's triangle.|
|[pascalsTriangleII](./scripts/kotlin/Math/pascalsTriangleII.kt)|Given an integer `rowIndex`, return the `rowIndexth` (`0`-indexed) row of the Pascal's triangle.|
|[singleNumber](./scripts/kotlin/Math/singleNumber.kt)|Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.|
|[smallestRepunitDivByK](./scripts/kotlin/Math/smallestRepunitDivByK.kt)|Given a positive integer `k`, you need to find the length of the smallest positive integer `n` such that `n` is divisible by `k`, and `n` only contains the digit `1`. Return the length of `n`. If there is no such `n`, return `-1`. Note: `n` may not fit in a 64-bit signed integer.|
|[combinations](./scripts/kotlin/Math/combinations.kt)|Efficient calculation of number of combinations of `r` elements from `n`|
|[judgeSquareSum](./scripts/kotlin/Math/judgeSquareSum.kt)|Given a non-negative integer `c`, decide whether there're two integers `a` and `b` such that `a^2+b^2=c`.|
|[hammingDistance](./scripts/kotlin/Math/hammingDistance.kt)|The Hamming distance between two integers is the number of positions at which the corresponding bits are different. Given two integers x and y, calculate the Hamming distance.|
|[integerBreak](./scripts/kotlin/Math/integerBreak.kt)|Given an integer `n`, break it into the `sum` of `k` positive integers, where `k >= 2`, and maximize the product of those integers. Return the maximum product you can get.|
|[countVowelStrings](./scripts/kotlin/Math/countVowelStrings.kt)|Given an integer `n`, return the number of strings of length `n` that consist only of vowels (`a`, `e`, `i`, `o`, `u`) and are lexicographically sorted. A string `s` is lexicographically sorted if for all valid `i`, `s[i]` is the same as or comes before `s[i+1]` in the alphabet.|
|[largestCombination](./scripts/kotlin/Math/largestCombination.kt)|The bitwise AND of an array `nums` is the bitwise AND of all integers in `nums`. You are given an array of positive integers `candidates`. Evaluate the bitwise AND of every combination of numbers of `candidates`. Each number in `candidates` may only be used once in each combination. Return the size of the largest combination of `candidates` with a bitwise AND greater than `0`.|
|[findMaxAverage](./scripts/kotlin/Math/findMaxAverage.kt)|You are given an integer array `nums` consisting of `n` elements, and an integer `k`. Find a contiguous subarray whose length is equal to `k` that has the maximum average value and return this value.|
|[minimumLines](./scripts/kotlin/Math/minimumLines.kt)|You are given a 2D integer array `stockPrices` where `stockPrices[i] = [dayi, pricei]` indicates the price of the stock on day `dayi` is `pricei`. A line chart is created from the array by plotting the points on an XY plane with the X-axis representing the day and the Y-axis representing the price and connecting adjacent points. Return the minimum number of lines needed to represent the line chart.|
|[divideTwoIntegers](./scripts/kotlin/Math/divideTwoIntegers.kt)|Given two integers `dividend` and `divisor`, divide two integers without using multiplication, division, and mod operator.|
|[countPrimes](./scripts/kotlin/Math/countPrimes.kt)|Given an integer `n`, return the number of prime numbers that are strictly less than `n`.|

#### DynamicProgramming

| File | Task |
|-|-|
|[minSubArrayLen](./scripts/kotlin/DynamicProgramming/minSubArrayLen.kt)|Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a contiguous subarray `[numsl, numsl+1, ..., numsr-1, numsr]` of which the sum is greater than or equal to `target`. If there is no such subarray, return `0` instead.|
|[NumMatrix](./scripts/kotlin/DynamicProgramming/NumMatrix.kt)|Description in the file.|
|[digArtifacts](./scripts/kotlin/DynamicProgramming/digArtifacts.kt)|Description in the file|
|[maxScoreIndices](./scripts/kotlin/DynamicProgramming/maxScoreIndices.kt)|Description is inside the code file|
|[cherryPick](./scripts/kotlin/DynamicProgramming/cherryPick.kt)|Description is in the file|
|[maximalSquare](./scripts/kotlin/DynamicProgramming/maximalSquare.kt)|Given an `m x n` binary matrix filled with `0`'s and `1`'s, find the largest square containing only `1`'s and return its area.|
[islandPerimeter](./scripts/kotlin/DynamicProgramming/islandPerimeter.kt)|You are given `row x col` grid representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length `1`. The grid is rectangular, width and height don't exceed `100`. Determine the perimeter of the island.|
|[largestPlusSign](./scripts/kotlin/DynamicProgramming/largestPlusSign.kt)|You are given an integer `n`. You have an `n x n` binary grid grid with all values initially `1`'s except for some indices given in the array mines. The ith element of the array mines is defined as `mines[i] = [xi, yi]` where `grid[xi][yi] == 0`. Return the order of the largest axis-aligned plus sign of `1`'s contained in grid. If there is none, return `0`.|
|[rottingOranges](./scripts/kotlin/DynamicProgramming/rottingOranges.kt)|You are given an `m x n` grid where each cell can have one of three values: `0` representing an empty cell, `1` representing a fresh orange, or `2` representing a rotten orange. Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return `-1`.|
|[nearestZeros](./scripts/kotlin/DynamicProgramming/nearestZeros.kt)|Given an `m x n` binary matrix mat, return the distance of the nearest `0` for each cell. The distance between two adjacent cells is `1`.|
|[maxIslandArea](./scripts/kotlin/DynamicProgramming/maxIslandArea.kt)|You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water. The area of an island is the number of cells with a value `1` in the island. Return the maximum area of an island in grid. If there is no island, return `0`.|
|[houseRobber](./scripts/kotlin/DynamicProgramming/houseRobber.kt)|You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.|
|[houseRobber2](./scripts/kotlin/DynamicProgramming/houseRobber2.kt)]|You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.|
|[jumpGame](./scripts/kotlin/DynamicProgramming/jumpGame.kt)|You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position. Return `true` if you can reach the last index, or `false` otherwise.|
|[jumpGame2](./scripts/kotlin/DynamicProgramming/jumpGame2.kt)|Given an array of non-negative integers `nums`, you are initially positioned at the first index of the array. Each element in the array represents your maximum jump length at that position. Your goal is to reach the last index in the minimum number of jumps. You can assume that you can always reach the last index.|
|[numDecodings](./scripts/kotlin/DynamicProgramming/numDecodings.kt)|Description is in the file|
|[wodBreak](./scripts/kotlin/DynamicProgramming/wordBreak.kt)|Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.|
|[findNumberOfLIS](./scripts/kotlin/DynamicProgramming/findNumberOfLIS.kt)|Given an integer array `nums`, return the number of longest increasing subsequences.|
|[longestCommonSubsequence](./scripts/kotlin/DynamicProgramming/longestCommonSubsequence.kt)|Given two strings `text1` and `text2`, return the length of their longest common subsequence. If there is no common subsequence, return `0`. A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. A common subsequence of two strings is a subsequence that is common to both strings.|
|[minDistance](./scripts/kotlin/DynamicProgramming/minDistance.kt)|Given two strings `word1` and `word2`, return the minimum number of steps required to make `word1` and `word2` the same. In one step, you can delete exactly one character in either string.|
|[coinChange](./scripts/kotlin/DynamicProgramming/coinChange.kt)|You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money. Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return `-1`. You may assume that you have an infinite number of each kind of coin.|
|[editDistance](./scripts/kotlin/DynamicProgramming/editDistance.kt)|Description is in the file|
|[minimumCardPickup](./scripts/kotlin/DynamicProgramming/minimumCardPickup.kt)|You are given an integer array `cards` where `cards[i]` represents the value of the `i`th card. A pair of cards are matching if the cards have the same value. Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among the picked cards. If it is impossible to have matching cards, return `-1`.|
|[countTexts](./scripts/kotlin/DynamicProgramming/countTexts.kt)|Description is in the file|
|[uniquePathsWithObstacles](./scripts/kotlin/DynamicProgramming/uniquePathsWithObstacles.kt)|You are given an `m x n` integer array `grid`. There is a robot initially located at the top-left corner (i.e., `grid[0][0]`). The robot tries to move to the bottom-right corner (i.e., `grid[m-1][n-1]`). The robot can only move either down or right at any point in time. An obstacle and space are marked as `1` or `0` respectively in grid. A path that the robot takes cannot include any square that is an obstacle. Return the number of possible unique paths that the robot can take to reach the bottom-right corner.|
|[countSubstrings](./scripts/kotlin/DynamicProgramming/countSubstrings.kt)|Given a string `s`, return the number of palindromic substrings in it. A string is a palindrome when it reads the same backward as forward. A substring is a contiguous sequence of characters within the string.|
|[findMaxForm](./scripts/kotlin/DynamicProgramming/findMaxForm.kt)|You are given an array of binary strings `strs` and two integers `m` and `n`. Return the size of the largest subset of `strs` such that there are at most `m` `0`'s and `n` `1`'s in the subset.|
|[maxEnvelopes](./scripts/kotlin/DynamicProgramming/maxEnvelopes.kt)|You are given a 2D array of integers `envelopes` where `envelopes[i] = [wi, hi]` represents the width and the height of an envelope. One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height. Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other). Note: You cannot rotate an envelope.|
|[findTheWinner](./scripts/kotlin/DynamicProgramming/findTheWinner.kt)|Description is in the file|

#### Backtracking

| File | Task |
|-|-|
|[exist](./scripts/kotlin/Backtracking/exist.kt)|Given an `m x n` grid of characters board and a string `word`, return `true` if word exists in the grid. The `word` can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.|
|[letterCombinations](./scripts/kotlin/Backtracking/letterCombinations.kt)|Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.|
|[generateParenthesis](./scripts/kotlin/Backtracking/generateParenthesis.kt)|Given `n` pairs of parentheses, write a function to generate all combinations of well-formed parentheses.|
|[combinationSum2](./scripts/kotlin/Backtracking/combinationSum2.kt)|Description is in the file|
|[permuteUnique](./scripts/kotlin/Backtracking/permuteUnique.kt)|Given a collection of numbers, `nums`, that might contain duplicates, return all possible unique permutations in any order.|
|[combinationSum3](./scripts/kotlin/Backtracking/combinationSum3.kt)|Description is in the file|
|[solveNQueens](./scripts/kotlin/Backtracking/solveNQueens.kt)|The `n`-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other. Given an integer `n`, return all distinct solutions to the `n`-queens puzzle. You may return the answer in any order. Each solution contains a distinct board configuration of the `n`-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.|
|[totalNQueens](./scripts/kotlin/Backtracking/totalNQueens.kt)|The `n`-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other. Given an integer `n`, return the number of distinct solutions to the `n`-queens puzzle.|

#### BinarySearch

| File | Task |
|------|------|
|[insertPosition](./scripts/kotlin/BinarySearch/insertPosition.kt)|Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.|
|[findPeakElement](./scripts/kotlin/BinarySearch/findPeakElement.kt)|A peak element is an element that is strictly greater than its neighbors. Given an integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks. You may imagine that `nums[-1] = nums[n] = -∞`. You must write an algorithm that runs in `O(log n)` time.|
|[splitArray](./scripts/kotlin/BinarySearch/splitArray.kt)|Given an array `nums` which consists of non-negative integers and an integer `m`, you can split the array into `m` non-empty continuous subarrays. Write an algorithm to minimize the largest sum among these `m` subarrays.|
|[searchMatrix](./scripts/kotlin/BinarySearch/searchMatrix.kt)|Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`.|
|[validPalindrome](./scripts/kotlin/BinarySearch/validPalindrome.kt)|Given a string `s`, return `true` if the `s` can be palindrome after deleting at most one character from it.|
|[minimumDeletions](./scripts/kotlin/BinarySearch/minimumDeletions.kt)|You are given a 0-indexed array of distinct integers nums. There is an element in nums that has the lowest value and an element that has the highest value. We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array. A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array. Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.|
|[searchInRotatedSortedArray](./scripts/kotlin/BinarySearch/searchInRotatedSortedArray.kt)|There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is rotated at an unknown pivot index `k` (`0 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (`0`-indexed). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`. Given the array `nums` after the rotation and an integer `target`, return the index of `target` if it is in `nums`, or `-1` if it is not in `nums`. You must write an algorithm with `O(log n)` runtime complexity.|
|[peakIndexInMountainArray](./scripts/kotlin/BinarySearch/peakIndexInMountainArray.kt)|Given an integer array arr that is guaranteed to be a mountain, return any `i` such that `arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`.|
|[lengthOfLIS](./scripts/kotlin/BinarySearch/lengthOfLIS.kt)|Given an integer array `nums`, return the length of the longest strictly increasing subsequence.|
|[searchMatrix2](./scripts/kotlin/BinarySearch/searchMatrix2.kt)|Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`.|
|[findMedianSortedArrays](./scripts/kotlin/BinarySearch/findMedianSortedArrays.kt)|Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.|

#### Linked list
| File | Task |
|------|------|
|[MyLinkedList](./scripts/kotlin/LinkedList/MyLinkedList.kt)| Doubly linked list implementation|
|[hasLoop](./scripts/kotlin/LinkedList/hasLoop.kt)|Given head, the head of a linked list, determine if the linked list has a cycle in it.|
|[findLoopStart](./scripts/kotlin/LinkedList/findLoopStart.kt)|Given a linked list, return the node where the cycle begins. If there is no cycle, return null.|
|[findIntersection](./scripts/kotlin/LinkedList/findIntersection.kt)|Write a program to find the node at which the intersection of two singly linked lists begins.|
|[middleNode](./scripts/kotlin/LinkedList/middleNode.kt)|Given a non-empty, singly linked list with head node head, return a middle node of linked list. If there are two middle nodes, return the second middle node.|
|[removeNthFromEnd](./scripts/kotlin/LinkedList/removeNthFromEnd.kt)|Given the head of a linked list, remove the nth node from the end of the list and return its head.|
|[reverseList](./scripts/kotlin/LinkedList/reverseList.kt)|Reverse a singly linked list.|
|[removeElements](./scripts/kotlin/LinkedList/removeElements.kt)|Remove all elements from a linked list of integers that have value val.|
|[oddEvenList](./scripts/kotlin/LinkedList/oddEvenList.kt)|Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes. You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.|
|[palindrome](./scripts/kotlin/LinkedList/palindrome.kt)|Given a singly linked list, determine if it is a palindrome.|
|[mergeTwoLists](./scripts/kotlin/LinkedList/mergeTwoLists.kt)|Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.|
|[addTwoNumbers](./scripts/kotlin/LinkedList/addTwoNumbers.kt)|You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.|
|[rotateRight](./scripts/kotlin/LinkedList/rotateRight.kt)|Given the head of a linked list, rotate the list to the right by k places.|
|[flattenLinkedList](./scripts/kotlin/LinkedList/flattenLinkedList.kt)|You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure. Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.|
|[linkedListRandom](./scripts/kotlin/LinkedList/linkedListRandom.kt)|Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.|
|[deleteDuplicates](./scripts/kotlin/LinkedList/deleteDuplicates.kt)|Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.|
|[swapPairs](./scripts/kotlin/LinkedList/swapPairs.kt)|Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)|
|[sortList](./scripts/kotlin/LinkedList/sortList.kt)|Given the head of a linked list, return the list after sorting it in ascending order.|
|[deleteDuplicates2](./scripts/kotlin/LinkedList/deleteDuplicates2.kt)|Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.|
|[copyRandomList](./scripts/kotlin/LinkedList/copyRandomList.kt)|Description in the file|
|[addTwoNumbers](./scripts/kotlin/LinkedList/addTwoNumbers.kt)|You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number `0` itself.|
|[swapNodes](./scripts/kotlin/LinkedList/swapNodes.kt)|You are given the head of a linked list, and an integer `k`. Return the head of the linked list after swapping the values of the `k`th node from the beginning and the `k`th node from the end (the list is 1-indexed).|
|[NestedIterator](./scripts/kotlin/LinkedList/NestedIterator.kt)|Description is in the file|
|[reverseKGroup](./scripts/kotlin/LinkedList/reverseKGroup.kt)|Given the head of a linked list, reverse the nodes of the list `k` at a time, and return the modified list. `k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is. You may not alter the values in the list's nodes, only nodes themselves may be changed.|


#### Tree
| File | Task |
|------|------|
|[preorderTraversal](./scripts/kotlin/Tree/preorderTraversal.kt)|Given the root of a binary tree, return the preorder traversal of its nodes' values.|
|[inorderTraversal](./scripts/kotlin/Tree/inorderTraversal.kt)|Given the root of a binary tree, return the inorder traversal of its nodes' values.|
|[postorderTraversal](./scripts/kotlin/Tree/postorderTraversal.kt)|Given the root of a binary tree, return the postorder traversal of its nodes' values.|
|[goodNodes](./scripts/kotlin/Tree/goodNodes.kt)|Given a binary tree `root`, a node `X` in the tree is named good if in the path from root to `X` there are no nodes with a value greater than `X`. Return the number of good nodes in the binary tree.|
|[mergeTwoTrees](./scripts/kotlin/Tree/mergeTwoTrees.kt)|You are given two binary trees `root1` and `root2`. Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree. Return the merged tree. Note: The merging process must start from the root nodes of both trees.|
|[populateNextRightPointer](./scripts/kotlin/Tree/populateNextRightPointer.kt)|You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.|
|[invertTree](./scripts/kotlin/Tree/invertTree.kt)|Given the `root` of a binary tree, invert the tree, and return its `root`.|
|[maxAncestorDiff](./scripts/kotlin/Tree/maxAncestorDiff.kt)|Given the root of a binary tree, find the maximum value `v` for which there exist different nodes `a` and `b` where `v = \|a.val - b.val\|` and `a` is an ancestor of `b`. A node `a` is an ancestor of `b` if either: any child of `a` is equal to `b` or any child of `a` is an ancestor of `b`.|
|[isSameTree](./scripts/kotlin/Tree/isSameTree.kt)|Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not. Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.|
|[sortedArrayToBST](./scripts/kotlin/Tree/sortedArrayToBST.kt)|Given an integer array `nums` where the elements are sorted in ascending order, convert it to a height-balanced binary search tree. A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.|
[isBalanced](./scripts/kotlin/Tree/isBalanced.kt)|Given a binary tree, determine if it is height-balanced. A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than `1`.|
|[minDepth](./scripts/kotlin/Tree/minDepth.kt)|Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node. Note: A leaf is a node with no children.|
|[hasPathSum](./scripts/kotlin/Tree/hasPathSum.kt)|Given the root of a binary tree and an integer `targetSum`, return `true` if the tree has a root-to-leaf path such that adding up all the values along the path equals `targetSum`.|
|[widthOfBinaryTree](./scripts/kotlin/Tree/widthOfBinaryTree.kt)|Given the root of a binary tree, return the maximum width of the given tree.|
|[binaryTreePaths](./scripts/kotlin/Tree/binaryTreePaths.kt)|Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children.|
|[lowestCommonAncestor](./scripts/kotlin/Tree/lowestCommonAncestor.kt)|Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.|
|[naryPreorderTraversal](./scripts/kotlin/Tree/naryPreorderTraversal.kt)|Given the root of an `n`-ary tree, return the preorder traversal of its nodes' values.|
|[isSubPath](./scripts/kotlin/Tree/isSubPath.kt)|Given a binary tree `root` and a linked list with `head` as the first node. Return `True` if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return `False`.|
|[findMode](./scripts/kotlin/Tree/findMode.kt)|Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it. If the tree has more than one mode, return them in any order.|
|[levelOrder](./scripts/kotlin/Tree/levelOrder.kt)|Given an `n`-ary tree, return the level order traversal of its nodes' values.|
|[numOfMinutes](./scripts/kotlin/Tree/numOfMinutes.kt)|Description in the file|
|[BSTIterator](./scripts/kotlin/Tree/BSTIterator.kt)|Description is in the file|
|[getMinimumDifference](./scripts/kotlin/Tree/getMinimumDifference.kt)|Given the `root` of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.|
|[searchBST](./scripts/kotlin/Tree/searchBST.kt)|You are given the root of a binary search tree (BST) and an integer `val`. Find the node in the BST that the node's value equals `val` and return the subtree rooted with that node. If such a node does not exist, return `null`.|
|[trimBST](./scripts/kotlin/Tree/trimBST.kt)|Given the root of a binary search tree and the lowest and highest boundaries as `low` and `high`, trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer. Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.|
|[convertBST](./scripts/kotlin/Tree/convertBST.kt)|Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.|
|[increasingBST](./scripts/kotlin/Tree/increasingBST.kt)|Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.|
|[kthSmallest](./scripts/kotlin/Tree/kthSmallest.kt)|Given the root of a binary search tree, and an integer `k`, return the `k`th smallest value (`1`-indexed) of all the values of the nodes in the tree.|
|[recoverTree](./scripts/kotlin/Tree/recoverTree.kt)|You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.|
|[connect](./scripts/kotlin/Tree/connect.kt)|Given a binary tree. Populate each `next` pointer to point to its next right node. If there is no next right node, the `next` pointer should be set to `NULL`. Initially, all next pointers are set to `NULL`.|
|[isSubtree](./scripts/kotlin/Tree/isSubtree.kt)|Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values of `subRoot` and `false` otherwise. A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.|
|[MyCalendar](./scripts/kotlin/Tree/MyCalendar.kt)|Description is in the file|
|[SeatManager](./scripts/kotlin/Tree/SeatManager.kt)|Description is in the file|
|[minimumDeviation](./scripts/kotlin/Tree/minimumDeviation.kt)|Description is in the file.|
|[WordDictionary](./scripts/kotlin/Tree/WordDictionary.kt)|Design a data structure that supports adding new words and finding if a string matches any previously added string.|
|[findMinHeightTrees](./scripts/kotlin/Tree/findMinHeightTrees.kt)|Given a tree of n nodes labelled from `0` to `n - 1`, and an array of `n - 1` edges where `edges[i] = [ai, bi]` indicates that there is an undirected edge between the two nodes `ai` and `bi` in the tree, you can choose any node of the tree as the root. When you select a node `x` as the root, the result tree has height `h`. Among all possible rooted trees, those with minimum height (i.e. `min(h)`)  are called minimum height trees (MHTs). Return a list of all MHTs' root labels. You can return the answer in any order.|
|[maxDepth](./scripts/kotlin/Tree/maxDepth.kt)|Given a `n`-ary tree, find its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.|
|[postorder](./scripts/kotlin/Tree/postorder.kt)|Given the root of an n-ary tree, return the postorder traversal of its nodes' values.|
|[averageOfSubtree](./scripts/kotlin/Tree/averageOfSubtree.kt)|Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.|
|[tree2str](./scripts/kotlin/Tree/tree2str.kt)|Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it. Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.|
|[averageOfLevels](./scripts/kotlin/Tree/averageOfLevels.kt)|Given the `root` of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within `10^-5` of the actual answer will be accepted.|
|[getTargetCopy](./scripts/kotlin/Tree/getTargetCopy.java)|Given two binary trees `original` and `cloned` and given a reference to a node `target` in the original tree. The `cloned` tree is a copy of the `original` tree. Return a reference to the same node in the `cloned` tree. Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.|
|[isValidBST](./scripts/kotlin/Tree/isValidBST.kt)|Given the root of a binary tree, determine if it is a valid binary search tree (BST).|
|[findTarget](./scripts/kotlin/Tree/findTarget.kt)|Given the root of a Binary Search Tree and a target number `k`, return true if there exist two elements in the BST such that their sum is equal to the given target.|
|[zigZagLevelOrder](./scripts/kotlin/Tree/zigZagLevelOrder.kt)|Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).|
|[buildTree](./scripts/kotlin/Tree/buildTree.kt)|Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return the binary tree.|
|[rightSideView](./scripts/kotlin/Tree/rightSideView.kt)|Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.|
|[pathSum](./scripts/kotlin/Tree/pathSum.kt)|Given the root of a binary tree and an integer `targetSum`, return all root-to-leaf paths where the sum of the node values in the path equals `targetSum`. Each path should be returned as a list of the node values, not node references. A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.|
|[TreeSerialization](./scripts/kotlin/Tree/TreeSerialization.kt)|Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment. Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.|