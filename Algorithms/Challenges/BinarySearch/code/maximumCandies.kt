
/*
You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can take at most one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.
*/


fun maximumCandies(candies: IntArray, k: Long): Int {
    var left = 0
    var right = 10_000_000
    while (left < right) {
        var s = 0L
        val middle = (left + right + 1) / 2
        candies.forEach { s += it / middle }
        if (k > s) right = middle - 1
        else left = middle
    }
    return left
}