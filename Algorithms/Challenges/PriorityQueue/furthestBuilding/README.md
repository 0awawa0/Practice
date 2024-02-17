# Furthest Building

## Challenge

You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.

You start your journey from building 0 and move to the next building by possibly using bricks or ladders.

While moving from building i to building i+1 (0-indexed),

    If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
    If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.

Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.

## Solution

In order to solve the challenge we should note that the ladder allows us to go to the next building no matter how tall it is, so ladders are much more valuable than bricks and we should use them only for the highest differences in heights on our path and use bricks for the smallest differences. So how would we do that? 
Okay, let's do kind of the opposite of what we should - let's use ladders all the time. But also, let's remember all cases when we used ladders sorded by ascending order. This way when we run out of ladders we can look back and use bricks instead of ladders for covering the smalles height differences. And when we replace ladder with bricks, we can use this ladder to go further.

## Code

```Kotlin
fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
    val queue = PriorityQueue<Int>() // Priority queue allows us to store differences in a sorted way efficiently
    var bricksLeft = bricks
    var prev = Int.MAX_VALUE
    for (i in 0 until heights.lastIndex) {
        val diff = heights[i + 1] - heights[i]
        if (diff > 0) queue.add(diff) // Remember the difference we covered with ladder
        if (queue.size > ladders) bricksLeft -= queue.poll() // If count of differences we covered becomes greater than count of ladders, i.e. we cannot use a to go to the next building, we get the smallest covered difference from queue and use bricks for that case instead.
        if (bricksLeft < 0) return i // If count of bricks drops below zero then we have ran out of ladders and also ran out of bricks, so we cannot move to the next building
    }
    
    return heights.lastIndex
}
```