
/*
There are n different online courses numbered from 1 to n. You are given an array courses where courses[i] = [durationi, lastDayi] indicate that the ith course should be taken continuously for durationi days and must be finished before or on lastDayi.

You will start on the 1st day and you cannot take two or more courses simultaneously.

Return the maximum number of courses that you can take.
*/

fun scheduleCourse(courses: Array<IntArray>): Int {
    courses.sortBy { it[1] }
    val queue = PriorityQueue<Int>(compareByDescending { it })
    var currDay = 0
    for (course in courses) {
        currDay += course[0]
        queue.add(course[0])
        if (currDay > course[1]) currDay -= queue.poll()
    }
    return queue.size
}