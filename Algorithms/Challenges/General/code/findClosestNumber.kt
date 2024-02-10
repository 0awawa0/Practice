

/*
Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
*/

fun findClosestNumber(nums: IntArray): Int {
    var prev = nums[0]
    for (num in nums) {
        if (abs(num) == abs(prev) && num > prev) prev = num
        if (abs(num) < abs(prev)) prev = num
    }
    return prev
}