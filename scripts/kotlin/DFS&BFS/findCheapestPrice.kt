
/*
There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.
*/


fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
    val adjList = Array<ArrayList<Pair<Int, Int>>>(n) { ArrayList() }
    val costs = IntArray(n) { Int.MAX_VALUE }
    
    for (flight in flights) adjList[flight[0]].add(flight[1] to flight[2])
    
    val queue = LinkedList<Int>()
    queue.add(src)
    costs[src] = 0
    
    var stops = 0
    while (stops <= k && queue.isNotEmpty()) {
        val size = queue.size
        repeat(size) {
            val currNode = queue.remove()
            for ((neighbor, cost) in adjList[currNode]) {
                if (costs[neighbor] > costs[currNode] + cost) {
                    costs[neighbor] = costs[currNode] + cost
                    if (neighbor != dst) queue.add(neighbor)
                }
            }
        }
        stops++
    }
    
    return if (costs[dst] == Int.MAX_VALUE) -1 else costs[dst]
}