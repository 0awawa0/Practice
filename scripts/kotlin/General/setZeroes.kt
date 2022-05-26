
/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
*/

fun setZeroes(matrix: Array<IntArray>): Unit {
        
    var firstCol = false 
        
    for (r in matrix.indices) {
            
        if (matrix[r][0] == 0) firstCol = true            
        for (c in 1 until matrix[r].size) {
            if (matrix[r][c] == 0) {
                matrix[r][0] = 0
                matrix[0][c] = 0
            }
        }
    }
        
        
    for (r in 1 until matrix.size) {
        for (c in 1 until matrix[r].size) {
            if (matrix[r][0] == 0 || matrix[0][c] == 0) matrix[r][c] = 0
        }
    }
        
    if (matrix[0][0] == 0) for (c in matrix[0].indices) matrix[0][c] = 0
    if (firstCol) for (r in matrix.indices) matrix[r][0] = 0
}