
/*
Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence. 

If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, 
return the subsequence with the maximum total sum of all its elements. 
A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array. 

Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order.
*/

fun minSubsequence(nums: IntArray): List<Int> {
        
    if (nums.size == 1) return listOf(nums[0])
        
    val arraySum = nums.sum()
        
    for (num in nums) {
        if (num > arraySum - num) return listOf(num)
    }
        
    var numsCopy = nums.copyOf()
    numsCopy.sort()
        
    val result = LinkedList<Int>()
    var currSum = 0
    for (i in numsCopy.size - 1 downTo 0) {
        currSum += numsCopy[i]
        result.add(numsCopy[i])
        if (currSum > arraySum - currSum) break
    }
        
    return result
}

fun main(args: Array<String>) {
    print("Enter numbers array >> ")
    val nums = readLine()!!.split(',').map { it.toInt() }.toIntArray()
    println("Subsequence is ${minSubsequence(nums).joinToString(",")}")
}
