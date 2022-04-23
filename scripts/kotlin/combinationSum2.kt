
/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
*/

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = LinkedList<List<Int>>()
    candidates.sort()
        
    fun backtrack(currCombination: LinkedList<Int>, currSum: Int, index: Int) {
        if (currSum == target) {
            val list = currCombination.clone() as LinkedList<Int>
            result.add(list)
            return
        }
            
        for (i in index until candidates.size) {
            if (i > index && candidates[i] == candidates[i - 1]) continue
                
            if (currSum + candidates[i] > target) return
                
            currCombination.add(candidates[i])
            backtrack(currCombination, currSum + candidates[i], i + 1)
            currCombination.removeLast()
        }
    }
        
    backtrack(LinkedList<Int>(), 0, 0)
    return result
}