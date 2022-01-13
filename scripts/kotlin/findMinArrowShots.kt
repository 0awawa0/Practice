
/*
There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
*/

fun findMinArrowShots(points: Array<IntArray>): Int {
  points.sortBy { it[0] }
  var currentPoint = points[0]
  var count = 1
  for (i in 1 until points.size) {
    val point = points[i]
    if (point[0] > currentPoint[1]) {
      count++
      currentPoint = point
    } else {
      if (currentPoint[1] > point[1]) currentPoint = point
    }
  }
  return count
}