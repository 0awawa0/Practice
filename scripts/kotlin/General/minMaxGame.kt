
/*
You are given a 0-indexed integer array nums whose length is a power of 2.

Apply the following algorithm on nums:

    1) Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
    2) For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
    3) For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
    4) Replace the array nums with newNums.
    5) Repeat the entire process starting from step 1.

Return the last number that remains in nums after applying the algorithm.
*/

fun minMaxGame(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]
    val newNums = IntArray(nums.size / 2)
    for (i in newNums.indices) {
        if (i % 2 == 0) newNums[i] = minOf(nums[2 * i], nums[2 * i + 1])
        else newNums[i] = maxOf(nums[2 * i], nums[2 * i + 1])
    }
    return minMaxGame(newNums)
}