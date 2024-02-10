# Math

## [Is Number Palindrome](./code/isNumberPalindrome.kt)
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

## [Reverse Integer](./code/reverseInteger.kt)
Given a 32-bit signed integer, reverse digits of an integer.

## [Ways to Buy Pens Pencils](./code/waysToBuyPensPencils.kt)
You are given an integer `total` indicating the amount of money you have. You are also given two integers `cost1` and `cost2` indicating the price of a pen and pencil respectively. You can spend part or all of your money to buy multiple quantities (or none) of each kind of writing utensil. Return the number of distinct ways you can buy some number of pens and pencils.

## [Largest Integer](./code/largestInteger.kt)
You are given a positive integer `num`. You may swap any two digits of `num` that have the same parity (i.e. both odd digits or both even digits). Return the largest possible value of `num` after any number of swaps.

## [Number of Ways](./code/numberOfWays.kt)
You are given a 0-indexed binary string s which represents the types of buildings along a street where:

    s[i] = '0' denotes that the ith building is an office and
    s[i] = '1' denotes that the ith building is a restaurant.

As a city official, you would like to select 3 buildings for random inspection. However, to ensure variety, no two consecutive buildings out of the selected buildings can be of the same type.

    For example, given s = "001101", we cannot select the 1st, 3rd, and 5th buildings as that would form "011" which is not allowed due to having two consecutive buildings of the same type.

Return the number of valid ways to select 3 buildings.

## [kth Palindrome](./code/kthPalindrome.kt)
Given an integer array `queries` and a positive integer `intLength`, return an array `answer` where `answer[i]` is either the `queries[i]`th smallest positive palindrome of length `intLength` or `-1` if no such palindrome exists. A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.

## [Check Perfect Number](./code/checkPerfectNumber.kt)
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer `x` is an integer that can divide `x` evenly. Given an integer `n`, return `true` if `n` is a perfect number, otherwise return `false`.

## [Multiply](./code/multiply.kt)
Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

## [Construct Rectangle](./code/constructRectangle.kt)
A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

    The area of the rectangular web page you designed must equal to the given target area.
    The width W should not be larger than the length L, which means L >= W.
    The difference between length L and width W should be as small as possible.

Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.

## [Count of Orders](./code/countOfOrders.kt)
Given `n` orders, each order consist in pickup and delivery services. Count all valid pickup/delivery possible sequences such that `delivery(i)` is always after of `pickup(i)`.

## [Check Straight Line](./code/checkStraightLine.kt)
You are given an array coordinates, `coordinates[i] = [x, y]`, where `[x, y]` represents the coordinate of a point. Check if these points make a straight line in the XY plane.

## [Nearest Valid Point](./code/nearestValidPoint.kt)
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).

## [Champagne Tower](./code/champagneTower.kt)
We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.  Each glass holds one cup of champagne.

Then, some champagne is poured into the first glass at the top.  When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately to the left and right of it.  When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.  (A glass at the bottom row has its excess champagne fall on the floor.)

For example, after one cup of champagne is poured, the top most glass is full.  After two cups of champagne are poured, the two glasses on the second row are half full.  After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.  After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.
Now after pouring some non-negative integer cups of champagne, return how full the jth glass in the ith row is (both i and j are 0-indexed.)

## [Largest Perimeter](./code/largestPerimeter.kt)
Given an integer array `nums`, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return `0`.

## [Is Perfect Square](./code/isPerfectSquare.kt)
Given a positive integer `num`, write a function which returns `True` if `num` is a perfect square else `False`.

## [Count bits](./code/countBits.kt)
Given an integer `n`, return an array `ans` of length `n + 1` such that for each `i` (`0 <= i <= n`), `ans[i]` is the number of `1`'s in the binary representation of `i`.

## [Sum of Three](./code/sumOfThree.kt)
Given an integer `num`, return three consecutive integers (as a sorted array) that sum to `num`. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

## [Is Ugly](./code/isUgly.kt)
An ugly number is a positive integer whose prime factors are limited to `2`, `3`, and `5`. Given an integer `n`, return `true` if `n` is an ugly number.

## [Reverse Bits](./code/reverseBits.kt)
Reverse bits of a given 32 bits unsigned integer.

## [Happy Number](./code/happyNumber.kt)
Write an algorithm to determine if a number `n` is happy.

## [Majority Element](./code/majorityElement.kt)
Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

## [PascalsTriangle](./code/pascalsTriangle.kt)
Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

## [PascalsTriangleII](./code/pascalsTriangleII.kt)
Given an integer `rowIndex`, return the `rowIndexth` (`0`-indexed) row of the Pascal's triangle.

## [SingleNumber](./code/singleNumber.kt)
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

## [Smallest Repunit Div By K](./code/smallestRepunitDivByK.kt)
Given a positive integer `k`, you need to find the length of the smallest positive integer `n` such that `n` is divisible by `k`, and `n` only contains the digit `1`. Return the length of `n`. If there is no such `n`, return `-1`. Note: `n` may not fit in a 64-bit signed integer.

## [Combinations](./code/combinations.kt)
Efficient calculation of number of combinations of `r` elements from `n`

## [Judge Square Sum](./code/judgeSquareSum.kt)
Given a non-negative integer `c`, decide whether there're two integers `a` and `b` such that `a^2+b^2=c`.

## [Hamming Distance](./code/hammingDistance.kt)
The Hamming distance between two integers is the number of positions at which the corresponding bits are different. Given two integers x and y, calculate the Hamming distance.

## [Integer Break](./code/integerBreak.kt)
Given an integer `n`, break it into the `sum` of `k` positive integers, where `k >= 2`, and maximize the product of those integers. Return the maximum product you can get.

## [Count Vowel Strings](./code/countVowelStrings.kt)
Given an integer `n`, return the number of strings of length `n` that consist only of vowels (`a`, `e`, `i`, `o`, `u`) and are lexicographically sorted. A string `s` is lexicographically sorted if for all valid `i`, `s[i]` is the same as or comes before `s[i+1]` in the alphabet.

## [Largest Combination](./code/largestCombination.kt)
The bitwise AND of an array `nums` is the bitwise AND of all integers in `nums`. You are given an array of positive integers `candidates`. Evaluate the bitwise AND of every combination of numbers of `candidates`. Each number in `candidates` may only be used once in each combination. Return the size of the largest combination of `candidates` with a bitwise AND greater than `0`.

## [Find Max Average](./code/findMaxAverage.kt)
You are given an integer array `nums` consisting of `n` elements, and an integer `k`. Find a contiguous subarray whose length is equal to `k` that has the maximum average value and return this value.

## [Minimum Lines](./code/minimumLines.kt)
You are given a 2D integer array `stockPrices` where `stockPrices[i] = [dayi, pricei]` indicates the price of the stock on day `dayi` is `pricei`. A line chart is created from the array by plotting the points on an XY plane with the X-axis representing the day and the Y-axis representing the price and connecting adjacent points. Return the minimum number of lines needed to represent the line chart.

## [Divide Two Integers](./code/divideTwoIntegers.kt)
Given two integers `dividend` and `divisor`, divide two integers without using multiplication, division, and mod operator.

## [Count Primes](./code/countPrimes.kt)
Given an integer `n`, return the number of prime numbers that are strictly less than `n`.

## [Maximum XOR](./code/maximumXor.kt)
You are given a `0`-indexed integer array `nums`. In one operation, select any non-negative integer `x` and an index `i`, then update `nums[i]` to be equal to `nums[i] AND (nums[i] XOR x)`. Note that `AND` is the bitwise `AND` operation and `XOR` is the bitwise `XOR` operation. Return the maximum possible bitwise `XOR` of all elements of `nums` after applying the operation any number of times.

## [Integer Replacement](./code/integerReplacement.kt)
Given a positive integer n, you can apply one of the following operations:

    If n is even, replace n with n / 2.
    If n is odd, replace n with either n + 1 or n - 1.

Return the minimum number of operations needed for n to become 1.

## [Fill Cups](./code/fillCups.kt)
You have a water dispenser that can dispense cold, warm, and hot water. Every second, you can either fill up `2` cups with different types of water, or `1` cup of any type of water. You are given a `0`-indexed integer array amount of length `3` where `amount[0]`, `amount[1]`, and `amount[2]` denote the number of cold, warm, and hot water cups you need to fill respectively. Return the minimum number of seconds needed to fill up all the cups.

## [Minimum Deletions](./code/minimumDeletions.kt)
You are given two positive integer arrays `nums` and `numsDivide`. You can delete any number of elements from `nums`. Return the minimum number of deletions such that the smallest element in `nums` divides all the elements of `numsDivide`. If this is not possible, return `-1`. Note that an integer `x` divides `y` if `y % x == 0`.

## [Maximum Groups](./code/maximumGroups.kt)
You are given a positive integer array grades which represents the grades of students in a university. You would like to enter all these students into a competition in ordered non-empty groups, such that the ordering meets the following conditions:

    The sum of the grades of students in the ith group is less than the sum of the grades of students in the (i + 1)th group, for all groups (except the last).
    The total number of students in the ith group is less than the total number of students in the (i + 1)th group, for all groups (except the last).

Return the maximum number of groups that can be formed.

## [Mirror Reflection](./code/mirrorReflection.kt)
There is a special square room with mirrors on each of the four walls. Except for the southwest corner, there are receptors on each of the remaining corners, numbered `0`, `1`, and `2`. The square room has walls of length `p` and a laser ray from the southwest corner first meets the east wall at a distance `q` from the `0`th receptor. Given the two integers `p` and `q`, return the number of the receptor that the ray meets first. The test cases are guaranteed so that the ray will meet a receptor eventually.

## [Smallest Even Multiple](./code/smallestEvenMultiple.kt)
Given a positive integer `n`, return the smallest positive integer that is a multiple of both `2` and `n`.

## [Concatenated Binary](./code/concatenatedBinary.kt)
Given an integer `n`, return the decimal value of the binary string formed by concatenating the binary representations of `1` to `n` in order, modulo `10^9 + 7`.

## [Minimize XOR](./code/minimizeXOR.kt)
Given two positive integers num1 and num2, find the integer x such that:

    + x has the same number of set bits as num2, and
    + The value x XOR num1 is minimal.

Note that XOR is the bitwise XOR operation.

Return the integer x. The test cases are generated such that x is uniquely determined.

The number of set bits of an integer is the number of 1's in its binary representation.