
/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
*/

fun permuteUnique(nums: IntArray): List<List<Int>> {
    val uniqueNumbers = HashMap<Int, Int>()
    for (num in nums) uniqueNumbers[num] = (uniqueNumbers[num] ?: 0) + 1
        
    val result = LinkedList<List<Int>>()
    fun backtrack(currCombination: LinkedList<Int>) {
        if (currCombination.size == nums.size) {
            result.add(currCombination.clone() as List<Int>)
            return
        }
            
        for (pair in uniqueNumbers) {
            val key = pair.key
            val value = pair.value
            if (value == 0) continue
                
            currCombination.add(key)
            uniqueNumbers[key] = (uniqueNumbers[key] ?: 1) - 1
                
            backtrack(currCombination)
                
            currCombination.removeLast()
            uniqueNumbers[key] = value
        }
    }
        
    backtrack(LinkedList<Int>())
    return result
}