
/*
Given an integer array `nums` of size `n`, return the minimum number of moves required to make all array elements equal. In one move, you can increment or decrement an element of the array by `1`.
*/

fun minMoves2(nums: IntArray): Int {
    nums.sort()
    val center = nums.size / 2
    var moves = 0
    for (num in nums) moves += abs(nums[center] - num)
    
    return moves
}