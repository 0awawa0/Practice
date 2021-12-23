
/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

    For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
*/

fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        
  val adjList = HashMap<Int, MutableList<Int>>()
  val indegree = IntArray(numCourses)
  val topologicalOrder = IntArray(numCourses)
        
  prerequisites.forEach { prerequisite ->
    val dest = prerequisite[0]
    val src = prerequisite[1]
    val list = adjList[src] ?: ArrayList<Int>() 
    list.add(dest)
    adjList[src] = list
    indegree[dest]++
  }
        
  val queue = LinkedList<Int>()
  for (i in 0 until numCourses) if (indegree[i] == 0) queue.add(i)
        
  var i = 0
  while (queue.isNotEmpty()) {
    val node = queue.poll()
    topologicalOrder[i++] = node
            
    if (node in adjList) {
      for (neighbor in adjList[node]!!) {
        indegree[neighbor]--
                    
        if (indegree[neighbor] == 0) queue.add(neighbor)
      }
    }
  }
        
  if (i == numCourses) return topologicalOrder
  else return IntArray(0)
}
