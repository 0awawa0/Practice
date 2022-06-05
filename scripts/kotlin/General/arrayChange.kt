
/*
You are given a 0-indexed array nums that consists of n distinct positive integers. Apply m operations to this array, where in the ith operation you replace the number operations[i][0] with operations[i][1].

It is guaranteed that in the ith operation:

    + operations[i][0] exists in nums.
    + operations[i][1] does not exist in nums.

Return the array obtained after applying all the operations.
*/

fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray {
    val indices = HashMap<Int, Int>()
    for (i in nums.indices) indices[nums[i]] = i
        
    for (operation in operations) {
        val (from, to) = operation
        val index = indices[from]!!
        nums[index] = to
        indices.remove(from)
        indices[to] = index
    }
        
    return nums
}