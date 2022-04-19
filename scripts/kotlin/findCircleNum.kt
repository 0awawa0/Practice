
/*
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.


*/

fun findCircleNum(isConnected: Array<IntArray>): Int {
    val visited = BooleanArray(isConnected.size)
        
    fun traverse(i: Int) {
        for (j in isConnected.indices) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true
                traverse(j)
            }
        }
    }
        
    var count = 0
    for (i in isConnected.indices) {
        if (!visited[i]) {
            count++
            traverse(i)
        }
    }
        
    return count
}