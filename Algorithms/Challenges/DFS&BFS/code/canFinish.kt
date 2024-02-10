

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
Return true if you can finish all courses. Otherwise, return false.
*/

fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    val graph = Array<MutableList<Int>>(numCourses) { ArrayList<Int>() }
    val dependencies = IntArray(numCourses)
    var canTake = 0
    
    for (dep in prerequisites) {
        dependencies[dep[1]]++
        graph[dep[0]].add(dep[1])
    }
    
    val queue = LinkedList<Int>()
    dependencies.forEachIndexed { idx, value -> if (value == 0) queue.add(idx) }
    
    while (queue.isNotEmpty()) {
        val node = queue.poll()
        canTake++
        for (neighbor in graph[node]) {
            dependencies[neighbor]--
            if (dependencies[neighbor] == 0) queue.add(neighbor)
        }
    }
    
    return canTake == numCourses
}