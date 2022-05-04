
/*
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
*/

fun maxPoints(points: Array<IntArray>): Int {
    if (points.size < 2) return 1
    var maxCount = 2
    for (i in points.indices) {
        val firstPoint = points[i]
        for (j in i + 1 until points.size) {
            val secondPoint = points[j]
            var count = 2
            for (k in j + 1 until points.size) {
                val thirdPoint = points[k]
                if (areOnTheSameLine(firstPoint, secondPoint, thirdPoint))
                    maxCount = maxOf(++count, maxCount)
            }
        }
    }
    return maxCount
}
    
private fun areOnTheSameLine(point1: IntArray, point2: IntArray, point3: IntArray): Boolean {
    val (x1, y1) = point1
    val (x2, y2) = point2
    val (x3, y3) = point3
    return (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2)
}