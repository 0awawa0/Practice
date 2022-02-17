
/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
*/

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
  val result = HashSet<List<Int>>()
        
  fun dfs(currList: LinkedList<Int>, currSum: Int, currIndex: Int): Boolean {
    if (currSum == target) {
      result.add(currList.toList())
      return true
    }
            
    if (currSum > target) return false
              
    var sum = currSum
    for (i in currIndex until candidates.size) {
      if (currSum + candidates[i] > target) continue
                
      currList.add(candidates[i])
      sum += candidates[i]
      
      dfs(currList, sum, i)
                
      currList.removeLast()
      sum -= candidates[i]
    }
            
    return false
  }
        
  for (i in candidates.indices) dfs(LinkedList<Int>(), 0, i)
        
  return result.toList()
}
