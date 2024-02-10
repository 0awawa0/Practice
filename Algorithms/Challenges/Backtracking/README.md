# Backtracking

## [Exist](./code/exist.kt)|
Given an `m x n` grid of characters board and a string `word`, return `true` if word exists in the grid. The `word` can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

## [Letter Combinations](./code/letterCombinations.kt)
Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

## [Generate Parenthesis](./code/generateParenthesis.kt)
Given `n` pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

## [Combination Sum 2](./code/combinationSum2.kt)
Given a collection of candidate numbers (`candidates`) and a target number (`target`), find all unique combinations in `candidates` where the candidate numbers sum to `target`.

Each number in `candidates` may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

## [Permute Unique](./code/permuteUnique.kt)
Given a collection of numbers, `nums`, that might contain duplicates, return all possible unique permutations in any order.

## [Combination Sum3](./code/combinationSum3.kt)
Find all valid combinations of `k` numbers that sum up to `n` such that the following conditions are true:

    Only numbers 1 through 9 are used.
    Each number is used at most once.

Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

## [Solve N Queens](./code/solveNQueens.kt)
The `n`-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other. Given an integer `n`, return all distinct solutions to the `n`-queens puzzle. You may return the answer in any order. Each solution contains a distinct board configuration of the `n`-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

## [Total N Queens](./code/totalNQueens.kt)
The `n`-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other. Given an integer `n`, return the number of distinct solutions to the `n`-queens puzzle.

## [Find Words](./code/findWords.kt)
Given an `m x n` board of characters and a list of strings words, return all words on the board. Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

## [Smallest Number](./code/smallestNumber.kt)
You are given a `0`-indexed string pattern of length `n` consisting of the characters `'I'` meaning increasing and `'D'` meaning decreasing.

A `0`-indexed string num of length `n + 1` is created using the following conditions:

    num consists of the digits '1' to '9', where each digit is used at most once.
    If pattern[i] == 'I', then num[i] < num[i + 1].
    If pattern[i] == 'D', then num[i] > num[i + 1].

Return the lexicographically smallest possible string num that meets the conditions.

## [Nums Same Consec Diff](./code/numsSameConsecDiff.kt)
Return all non-negative integers of length `n` such that the absolute difference between every two consecutive digits is `k`. Note that every number in the answer must not have leading zeros. For example, `01` has one leading zero and is invalid. You may return the answer in any order.

## [Number of Ways](./code/numberOfWays.kt)|
You are given two positive integers `startPos` and `endPos`. Initially, you are standing at position `startPos` on an infinite number line. With one step, you can move either one position to the left, or one position to the right.

Given a positive integer `k`, return the number of different ways to reach the position `endPos` starting from `startPos`, such that you perform exactly `k` steps. Since the answer may be very large, return it modulo `10^9 + 7`.

Two ways are considered different if the order of the steps made is not exactly the same.

Note that the number line includes negative integers.


## [Num Rolls to Target](./code/numRollsToTarget.kt)
You have `n` dice and each die has `k` faces numbered from `1` to `k`. Given three integers `n`, `k`, and `target`, return the number of possible ways (out of the kn total ways) to roll the dice so the sum of the face-up numbers equals `target`. Since the answer may be too large, return it modulo `10^9 + 7`.|