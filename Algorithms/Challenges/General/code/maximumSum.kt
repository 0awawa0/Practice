

/*
You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].

Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.
*/


fun maximumSum(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    var maxSum = -1
    for (num in nums) {
        val digitSum = getDigitSum(num)
        val other = map[digitSum]
        if (other == null) map[digitSum] = num
        else {
            maxSum = maxOf(other + num, maxSum)
            map[digitSum] = maxOf(other, num)
        }
    }
    return maxSum
}

private fun getDigitSum(num: Int): Int {
    var n = num
    var s = 0
    while (n > 0) {
        s += n % 10
        n /= 10
    }
    return s
}