
/*
Given a 0-indexed n x n integer matrix grid, return the number of pairs (Ri, Cj) such that row Ri and column Cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e. an equal array).
*/

fun equalPairs(grid: Array<IntArray>): Int {
    var count = 0
    for (row in grid.indices) {
        for (col in grid[row].indices) {
            var i = 0
            var j = 0
            var areEqual = true
            while (i < grid[row].size && j < grid.size && areEqual) {
                if (grid[row][i] != grid[j][col]) areEqual = false
                i++
                j++
            } 
            if (areEqual) count++
        }
    }
    
    return count
}