
/*
You are given two integers m and n representing a 0-indexed m x n grid. You are also given two 2D integer arrays guards and walls where guards[i] = [rowi, coli] and walls[j] = [rowj, colj] represent the positions of the ith guard and jth wall respectively.

A guard can see every cell in the four cardinal directions (north, east, south, or west) starting from their position unless obstructed by a wall or another guard. A cell is guarded if there is at least one guard that can see it.

Return the number of unoccupied cells that are not guarded.
*/

enum class CellState {
        Guard,
        Wall,
        GuardedV,
        GuardedH,
        GuardedBoth,
        Unguarded
    }
    
fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
    val grid = Array<Array<CellState>>(m) { Array<CellState>(n) { CellState.Unguarded } }
        
    fun guardHorizontal(x: Int, y: Int) {
        if (x < 0 || x >= grid.size) return
        if (y < 0 || y >= grid[x].size) return
        if (grid[x][y] == CellState.Guard || grid[x][y] == CellState.Wall) return
        if (grid[x][y] == CellState.GuardedH || grid[x][y] == CellState.GuardedBoth) return
            
        grid[x][y] = if (grid[x][y] == CellState.Unguarded) CellState.GuardedH else CellState.GuardedBoth
        guardHorizontal(x, y - 1)
        guardHorizontal(x, y + 1)
    }
        
    fun guardVertical(x: Int, y: Int) {
        if (x < 0 || x >= grid.size) return
        if (y < 0 || y >= grid[x].size) return
        if (grid[x][y] == CellState.Guard || grid[x][y] == CellState.Wall) return
        if (grid[x][y] == CellState.GuardedV || grid[x][y] == CellState.GuardedBoth) return
            
        grid[x][y] = if (grid[x][y] == CellState.Unguarded) CellState.GuardedV else CellState.GuardedBoth
        guardVertical(x + 1, y)
        guardVertical(x - 1, y)
    }
        
    for (wall in walls) grid[wall[0]][wall[1]] = CellState.Wall
        
    for (guard in guards) {
        grid[guard[0]][guard[1]] = CellState.Guard
        guardVertical(guard[0] - 1, guard[1])
        guardVertical(guard[0] + 1, guard[1])
        guardHorizontal(guard[0], guard[1] - 1)
        guardHorizontal(guard[0], guard[1] + 1)
    }
        
    var count = 0
    for (x in grid.indices)
        for (y in grid[x].indices) if (grid[x][y] == CellState.Unguarded) count++
    return count
}