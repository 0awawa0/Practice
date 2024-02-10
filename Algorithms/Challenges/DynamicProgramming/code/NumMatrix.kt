
/*
Given a 2D matrix matrix, handle multiple queries of the following type:

    + Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

Implement the NumMatrix class:

    + NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
    + int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

*/


class NumMatrix(matrix: Array<IntArray>) {
    
    private val memory = Array<IntArray>(matrix.size + 1) { IntArray(matrix[0].size + 1) }

    init {
        for (i in 1 until memory.size) {
            for (j in 1 until memory[i].size)
                memory[i][j] = matrix[i - 1][j - 1] + memory[i - 1][j] + memory[i][j - 1] - memory[i - 1][j - 1]
        }
    }
    
    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        return memory[row2 + 1][col2 + 1] - memory[row2 + 1][col1] - memory[row1][col2 + 1] + memory[row1][col1]
    }

}
