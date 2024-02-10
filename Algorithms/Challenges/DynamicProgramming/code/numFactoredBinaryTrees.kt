
/*
Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.

We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.

Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.
*/

fun numFactoredBinaryTrees(arr: IntArray): Int {
    val modulo = 1_000_000_007
    val mem = HashMap<Int, Long>()
    val numberSet = arr.toSet()

    fun searchTrees(node: Int): Long {
        if (node in mem) return mem[node]!!
        
        var count = 1L
        for (num in arr) {
            if (node % num == 0 && node / num in numberSet) {
                count = (count + (searchTrees(num) * searchTrees(node / num)) % modulo) % modulo
            }
        }
        
        mem[node] = count
        return count
    }
    
    var totalCount = 0L
    for (root in arr) totalCount = (totalCount + searchTrees(root)) % modulo
    return totalCount.toInt()
}