
/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
*/

fun generateMatrix(n: Int): Array<IntArray> {
    val matrix = Array<IntArray>(n) { IntArray(n) { 0 }}
    var x = 0
    var y = 0
    var iteration = 0
    var num = 1
    while (num <= n * n) {
        while (num <= n * n && y < matrix[x].size - iteration) matrix[x][y++] = num++
        y--
        x++            

        while (num <= n * n && x < matrix.size - iteration) matrix[x++][y] = num++
        y--
        x--
            
        while(num <= n * n && y >= iteration) matrix[x][y--] = num++
        y++
        x--
            
        while(num <= n * n && x > iteration + 1) matrix[x--][y] = num++
            
        iteration++
    }
        
    return matrix
}