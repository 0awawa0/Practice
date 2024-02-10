
/*
Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
*/

fun transpose(A: Array<IntArray>): Array<IntArray> {
    val result = Array<IntArray>(A[0].size) { IntArray(A.size) }
    for (i in 0 until A.size) {
        for (j in 0 until A[i].size) {
            result[j][i] = A[i][j]
        }
    }
        
    return result
}
