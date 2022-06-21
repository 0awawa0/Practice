
/*
You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.

You start your journey from building 0 and move to the next building by possibly using bricks or ladders.

While moving from building i to building i+1 (0-indexed),

    If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
    If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.

Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
*/

fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
    val queue = PriorityQueue<Int>()
    var bricksLeft = bricks
    var prev = Int.MAX_VALUE
    for (i in 0 until heights.lastIndex) {
        val diff = heights[i + 1] - heights[i]
        if (diff > 0) queue.add(diff)
        if (queue.size > ladders) bricksLeft -= queue.poll()
        if (bricksLeft < 0) return i
    }
    
    return heights.lastIndex
}