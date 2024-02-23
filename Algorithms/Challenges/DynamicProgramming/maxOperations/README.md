# Max Operations

## Challenge

Given an array of integers called `nums`, you can perform any of the following operation while `nums` contains at least `2` elements:

    Choose the first two elements of nums and delete them.
    Choose the last two elements of nums and delete them.
    Choose the first and the last elements of nums and delete them.

The score of the operation is the sum of the deleted elements.

Your task is to find the maximum number of operations that can be performed, such that all operations have the same score.

Return the maximum number of operations possible that satisfy the condition mentioned above.

__Example 1:__

    Input: nums = [3,2,1,2,3,4]
    Output: 3
    Explanation: We perform the following operations:
    - Delete the first two elements, with score 3 + 2 = 5, nums = [1,2,3,4].
    - Delete the first and the last elements, with score 1 + 4 = 5, nums = [2,3].
    - Delete the first and the last elements, with score 2 + 3 = 5, nums = [].
    We are unable to perform any more operations as nums is empty.

__Example 2:__

    Input: nums = [3,2,6,1,4]
    Output: 2
    Explanation: We perform the following operations:
    - Delete the first two elements, with score 3 + 2 = 5, nums = [6,1,4].
    - Delete the last two elements, with score 1 + 4 = 5, nums = [6].
    It can be proven that we can perform at most 2 operations.

### Constraints:

    2 <= nums.length <= 2000
    1 <= nums[i] <= 1000

## Solution
TODO

## Code

```Kotlin
data class Key(
    val firstIdx: Int,
    val lastIdx: Int,
    val operations: Int,
    val target: Int
)
    
fun maxOperations(nums: IntArray): Int {
        
    val memory = HashMap<Key, Int>()
    fun findMax(firstIdx: Int, lastIdx: Int, operations: Int, target: Int): Int {
        if (lastIdx - firstIdx < 1) return operations
        val key = Key(firstIdx, lastIdx, operations, target)
        if (key in memory) return memory[key]!!
            
        var maxOperations = operations
        if (nums[firstIdx] + nums[firstIdx + 1] == target) {
            maxOperations = maxOf(maxOperations, findMax(firstIdx + 2, lastIdx, operations + 1, target))
        }
            
        if (nums[lastIdx] + nums[lastIdx - 1] == target) { 
            maxOperations = maxOf(maxOperations, findMax(firstIdx, lastIdx - 2, operations + 1, target))
        }
            
        if (nums[firstIdx] + nums[lastIdx] == target) {
            maxOperations = maxOf(maxOperations, findMax(firstIdx + 1, lastIdx - 1, operations + 1, target))
        }
            
        memory[key] = maxOperations
            
        return maxOperations
    }
        
    var max = findMax(2, nums.lastIndex, 1, nums[0] + nums[1])
    max = maxOf(max, findMax(0, nums.lastIndex - 2, 1, nums[nums.lastIndex] + nums[nums.lastIndex - 1]))
    max = maxOf(max, findMax(1, nums.lastIndex - 1, 1, nums[nums.lastIndex] + nums[0]))
        
    return max
}
```