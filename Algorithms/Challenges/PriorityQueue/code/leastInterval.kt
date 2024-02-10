
/*
Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.
*/

fun leastInterval(tasks: CharArray, n: Int): Int {
        
    val counts = IntArray(26)
    for (task in tasks) counts[task - 'A']++
    
    val heap = PriorityQueue<Pair<Char, Int>>(compareByDescending { it.second })
    for (i in counts.indices) {
        if (counts[i] > 0) heap.add((i + 'A'.toInt()).toChar() to counts[i])
    }
    
    var count = 0
    while (heap.isNotEmpty()) {
        var k = n + 1
        val elems = LinkedList<Pair<Char, Int>>()
        while (k > 0 && heap.isNotEmpty()) {
            val currElem = heap.poll()
            elems.add(currElem.first to (currElem.second - 1))
            k--
            count++
        }
        
        elems.forEach { if (it.second > 0) heap.add(it) }
        
        if (heap.isNotEmpty()) count += k
    }
    return count
}