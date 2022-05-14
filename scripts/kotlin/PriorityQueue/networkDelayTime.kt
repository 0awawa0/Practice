
/*
You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

We will send a signal from a given node k. Return the time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.
*/

fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        
    // Creating an adjacency map, which maps node to 
    // list of its neighbors with times to send signal to a neighbor
    val adjacencyMap = HashMap<Int, MutableList<Pair<Int, Int>>>()
    for (time in times) {
        val (src, dst, t)  = time
        if (adjacencyMap[src] == null) adjacencyMap[src] = LinkedList()
        adjacencyMap[src]!!.add(Pair(t, dst))
    }
        
    // Time passed to receive signal at node
    val rcvTimes = IntArray(n + 1) { Int.MAX_VALUE }
        
    // Dijkstra's algorithm
    val queue = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
        
    queue.add(Pair(0, k))
    rcvTimes[k] = 0
        
    while (queue.isNotEmpty()) {
        val (time, node) = queue.poll()
            
        if (time > rcvTimes[node]) continue
        if (adjacencyMap[node] == null) continue
            
        for (edge in adjacencyMap[node]!!) {
            val (sendTime, neighbor) = edge
            if (rcvTimes[neighbor] > time + sendTime) {
                rcvTimes[neighbor] = time + sendTime
                queue.add(Pair(rcvTimes[neighbor], neighbor))
            }
        }
    }
        
    var res = Int.MIN_VALUE
    for (i in 1..n) res = maxOf(res, rcvTimes[i])
    return if (res == Int.MAX_VALUE) -1 else res
}
