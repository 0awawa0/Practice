
/*
Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

You must find a solution with a memory complexity better than O(n^2).
*/


fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
    var left = matrix[0][0]
    var right = matrix.last().last()
    
    while (left <= right) {
        val middle = left + (right - left) / 2
        if (countSmaller(matrix, middle) < k) left = middle + 1
        else right = middle - 1
    }
    
    return left
}

fun countSmaller(matrix: Array<IntArray>, target: Int): Int {
    var row = matrix.lastIndex
    var col = 0
    var count = 0
    while (row >= 0 && col < matrix.size) {
        if (matrix[row][col] > target) row--
        else {
            count += row + 1
            col++
        }
    }
    return count
}