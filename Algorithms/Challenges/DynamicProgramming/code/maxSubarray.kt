
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

fun maxSubArray(nums: IntArray): Int {
        
    var curr_summ = nums[0]
    var max_summ = nums[0]
        
    for (i in 1 until nums.size) {
        curr_summ = maxOf(nums[i], curr_summ + nums[i])
        max_summ = maxOf(curr_summ, max_summ)
    }
        
    return max_summ
}

fun main(args: Array<String>) {
    println("Enter array >> ")
    val nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Max subarray sum = ${maxSubArray(nums)}")
}
