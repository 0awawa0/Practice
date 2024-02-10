
/*
Given a matrix and a target, return the number of non-empty submatrices that sum to target.

A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.

Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
*/

fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
    val sums = HashMap<Int, Int>()
        
    // Calculating running sum of each row
    for (row in matrix) 
	    for (i in 1 until row.size) 
		    row[i] += row[i - 1]
        
    var count = 0
    // Iterating over all possible column pairs
    for (i in matrix[0].indices) {
        for (j in i until matrix[0].size) {
	        // Applying 1D solution for each column pair
            sums.clear()
            sums[0] = 1
            var currSum = 0
            for (row in matrix.indices) {
	            // Getting the subarray sum of the row
                currSum += matrix[row][j] - if (i > 0) matrix[row][i - 1] else 0
                count += sums[currSum - target] ?: 0
                sums[currSum] = (sums[currSum] ?: 0) + 1
            }
        }
    }
        
    return count
}