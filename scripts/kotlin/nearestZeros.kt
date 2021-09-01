
/*
Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell. The distance between two adjacent cells is 1.
*/


fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val distances = Array<IntArray>(mat.size) { it -> 
        IntArray(mat[it].size) { Int.MAX_VALUE - 1000 } 
    }
    for (i in 0 until mat.size) {
        for (j in 0 until mat[i].size) {
            if (mat[i][j] == 0) distances[i][j] = 0
            else {
                if (i > 0) 
                    distances[i][j] = minOf(distances[i][j], distances[i - 1][j] + 1)
                        
                if (j > 0) 
                    distances[i][j] = minOf(distances[i][j], distances[i][j - 1] + 1)
            }
        }
    }
        
    for (i in mat.size - 1 downTo 0) {
        for (j in mat[i].size - 1 downTo 0) {
            if (mat[i][j] == 0) distances[i][j] = 0
            else {
                if (i + 1 < mat.size)  
                    distances[i][j] = minOf(distances[i][j], distances[i + 1][j] + 1)
                    
                if (j  + 1 < mat[i].size)
                    distances[i][j] = minOf(distances[i][j], distances[i][j + 1] + 1)
            }
        }
    }
        
        
    return distances
}
