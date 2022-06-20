

/*
Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
*/

fun numTrees(n: Int): Int {
    val numbers = IntArray(n + 1) { 1 }
    for (i in 1..n) {
        var sum = 0
        for (j in 0 until i) sum += numbers[j] * numbers[i - j - 1]
        numbers[i] = sum
    }
    
    return numbers[n]
}