# Priority Queue

## [Maximum Product](./code/maximumProduct.kt)
You are given an array of non-negative integers `nums` and an integer `k`. In one operation, you may choose any element from `nums` and increment it by `1`. Return the maximum product of `nums` after at most `k` operations. Since the answer may be very large, return it modulo `10^9 + 7`.

## [Top K Frequent](./code/topKFrequent.kt)
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in any order.

## [Kth Largest](./code/KthLargest.kt)
Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Implement KthLargest class:

    KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
    int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.

## [Last Stone Weight](./code/lastStoneWeight.kt)
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

    If x == y, both stones are destroyed, and
    If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

At the end of the game, there is at most one stone left.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.

## [Maximum Candies](./code/maximumCandies.kt)
You are given a `0`-indexed integer array `candies`. Each element in the array denotes a pile of candies of size `candies[i]`. You can divide each pile into any number of sub piles, but you cannot merge two piles together. You are also given an integer `k`. You should allocate piles of candies to `k` children such that each child gets the same number of candies. Each child can take at most one pile of candies and some piles of candies may go unused. Return the maximum number of candies each child can get.

## [k Weakest Roww](./code/kWeakestRows.kt)
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.

Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

## [Halve Array](./code/halveArray.kt)
You are given an array `nums` of positive integers. In one operation, you can choose any number from `nums` and reduce it to exactly half the number. (Note that you may choose this reduced number in future operations.) Return the minimum number of operations to reduce the sum of `nums` by at least half.

## [Highest Ranked K Items](./code/highestRankedKItems.kt)
You are given a `0`-indexed 2D integer array grid of size `m x n` that represents a map of the items in a shop. The integers in the grid represent the following:

    0 represents a wall that you cannot pass through.
    1 represents an empty cell that you can freely move to and from.
    All other positive integers represent the price of an item in that cell. You may also freely move to and from these item cells.

It takes 1 step to travel between adjacent grid cells.

You are also given integer arrays `pricing` and start where `pricing = [low, high]` and `start = [row, col]` indicates that you start at the position `(row, col)` and are interested only in items with a price in the range of `[low, high]` (inclusive). You are further given an integer `k`.

You are interested in the positions of the `k` highest-ranked items whose prices are within the given price range. The rank is determined by the first of these criteria that is different:

    Distance, defined as the length of the shortest path from the start (shorter distance has a higher rank).
    Price (lower price has a higher rank, but it must be in the price range).
    The row number (smaller row number has a higher rank).
    The column number (smaller column number has a higher rank).

Return the `k` highest-ranked items within the price range sorted by their rank (highest to lowest). If there are fewer than k reachable items within the price range, return all of them.

## [Car Pooling](./code/carPooling.kt)
There is a car with `capacity` empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west). You are given the integer `capacity` and an array `trips` where `trip[i] = [numPassengersi, fromi, toi]` indicates that the `ith` trip has `numPassengersi` passengers and the locations to pick them up and drop them off are `fromi` and `toi` respectively. The locations are given as the number of kilometers due east from the car's initial location. Return `true` if it is possible to pick up and drop off all passengers for all the given trips, or `false` otherwise.

## [Min Cost Connect Points](./code/minCostConnectPoints.kt)
You are given an array points representing integer coordinates of some points on a 2D-plane, where `points[i] = [xi, yi]`.

The cost of connecting two points `[xi, yi]` and `[xj, yj]` is the manhattan distance between them: `|xi - xj| + |yi - yj|`, where `|val|` denotes the absolute value of `val`.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.

## [Minimum Effort Path](./code/minimumEffortPath.kt)
You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.

A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.

Return the minimum effort required to travel from the top-left cell to the bottom-right cell.

## [Network Delay Time](./code/networkDelayTime.kt)
You are given a network of `n` nodes, labeled from `1` to `n`. You are also given times, a list of travel times as directed edges `times[i] = (ui, vi, wi)`, where `ui` is the source node, `vi` is the target node, and `wi` is the time it takes for a signal to travel from source to target. We will send a signal from a given node `k`. Return the time it takes for all the `n` nodes to receive the signal. If it is impossible for all the `n` nodes to receive the signal, return `-1`.

## [Find Kth Largest](./code/findKthLargest.kt)
Given an integer array `nums` and an integer `k`, return the `k`th largest element in the array. Note that it is the `k`th largest element in the sorted order, not the `k`th distinct element.

## [Frequency Sort](./code/frequencySort.kt)
Given a string `s`, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string. Return the sorted string. If there are multiple answers, return any of them.

## [K Closest](./code/kClosest.kt)
Given an array of points where `points[i] = [xi, yi]` represents a point on the X-Y plane and an integer `k`, return the `k` closest points to the origin `(0, 0)`. The distance between two points on the X-Y plane is the Euclidean distance (i.e., `√(x1 - x2)^2 + (y1 - y2)^2)`. You may return the answer in any order.

## [Furthest Building](./code/furthestBuildring.kt)
You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.

You start your journey from building 0 and move to the next building by possibly using bricks or ladders.

While moving from building i to building i+1 (0-indexed),

    If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
    If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.

Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.

## [Schedule Course](./code/scheduleCourse.kt)
There are `n` different online courses numbered from `1` to `n`. You are given an array courses where `courses[i] = [durationi, lastDayi]` indicate that the `i`th course should be taken continuously for `durationi` days and must be finished before or on `lastDayi`. You will start on the 1st day and you cannot take two or more courses simultaneously. Return the maximum number of courses that you can take.

## [Is Possible](./code/isPossible.kt)
You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the following procedure :

    let x be the sum of all elements currently in your array.
    choose index i, such that 0 <= i < n and set the value of arr at index i to x.
    You may repeat this procedure as many times as needed.

Return true if it is possible to construct the target array from arr, otherwise, return false.

## [Smallest Trimmed Numbers](./code/smallestTrimmedNumbers.kt)
You are given a 0-indexed array of strings nums, where each string is of equal length and consists of only digits.

You are also given a 0-indexed 2D integer array queries where queries[i] = [ki, trimi]. For each queries[i], you need to:

    + Trim each number in nums to its rightmost trimi digits.
    + Determine the index of the kith smallest trimmed number in nums. If two trimmed numbers are equal, the number with the lower index is considered to be smaller.
    + Reset each number in nums to its original length.

Return an array answer of the same length as queries, where answer[i] is the answer to the ith query.

Note:

    + To trim to the rightmost x digits means to keep removing the leftmost digit, until only x digits remain.
    + Strings in nums may contain leading zeros.

## [Leatst Interval](./code/leastInterval.kt)
Given a characters array `tasks`, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle. However, there is a non-negative integer `n` that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least `n` units of time between any two same tasks. Return the least number of units of times that the CPU will take to finish all the given tasks.

## [MedianFinder](./code/MedianFinder.kt)
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.

    For example, for arr = [2,3,4], the median is 3.
    For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.

Implement the MedianFinder class:

    MedianFinder() initializes the MedianFinder object.
    void addNum(int num) adds the integer num from the data stream to the data structure.
    double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.