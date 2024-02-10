
/*
You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.

Return true if you can make this square and false otherwise.
*/

fun makesquare(matchsticks: IntArray): Boolean {
    val perimeter = matchsticks.sum()!!
    if (perimeter % 4 != 0) return false
    val side = perimeter / 4
    matchsticks.sortDescending()
    
    val sides = IntArray(4)
    
    fun dfs(idx: Int): Boolean {
        if (idx >= matchsticks.size)
            return sides.all { it == side }
        
        for (i in 0..3) {
            if (sides[i] + matchsticks[idx] <= side) {
                sides[i] += matchsticks[idx]
                if (dfs(idx + 1)) return true
                sides[i] -= matchsticks[idx]
            }
        }
        
        return false
    }
    
    return dfs(0)
}