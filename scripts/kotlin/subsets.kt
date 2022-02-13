
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
*/

fun subsets(nums: IntArray): List<List<Int>> {
  val result = ArrayList<List<Int>>()
  result.add(emptyList())
        
  for (num in nums)
    for (i in result.indices) 
      result.add(result[i] + num)
        
  return result
}
