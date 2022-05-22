
/*
You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks. The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.

Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
*/

fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
    val leftoverSpace = IntArray(capacity.size) { capacity[it] - rocks[it] }
    leftoverSpace.sort()
        
    var count = 0
    var rocksLeft = additionalRocks
        
    for (i in leftoverSpace.indices) {
        if (rocksLeft > 0) {
            if (leftoverSpace[i] > rocksLeft) rocksLeft = 0
            else {
                rocksLeft -= leftoverSpace[i]
                leftoverSpace[i] = 0
            }
        }
            
        if (leftoverSpace[i] == 0) count++
    }
        
    return count
}