
/*
You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
*/

fun minCostConnectPoints(points: Array<IntArray>): Int {
    val queue = PriorityQueue<Pair<Int, Int>>(compareBy { pair -> pair.first })
        
    val used = BooleanArray(points.size)
    queue.add(Pair(0, 0))
        
    var cost = 0
    var edges = 0
        
    while (edges < points.size) {
        val (weight, point) = queue.poll()
            
        if (used[point]) continue
            
        used[point] = true
        cost += weight
        edges++
            
        for (nextPoint in points.indices) {
            if (!used[nextPoint]) {
                val nextWeight = abs(points[point][0] - points[nextPoint][0]) + abs(points[point][1] - points[nextPoint][1])
                queue.add(Pair(nextWeight, nextPoint))
            }
        }
    }
        
    return cost
}