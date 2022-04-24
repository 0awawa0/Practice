

/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/


fun diagonalSum(mat: Array<IntArray>): Int {
    var sum = 0
    for (i in 0 until mat.size) {    
        if (i == mat.size - i - 1) { 
            sum += mat[i][i]
        } else {
            sum += mat[i][i] + mat[i][mat.size - i - 1]
        }
    }
    return sum
}
