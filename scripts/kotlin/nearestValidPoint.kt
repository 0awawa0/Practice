
/*
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
*/

fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
  var smallestDistance = Int.MAX_VALUE
  var index = -1
  for (point in points.indices) {
    if (points[point][0] == x || points[point][1] == y) {
      if (abs(points[point][0] - x) + abs(points[point][1] - y) < smallestDistance) {
        smallestDistance = abs(points[point][0] - x) + abs(points[point][1] - y)
        index=  point
      }
    }
  }
  return index
}
