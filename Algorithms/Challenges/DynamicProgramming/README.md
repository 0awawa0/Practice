# Dynamic Programming

## [Min Subarray Len](./code/minSubArrayLen.kt)
Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a contiguous subarray `[numsl, numsl+1, ..., numsr-1, numsr]` of which the sum is greater than or equal to `target`. If there is no such subarray, return `0` instead.

## [Num Matrix](./code/NumMatrix.kt)
Given a 2D matrix matrix, handle multiple queries of the following type:

    + Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Implement the NumMatrix class:

    + NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
    + int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

## [Dig Artifacts](./code/digArtifacts.kt)
There is an n x n 0-indexed grid with some artifacts buried in it. You are given the integer n and a 0-indexed 2D integer array artifacts describing the positions of the rectangular artifacts where artifacts[i] = [r1i, c1i, r2i, c2i] denotes that the ith artifact is buried in the subgrid where:

    + (r1i, c1i) is the coordinate of the top-left cell of the ith artifact and
    + (r2i, c2i) is the coordinate of the bottom-right cell of the ith artifact.

You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.

Given a 0-indexed 2D integer array dig where dig[i] = [ri, ci] indicates that you will excavate the cell (ri, ci), return the number of artifacts that you can extract.

## [Max Score Indices](./code/maxScoreIndices.kt)
You are given a 0-indexed binary array nums of length n. nums can be divided at index i (where 0 <= i <= n) into two arrays (possibly empty) numsleft and numsright:

    numsleft has all the elements of nums between index 0 and i - 1 (inclusive), while numsright has all the elements of nums between index i and n - 1 (inclusive).
    If i == 0, numsleft is empty, while numsright has all the elements of nums.
    If i == n, numsleft has all the elements of nums, while numsright is empty.

The division score of an index i is the sum of the number of 0's in numsleft and the number of 1's in numsright.

Return all distinct indices that have the highest possible division score. You may return the answer in any order.

## [Cherry Pick](./code/cherryPick.kt)
You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.

You have two robots that can collect cherries for you:

    Robot #1 is located at the top-left corner (0, 0), and
    Robot #2 is located at the top-right corner (0, cols - 1).

Return the maximum number of cherries collection using both robots by following the rules below:

    From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
    When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
    When both robots stay in the same cell, only one takes the cherries.
    Both robots cannot move outside of the grid at any moment.
    Both robots should reach the bottom row in grid.

## [Maximal Square](./code/maximalSquare.kt)
Given an `m x n` binary matrix filled with `0`'s and `1`'s, find the largest square containing only `1`'s and return its area.

## [Island Perimeter](./code/islandPerimeter.kt)
You are given `row x col` grid representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length `1`. The grid is rectangular, width and height don't exceed `100`. Determine the perimeter of the island.

## [Largest Plus Sign](./code/largestPlusSign.kt)
You are given an integer `n`. You have an `n x n` binary grid grid with all values initially `1`'s except for some indices given in the array mines. The ith element of the array mines is defined as `mines[i] = [xi, yi]` where `grid[xi][yi] == 0`. Return the order of the largest axis-aligned plus sign of `1`'s contained in grid. If there is none, return `0`.

## [Rotting Oranges](./code/rottingOranges.kt)
You are given an `m x n` grid where each cell can have one of three values: `0` representing an empty cell, `1` representing a fresh orange, or `2` representing a rotten orange. Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return `-1`.

## [Nearest Zeros](./code/nearestZeros.kt)
Given an `m x n` binary matrix mat, return the distance of the nearest `0` for each cell. The distance between two adjacent cells is `1`.

## [Max Island Area](./code/maxIslandArea.kt)
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water. The area of an island is the number of cells with a value `1` in the island. Return the maximum area of an island in grid. If there is no island, return `0`.

## [House Robber](./code/houseRobber.kt)
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

## [House Robber 2](./code/houseRobber2.kt)
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

## [Jump Game](./code/jumpGame.kt)
You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position. Return `true` if you can reach the last index, or `false` otherwise.

## [Jump Game 2](./code/jumpGame2.kt)
Given an array of non-negative integers `nums`, you are initially positioned at the first index of the array. Each element in the array represents your maximum jump length at that position. Your goal is to reach the last index in the minimum number of jumps. You can assume that you can always reach the last index.

## [Num Decodings](./code/numDecodings.kt)
A message containing letters from A-Z can be encoded into numbers using the following mapping:

`'A' -> "1"`

`'B' -> "2"`

`...`

`'Z' -> "26"`

To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

    "AAJF" with the grouping (1 1 10 6)
    "KJF" with the grouping (11 10 6)

Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

Given a string s containing only digits, return the number of ways to decode it.


## [Word Break](./code/wordBreak.kt)
Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

## [Find Number of LTS](./code/findNumberOfLIS.kt)
Given an integer array `nums`, return the number of longest increasing subsequences.

## [Longest Common Subsequence](./code/longestCommonSubsequence.kt)
Given two strings `text1` and `text2`, return the length of their longest common subsequence. If there is no common subsequence, return `0`. A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. A common subsequence of two strings is a subsequence that is common to both strings.

## [Min Distance](./code/minDistance.kt)
Given two strings `word1` and `word2`, return the minimum number of steps required to make `word1` and `word2` the same. In one step, you can delete exactly one character in either string.

## [Coin Change](./code/coinChange.kt)
You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money. Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return `-1`. You may assume that you have an infinite number of each kind of coin.

## [Edit Distance](./code/editDistance.kt)
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

    + Insert a character
    + Delete a character
    + Replace a character


## [Minimum Card Pickup](./code/minimumCardPickup.kt)
You are given an integer array `cards` where `cards[i]` represents the value of the `i`th card. A pair of cards are matching if the cards have the same value. Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among the picked cards. If it is impossible to have matching cards, return `-1`.

## [Count Texts](./code/countTexts.kt)
Alice is texting Bob using her phone. 
In order to add a letter, Alice has to press the key of the corresponding digit `i` times, where `i` is the position of the letter in the key.

    For example, to add the letter 's', Alice has to press '7' four times. Similarly, to add the letter 'k', Alice has to press '5' twice.
    Note that the digits '0' and '1' do not map to any letters, so Alice does not use them.

However, due to an error in transmission, Bob did not receive Alice's text message but received a string of pressed keys instead.

    For example, when Alice sent the message "bob", Bob received the string "2266622".

Given a string pressedKeys representing the string received by Bob, return the total number of possible text messages Alice could have sent.

Since the answer may be very large, return it modulo 10^9 + 7.

## [Unique Paths with Obstacles](./code/uniquePathsWithObstacles.kt)
You are given an `m x n` integer array `grid`. There is a robot initially located at the top-left corner (i.e., `grid[0][0]`). The robot tries to move to the bottom-right corner (i.e., `grid[m-1][n-1]`). The robot can only move either down or right at any point in time. An obstacle and space are marked as `1` or `0` respectively in grid. A path that the robot takes cannot include any square that is an obstacle. Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

## [Count Substrings](./code/countSubstrings.kt)
Given a string `s`, return the number of palindromic substrings in it. A string is a palindrome when it reads the same backward as forward. A substring is a contiguous sequence of characters within the string.

## [Find Max Form](./code/findMaxForm.kt)
You are given an array of binary strings `strs` and two integers `m` and `n`. Return the size of the largest subset of `strs` such that there are at most `m` `0`'s and `n` `1`'s in the subset.

## [Max Envelopes](./code/maxEnvelopes.kt)
You are given a 2D array of integers `envelopes` where `envelopes[i] = [wi, hi]` represents the width and the height of an envelope. One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height. Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other). Note: You cannot rotate an envelope.

## [Find the Winner](./code/findTheWinner.kt)
There are `n` friends that are playing a game. The friends are sitting in a circle and are numbered from `1` to `n` in clockwise order. More formally, moving clockwise from the `i`th friend brings you to the `(i+1)`th friend for `1 <= i < n`, and moving clockwise from the `n`th friend brings you to the `1`st friend.

The rules of the game are as follows:

    Start at the 1st friend.
    Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
    The last friend you counted leaves the circle and loses the game.
    If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
    Else, the last friend in the circle wins the game.

Given the number of friends, `n`, and an integer `k`, return the winner of the game.


## [Min Cost Climbing Stairs](./code/minCostClimbingStairs.kt)
You are given an integer array `cost` where `cost[i]` is the cost of `i`th step on a staircase. Once you pay the cost, you can either climb one or two steps. You can either start from the step with index `0`, or the step with index `1`. Return the minimum cost to reach the top of the floor.

## [Max Subarray Sum Circular](./code/maxSubarraySumCircular.kt)
Given a circular integer array `nums` of length `n`, return the maximum possible sum of a non-empty subarray of `nums`. A circular array means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i] is nums[(i - 1 + n) % n]`. A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray `nums[i], nums[i + 1], ..., nums[j]`, there does not exist `i <= k1, k2 <= j` with `k1 % n == k2 % n`.

## [Longest Str Chain](./code/longestStrChain.kt)
You are given an array of `words` where each `word` consists of lowercase English letters. `wordA` is a predecessor of `wordB` if and only if we can insert exactly one letter anywhere in `wordA` without changing the order of the other characters to make it equal to `wordB`. A word chain is a sequence of words `[word1, word2, ..., wordk]` with `k >= 1`, where `word1` is a predecessor of `word2`, `word2` is a predecessor of `word3`, and so on. A single word is trivially a word chain with `k == 1`. Return the length of the longest possible word chain with words chosen from the given list of `words`.

## [Get Max Len](./code/getMaxLen.kt)
Given an array of integers `nums`, find the maximum length of a subarray where the product of all its elements is positive. A subarray of an array is a consecutive sequence of zero or more values taken out of that array. Return the maximum length of a subarray with positive product.

## [Max Score Sight Seeing Pair](./code/maxScoreSightSeeingPair.kt)
You are given an integer array `values` where `values[i]` represents the value of the `i`th sightseeing spot. Two sightseeing spots `i` and `j` have a distance `j - i` between them. The score of a pair (`i < j`) of sightseeing spots is `values[i] + values[j] + i - j`: the sum of the values of the sightseeing spots, minus the distance between them. Return the maximum score of a pair of sightseeing spots.

## [Best Time To Buy and Sell Stock with Fee](./code/bestTimeToBuyAndSellStockWithFee.kt)
You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day, and an integer fee representing a transaction fee. Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

## [Best Time to Buy and Sell Stock with Cooldown](./code/bestTimeToBuyAndSellStockWithCooldown.kt)
You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day. Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions: after you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).

## [Trap](./code/trap.kt)
Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

## [nth Ugly Number](./code/nthUglyNumber.kt)
An ugly number is a positive integer whose prime factors are limited to `2`, `3`, and `5`. Given an integer `n`, return the `n`th ugly number.|
|[numTrees](./scripts/kotlin/DynamicProgramming/numTrees.kt)|Given an integer `n`, return the number of structurally unique BST's (binary search trees) which has exactly `n` nodes of unique values from `1` to `n`.

## [Min Falling Path Sum](./code/minFallingPathSum.kt)
Given an `n x n` array of integers `matrix`, return the minimum sum of any falling path through matrix. A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position `(row, col)` will be `(row + 1, col - 1)`, `(row + 1, col)`, or `(row + 1, col + 1)`.

## [Min Path Sum](./code/minPathSum.kt)
Given a `m x n` grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path. Note: You can only move either down or right at any point in time.

## [Maximum Spliced Array](./code/maximumSplicedArray.kt)
You are given two `0`-indexed integer arrays `nums1` and `nums2`, both of length `n`. You can choose two integers `left` and `right` where `0 <= left <= right < n` and swap the subarray `nums1[left...right]` with the subarray `nums2[left...right]`. You may choose to apply the mentioned operation once or not do anything. The score of the arrays is the maximum of `sum(nums1)` and `sum(nums2)`, where `sum(arr)` is the sum of all the elements in the array `arr`. Return the maximum possible score.

## [Longest Palindromic Subseq](./code/longestPalindromicSubseq.kt)
Given a string `s`, find the longest palindromic subsequence's length in `s`. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

## [Matrix Block Sum](./code/matrixBlockSum.kt)
Given a `m x n` matrix `mat` and an integer `k`, return a matrix `answer` where each `answer[i][j]` is the sum of all elements `mat[r][c]` for:

    + i - k <= r <= i + k,
    + j - k <= c <= j + k, and
    + (r, c) is a valid position in the matrix.

## [Coin Change 2](./code/coinChange2.kt)
You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money. Return the number of combinations that make up that `amount`. If that amount of money cannot be made up by any combination of the coins, return `0`. You may assume that you have an infinite number of each kind of coin. The answer is guaranteed to fit into a signed 32-bit integer.

## [Combination Sum 4](./code/combinationSum4.kt)
Given an array of distinct integers `nums` and a target integer `target`, return the number of possible combinations that add up to target. The test cases are generated so that the answer can fit in a 32-bit integer.

## [People Aware of Secret](./code/peopleAwareOfSecret.kt)
On day `1`, one person discovers a secret. You are given an integer `delay`, which means that each person will share the secret with a new person every day, starting from `delay` days after discovering the secret. You are also given an integer `forget`, which means that each person will forget the secret `forget` days after discovering it. A person cannot share the secret on the same day they forgot it, or on any day afterwards. Given an integer `n`, return the number of people who know the secret at the end of day `n`. Since the answer may be very large, return it modulo `10^9 + 7`.

## [Count Paths](./code/countPaths.kt)
You are given an `m x n` integer matrix `grid`, where you can move from a cell to any adjacent cell in all 4 directions. Return the number of strictly increasing paths in the `grid` such that you can start from any cell and end at any cell. Since the answer may be very large, return it modulo `10^9 + 7`. Two paths are considered different if they do not have exactly the same sequence of visited cells.

## [Is Interleave](./code/isInterleave.kt)
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

    + s = s1 + s2 + ... + sn
    + t = t1 + t2 + ... + tm
    + |n - m| <= 1
    + The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...

Note: a + b is the concatenation of strings a and b.

## [Min Cost](./code/minCost.kt)
There is a row of `m` houses in a small city, each house must be painted with one of the `n` colors (labeled from `1` to `n`), some houses that have been painted last summer should not be painted again.

A neighborhood is a maximal group of continuous houses that are painted with the same color.

    + For example: houses = [1,2,2,3,3,2,1,1] contains 5 neighborhoods [{1}, {2,2}, {3,3}, {2}, {1,1}].

Given an array `houses`, an `m x n` matrix `cost` and an integer target where:

    + houses[i]: is the color of the house i, and 0 if the house is not painted yet.
    + cost[i][j]: is the cost of paint the house i with the color j + 1.

Return the minimum cost of painting all the remaining houses in such a way that there are exactly `target` neighborhoods. If it is not possible, return `-1`.

## [Jump Game 4](./code/jumpGame4.kt)
You are given a `0`-indexed integer array `nums` and an integer `k`. You are initially standing at index `0`. In one move, you can jump at most `k` steps forward without going outside the boundaries of the array. That is, you can jump from index `i` to any index in the range `[i + 1, min(n - 1, i + k)]` inclusive. You want to reach the last index of the array (index `n - 1`). Your score is the sum of all `nums[j]` for each index `j` you visited in the array. Return the maximum score you can get.

## [Make Square](./code/makesquare.kt)
You are given an integer array matchsticks where `matchsticks[i]` is the length of the `i`th matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time. Return `true` if you can make this square and false otherwise.

## [k Inverse Pairs](./code/kInversePairs.kt)
For an integer array `nums`, an inverse pair is a pair of integers `[i, j]` where `0 <= i < j < nums.length` and `nums[i] > nums[j]`. Given two integers `n` and `k`, return the number of different arrays consist of numbers from `1` to `n` such that there are exactly `k` inverse pairs. Since the answer can be huge, return it modulo `10^9 + 7`.

## [Poor Pigs](./code/poorPigs.kt)
There are `buckets` buckets of liquid, where exactly one of the buckets is poisonous. To figure out which one is poisonous, you feed some number of (poor) pigs the liquid to see whether they will die or not. Unfortunately, you only have `minutesToTest` minutes to determine which bucket is poisonous.

You can feed the pigs according to these steps:

    Choose some live pigs to feed.
    For each pig, choose which buckets to feed it. The pig will consume all the chosen buckets simultaneously and will take no time.
    Wait for minutesToDie minutes. You may not feed any other pigs during this time.
    After minutesToDie minutes have passed, any pigs that have been fed the poisonous bucket will die, and all others will survive.
    Repeat this process until you run out of time.

Given buckets, minutesToDie, and minutesToTest, return the minimum number of pigs needed to figure out which bucket is poisonous within the allotted time.

## [Valid Partition](./code/validPartition.kt)
You are given a 0-indexed integer array nums. You have to partition the array into one or more contiguous subarrays.

We call a partition of the array valid if each of the obtained subarrays satisfies one of the following conditions:

    The subarray consists of exactly 2 equal elements. For example, the subarray [2,2] is good.
    The subarray consists of exactly 3 equal elements. For example, the subarray [4,4,4] is good.
    The subarray consists of exactly 3 consecutive increasing elements, that is, the difference between adjacent elements is 1. For example, the subarray [3,4,5] is good, but the subarray [1,3,5] is not.

Return true if the array has at least one valid partition. Otherwise, return false.

## [Count Permutation](./code/countPermutation.kt)
Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

    Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
    Each vowel 'a' may only be followed by an 'e'.
    Each vowel 'e' may only be followed by an 'a' or an 'i'.
    Each vowel 'i' may not be followed by another 'i'.
    Each vowel 'o' may only be followed by an 'i' or a 'u'.
    Each vowel 'u' may only be followed by an 'a'.

Since the answer may be too large, return it modulo 10^9 + 7.

## [Num Factored Binary Trees](./code/numFactoredBinaryTrees.kt)
Given an array of unique integers, `arr`, where each integer `arr[i]` is strictly greater than `1`. We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children. Return the number of binary trees we can make. The answer may be too large so return the answer modulo `10^9 + 7`.

## [Find Length](./code/findLength.kt)
Given two integer arrays `nums1` and `nums2`, return the maximum length of a subarray that appears in both arrays.

## [Perfect Squares](./code/perfectSquares.kt)
Given an integer `n`, return _the least number of perfect square numbers that sum to_ `n`. A **perfect square** is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, `1`, `4`, `9`, and `16` are perfect squares while `3` and `11` are not.

## [Max Operations](./MaxOperations/README.md)

Given an array of integers called `nums`, you can perform any of the following operation while `nums` contains at least `2` elements:

    Choose the first two elements of nums and delete them.
    Choose the last two elements of nums and delete them.
    Choose the first and the last elements of nums and delete them.

The score of the operation is the sum of the deleted elements.
Your task is to find the maximum number of operations that can be performed, such that all operations have the same score.
Return the maximum number of operations possible that satisfy the condition mentioned above.