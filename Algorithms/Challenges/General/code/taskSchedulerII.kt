



/*
You are given a 0-indexed array of positive integers tasks, representing tasks that need to be completed in order, where tasks[i] represents the type of the ith task.

You are also given a positive integer space, which represents the minimum number of days that must pass after the completion of a task before another task of the same type can be performed.

Each day, until all tasks have been completed, you must either:

    Complete the next task from tasks, or
    Take a break.

Return the minimum number of days needed to complete all tasks.
*/


fun taskSchedulerII(tasks: IntArray, space: Int): Long {
    var dayNumber = 0L
    val lastTaskIndex = HashMap<Int, Long>()
    
    for (i in tasks.indices) {
        val prevIndex = lastTaskIndex[tasks[i]] ?: Int.MIN_VALUE.toLong()
        val daysElapsed = dayNumber - prevIndex - 1L
        if (daysElapsed >= space) lastTaskIndex[tasks[i]] = dayNumber
        else {
            dayNumber += space.toLong() - daysElapsed
            lastTaskIndex[tasks[i]] = dayNumber
        }
        dayNumber++
    }
    return dayNumber
}