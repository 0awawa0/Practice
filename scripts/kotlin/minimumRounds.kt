

/*
You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.

Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
*/

fun minimumRounds(tasks: IntArray): Int {
    val difficulties = HashMap<Int, Int>()
    for (task in tasks) difficulties[task] = (difficulties[task] ?: 0) + 1
        
    var count = 0
    for (diff in difficulties.values) {
        if (diff < 2) return -1
        var threes = diff / 3
        when (diff % 3) {
            0 -> count += threes
            1 -> {
                threes--
                count += (diff - threes * 3) / 2 + threes
            }
            2 -> count += threes + 1
        }
    }
    return count
}