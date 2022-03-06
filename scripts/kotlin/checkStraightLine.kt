
/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
*/

fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
  if (coordinates.size == 2) return true
  for (i in 2 until coordinates.size) {
    val (x1, y1) = coordinates[i]
    val (x2, y2) = coordinates[i - 1]
    val (x3, y3) = coordinates[i - 2]
    if ((y3 - y1) * (x3 - x2) != (x3 - x1) * (y3 - y2)) return false
  }
  return true
}
