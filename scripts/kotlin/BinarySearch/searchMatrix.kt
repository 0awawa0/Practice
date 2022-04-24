
/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

    * Integers in each row are sorted from left to right.
    * The first integer of each row is greater than the last integer of the previous row.

*/

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (r in matrix) {
        if (target < r.first()) return false
        if (target > r.last()) continue
            
        var left = 0
        var right  = r.lastIndex
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (r[middle] == target) return true
            if (r[middle] > target) right = middle - 1
            else left = middle + 1
        }
        return false
    }
    return false
} 
