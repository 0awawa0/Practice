
/*
You are given an array of variable pairs equations and an array of real numbers values, where equations[i] = [Ai, Bi] and values[i] represent the equation Ai / Bi = values[i]. Each Ai or Bi is a string that represents a single variable.

You are also given some queries, where queries[j] = [Cj, Dj] represents the jth query where you must find the answer for Cj / Dj = ?.

Return the answers to all queries. If a single answer cannot be determined, return -1.0.
*/

fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
    val answers = HashMap<String, HashMap<String, Double>>()
        
    for (i in equations.indices) {
        val (first, second) = equations[i]
        if (answers[first] == null) answers[first] = HashMap<String, Double>()
        if (answers[second] == null) answers[second] = HashMap<String, Double>()
        answers[first]?.set(second, values[i])
        answers[second]?.set(first, 1 / values[i])
    }
        
    val result = DoubleArray(queries.size)
    for (i in queries.indices) result[i] = performSearch(answers, queries[i][0], queries[i][1])
    return result
}
    
private fun performSearch(answers: HashMap<String, HashMap<String, Double>>, curr: String, finish: String): Double {
    val map = answers[curr] ?: return -1.0
    if (answers[finish] == null) return -1.0
        
    if (map[finish] != null) return map[finish]!!
    val visited = HashSet<String>()
    val queue = LinkedList<Pair<String, Double>>()
    for (key in map.keys) queue.add(Pair(key, map[key]!!))
        
    while (queue.isNotEmpty()) {
        val (currNode, currResult) = queue.poll()
        visited.add(currNode)
        val currMap = answers[currNode]!!
            
        for (key in currMap.keys) {
            if (key == finish) {
                map[finish] = currResult * currMap[key]!!
                return map[finish]!!
            }
            if (key !in visited) queue.add(Pair(key, currMap[key]!! * currResult))    
        }
    }
    return -1.0
}