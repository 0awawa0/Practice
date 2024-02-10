
/*
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

    Only numbers 1 through 9 are used.
    Each number is used at most once.

Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
*/

fun combinationSum3(k: Int, n: Int, currList: List<Int> = emptyList()): List<List<Int>> {
    if (k == 0) {
        if (n == 0) return listOf(currList)
        else return emptyList()
    }
        
    if (n <= 0) return emptyList()
        
    val result = LinkedList<List<Int>>()
    val lowerBound = if (currList.isEmpty()) 1 else currList.last() + 1
    for (i in lowerBound..9) result.addAll(combinationSum3(k - 1, n - i, currList + listOf(i)))
    return result
}