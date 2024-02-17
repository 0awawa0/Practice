# Sorting

## [Subsets With Dup](./code/subsetsWithDup.kt)
Given an integer array `nums` that may contain duplicates, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.

## [Smalest Range](./code/smallestRange.kt)
You are given an integer array `nums` and an integer `k`. For each index `i` where `0 <= i < nums.length`, change `nums[i]` to be either `nums[i] + k` or `nums[i] - k`. The score of `nums` is the difference between the maximum and minimum elements in `nums`. Return the minimum score of `nums` after changing the values at each index.

## [Two City Shed Cost](./code/twoCityShedCost.kt)
A company is planning to interview `2n` people. Given the array costs where `costs[i] = [aCosti, bCosti]`, the cost of flying the `i`th person to city `a` is `aCosti`, and the cost of flying the `i`th person to city `b` is `bCosti`. Return the minimum cost to fly every person to a city such that exactly `n` people arrive in each city.

## [Num Rescue Boats](./code/numRescueBoats.kt)
You are given an array people where `people[i]` is the weight of the `i`th person, and an infinite number of boats where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit. Return the minimum number of boats to carry every given person.

## [Sort By Bits](./code/sortByBits.kt)
You are given an integer array `arr`. Sort the integers in the array in ascending order by the number of `1`'s in their binary representation and in case of two or more integers have the same number of `1`'s you have to sort them in ascending order. Return the array after sorting it.

## [Tree Sum Closest](./code/threeSumClosest.kt)
Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is closest to target. Return the sum of the three integers.

## [Minimum Operations](./code/minimumOperations.kt)
You are given a `0`-indexed array `nums` consisting of `n` positive integers. Return the minimum number of operations required to make the array alternating.

## [Smallest Number](./code/smallestNumber.kt)
You are given an integer `num`. Rearrange the digits of `num` such that its value is minimized and it does not contain any leading zeros. Return the rearranged number with minimal value. Note that the sign of the number does not change after rearranging the digits.

## [Max Run Time](./code/maxRunTime.kt)
You have `n` computers. You are given the integer `n` and a `0`-indexed integer array batteries where the `i`th battery can run a computer for `batteries[i]` minutes. You are interested in running all n computers simultaneously using the given batteries. Return the maximum number of minutes you can run all the n computers simultaneously.

## [Three Sum](./code/threeSum.kt)
Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

## [Frequency Sort](./code/frequencySort.kt)
Given a string `s`, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string. Return the sorted string. If there are multiple answers, return any of them.

## [Can Make Arithmetic Progression](./code/canMakeArithmeticProgression.kt)
Given an array of numbers `arr`. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same. Return `true` if the array can be rearranged to form an arithmetic progression, otherwise, return `false`.

## [Min Subsequnce](./code/minSubsequence.kt)
Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence.

## [Num Identical Pairs](./code/numIdenticalPairs.kt)
Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j. Return the number of good pairs.

## [Max Consecutive](./code/maxConsecutive.kt)
Alice manages a company and has rented some floors of a building as office space. Alice has decided some of these floors should be special floors, used for relaxation only. You are given two integers `bottom` and `top`, which denote that Alice has rented all the floors from `bottom` to `top` (inclusive). You are also given the integer array `special`, where `special[i]` denotes a `special` floor that Alice has designated for relaxation. Return the maximum number of consecutive floors without a special floor.

## [Maximum Bags](./code/maximumBags.kt)
You have `n` bags numbered from `0` to `n - 1`. You are given two `0`-indexed integer arrays `capacity` and `rocks`. The `i`th bag can hold a maximum of `capacity[i]` rocks and currently contains `rocks[i]` rocks. You are also given an integer `additionalRocks`, the number of additional rocks you can place in any of the bags. Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.

## [Maximum Importance](./code/maximumImportance.kt)
You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.

You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.

You need to assign each city with an integer value from 1 to n, where each value can only be used once. The importance of a road is then defined as the sum of the values of the two cities it connects.

Return the maximum total importance of all roads possible after assigning the values optimally.

## [Partition Array](./code/partitionArray.kt)
You are given an integer array `nums` and an integer `k`. You may partition `nums` into one or more subsequences such that each element in `nums` appears in exactly one of the subsequences. Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each subsequence is at most `k`. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

## [Largest Number](./code/largestNumber.kt)
Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it. Since the result may be very large, so you need to return a string instead of an integer.

## [Min Deletions](./code/minDeletions.kt)
A string `s` is called good if there are no two different characters in `s` that have the same frequency. Given a string `s`, return the minimum number of characters you need to delete to make `s` good.

## [Reconstruct Queue](./code/reconstructQueue.kt)
You are given an array of people, `people`, which are the attributes of some people in a queue (not necessarily in order). Each `people[i] = [hi, ki]` represents the `i`th person of height `hi` with exactly `ki` other people in front who have a height greater than or equal to `hi`. Reconstruct and return the queue that is represented by the input array `people`. The returned queue should be formatted as an array `queue`, where `queue[j] = [hj, kj]` is the attributes of the `j`th person in the `queue` (`queue[0]` is the person at the front of the queue).

## [Min Moves 2](./code/minMoves2.kt)
Given an integer array `nums` of size `n`, return the minimum number of moves required to make all array elements equal. In one move, you can increment or decrement an element of the array by `1`.

## [Maximum Units](./code/maximumUnits.kt)
You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

    numberOfBoxesi is the number of boxes of type i.
    numberOfUnitsPerBoxi is the number of units in each box of the type i.

You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.

## [Max Area](./code/maxArea.kt)
You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:

    horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
    verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.

Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 109 + 7.

## [Count Smaller](./code/countSmaller.kt)
You are given an integer array `nums` and you have to return a new `counts` array. The `counts` array has the property where `counts[i]` is the number of smaller elements to the right of `nums[i]`.

## [Min Set Size](./code/minSetSize.kt)
You are given an integer array `arr`. You can choose a set of integers and remove all the occurrences of these integers in the array. Return the minimum size of the set so that at least half of the integers of the array are removed.

## [Answer Queries](./code/answerQueries.kt)
You are given an integer array `nums` of length `n`, and an integer array queries of length `m`. Return an array answer of length `m` where `answer[i]` is the maximum size of a subsequence that you can take from `nums` such that the sum of its elements is less than or equal to `queries[i]`. A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

## [Bag of Tokens Score](./code/bagOfTokensScore.kt)
You have an initial power of power, an initial score of 0, and a bag of tokens where tokens[i] is the value of the ith token (0-indexed).

Your goal is to maximize your total score by potentially playing each token in one of two ways:

    If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power and gaining 1 score.
    If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and losing 1 score.

Each token may be played at most once and in any order. You do not have to play all the tokens.

Return the largest possible score you can achieve after playing any number of tokens.

## [Match Players and Trainers](./code/matchPlayersAndTrainers.kt)
You are given a 0-indexed integer array players, where players[i] represents the ability of the ith player. You are also given a 0-indexed integer array trainers, where trainers[j] represents the training capacity of the jth trainer.

The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be matched with at most one player.

Return the maximum number of matchings between players and trainers that satisfy these conditions.


## [Largest Perimeter Polygon](./largestPerimeterPolygon/README.md)

You are given an array of positive integers `nums` of length `n`.

A polygon is a closed plane figure that has at least `3` sides. The longest side of a polygon is smaller than the sum of its other sides.

Conversely, if you have `k` (`k >= 3`) positive real numbers `a1, a2, a3, ..., ak` where `a1 <= a2 <= a3 <= ... <= ak` and `a1 + a2 + a3 + ... + ak-1 > ak`, then there always exists a polygon with `k` sides whose lengths are `a1, a2, a3, ..., ak`.

The perimeter of a polygon is the sum of lengths of its sides.

Return the largest possible perimeter of a polygon whose sides can be formed from `nums`, or `-1` if it is not possible to create a polygon.

## [Find Least Num of Unique Ints](./findLeastNumOfUniqueInts/README.md)

Given an array of integers `arr` and an integer `k`. Find the least number of unique integers after removing exactly `k` elements.

