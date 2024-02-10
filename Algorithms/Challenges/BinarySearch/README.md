# Binary Search

## [Insert Position](./code/insertPosition.kt)
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

## [Find Peak Element](./code/findPeakElement.kt)
A peak element is an element that is strictly greater than its neighbors. Given an integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks. You may imagine that `nums[-1] = nums[n] = -∞`. You must write an algorithm that runs in `O(log n)` time.

## [Split Array](./code/splitArray.kt)
Given an array `nums` which consists of non-negative integers and an integer `m`, you can split the array into `m` non-empty continuous subarrays. Write an algorithm to minimize the largest sum among these `m` subarrays.

## [Search Matrix](./code/searchMatrix.kt)
Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`.

## [Valid Palindrome](./code/validPalindrome.kt)
Given a string `s`, return `true` if the `s` can be palindrome after deleting at most one character from it.

## [Minimum Deletions](./code/minimumDeletions.kt)
You are given a `0`-indexed array of distinct integers `nums`. There is an element in `nums` that has the lowest value and an element that has the highest value. We call them the minimum and maximum respectively. Your goal is to remove both these elements from the array. A deletion is defined as either removing an element from the front of the array or removing an element from the back of the array. Return the minimum number of deletions it would take to remove both the minimum and maximum element from the array.

## [Search In Rotated Sorted Array](./code/searchInRotatedSortedArray.kt)
There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is rotated at an unknown pivot index `k` (`0 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (`0`-indexed). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`. Given the array `nums` after the rotation and an integer `target`, return the index of `target` if it is in `nums`, or `-1` if it is not in `nums`. You must write an algorithm with `O(log n)` runtime complexity.

## [Peak Index in Mountain Array](./code/peakIndexInMountainArray.kt)
Given an integer array arr that is guaranteed to be a mountain, return any `i` such that `arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`.

## [Length of LTS](./code/lengthOfLIS.kt)
Given an integer array `nums`, return the length of the longest strictly increasing subsequence.

## [Search Matrix 2](./code/searchMatrix2.kt)
Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`.

## [Find Median Sorted Arrays](./code/findMedianSortedArrays.kt)
Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.

## [TimeMap](./code/TimeMap.kt)
Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

Implement the TimeMap class:

    TimeMap() Initializes the object of the data structure.
    void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
    String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".

## [Search Range](./code/searchRange.kt)
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value. If `target` is not found in the array, return `[-1, -1]`. You must write an algorithm with `O(log n)` runtime complexity.

## [kth Smallest](./code/kthSmallest.kt)
Given an `n x n` matrix where each of the rows and columns is sorted in ascending order, return the `k`th smallest element in the matrix. Note that it is the `k`th smallest element in the sorted order, not the `k`th distinct element.