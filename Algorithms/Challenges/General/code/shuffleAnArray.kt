
/*
Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

Implement the Solution class:

    Solution(int[] nums) Initializes the object with the integer array nums.
    int[] reset() Resets the array to its original configuration and returns it.
    int[] shuffle() Returns a random shuffling of the array.

*/

class Solution(private val nums: IntArray) {

    private val currArray = nums.clone() as IntArray
    
    fun reset(): IntArray { return nums.clone() }

    fun shuffle(): IntArray { 
        for (i in nums.indices) {
            val swapIndex = Random.nextInt(i, nums.size)
            val t = currArray[i]
            currArray[i] = currArray[swapIndex]
            currArray[swapIndex] = t
        }
        
        return currArray
    }

}