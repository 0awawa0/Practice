
/*
A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
*/


fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        
    val queue = PriorityQueue<Int>()
    for (col in mat[0].indices) {
        var r = 0
        var c = col
        
        while (r < mat.size && c < mat[r].size) queue.add(mat[r++][c++])
        
        r = 0
        c = col
        while(r < mat.size && c < mat[r].size) mat[r++][c++] = queue.poll()
    }
    
    for (row in 1 until mat.size) {
        var r = row
        var c = 0
        while (r < mat.size && c < mat[r].size) queue.add(mat[r++][c++])
        
        r = row
        c = 0
        while (r < mat.size && c < mat[r].size) mat[r++][c++] = queue.poll()
    }
    
    return mat
}