# Stack

## [Valid Parentheses](./code/validParentheses.kt)
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

## [Cal Points](./code/calPoints.kt)
You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

    An integer x - Record a new score of x.
    "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
    "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
    "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.

Return the sum of all the scores on the record.

## [Next Greater Elements](./code/nextGreaterElements.kt)
Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return the next greater number for every element in `nums`. The next greater number of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.

## [FreqStack](./code/FreqStack.kt)
Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

## [Remove Duplicate Letters](./code/removeDuplicateLetters.kt)
Given a string `s`, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

## [Validate Stack Sequences](./code/validateStackSequences.kt)
Given two integer arrays `pushed` and `popped` each with distinct values, return `true` if this could have been the result of a sequence of push and pop operations on an initially empty stack, or `false` otherwise.

## [Eval RPN](./code/evalRPN.kt)
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

## [Find Content Children](./code/findContentChildren.kt)
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. Each child `i` has a greed factor `g[i]`, which is the minimum size of a cookie that the child will be content with; and each cookie `j` has a size `s[j]`. If `s[j] >= g[i]`, we can assign the cookie `j` to the child `i`, and the child `i` will be content. Your goal is to maximize the number of your content children and output the maximum number.

## [Min Remove to Make Valid](./code/minRemoveToMakeValid.kt)
Given a string `s` of `'('` , `')'` and lowercase English characters. Your task is to remove the minimum number of parentheses ( `'('` or `')'`, in any positions ) so that the resulting parentheses string is valid and return any valid string.

## [Remove K Digits](./code/removeKDigits.kt)
Given string `num` representing a non-negative integer `num`, and an integer `k`, return the smallest possible integer after removing `k` digits from `num`.

## [StockSpanner](./code/StockSpanner.kt)
Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

## [Min stack](./code/minStack.kt)
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

## [Find 132 Pattern](./code/find132Pattern.kt)
Given an array of `n` integers `nums`, a 132 pattern is a subsequence of three integers `nums[i]`, `nums[j]` and `nums[k]` such that `i < j < k` and `nums[i] < nums[k] < nums[j]`. Return `true` if there is a 132 pattern in `nums`, otherwise, return `false`.

## [Asteroid Collision](./code/asteroidCollision.kt)
We are given an array `asteroids` of integers representing asteroids in a row. For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed. Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
