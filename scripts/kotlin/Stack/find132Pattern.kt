
/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.
*/

fun find132pattern(nums: IntArray): Boolean {
    var thirdNumber = Int.MIN_VALUE
    val stack = LinkedList<Int>()
    for (i in nums.lastIndex downTo 0) {
        if (nums[i] < thirdNumber) return true
        else {
            while (stack.isNotEmpty() && nums[i] > stack.peek()) thirdNumber = stack.pop()
            stack.push(nums[i])
        }
    }
    return false
}