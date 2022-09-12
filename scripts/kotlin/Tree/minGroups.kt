
/*
You are given a 2D integer array `intervals` where `intervals[i] = [lefti, righti]` represents the **inclusive** interval `[lefti, righti]`.

You have to divide the intervals into one or more **groups** such that each interval is in **exactly** one group, and no two intervals that are in the same group **intersect** each other.

Return _the **minimum** number of groups you need to make_.

Two intervals **intersect** if there is at least one common number between them. For example, the intervals `[1, 5]` and `[5, 8]` intersect.
*/

fun minGroups(intervals: Array<IntArray>): Int {
    intervals.sortWith(compareBy<IntArray>{ it[1] }.thenBy { it[0] })
        
    val s = TreeMap<Int, Int>()
    for (interval in intervals) {
        val oldInterval = s.lowerKey(interval[0])
        if (oldInterval == null) 
	        s[interval[1]] = (s[interval[1]] ?: 0) + 1
        else {
            s[oldInterval] = (s[oldInterval] ?: 1) - 1
            if (s[oldInterval] == 0) s.remove(oldInterval)
            s[interval[1]] = (s[interval[1]] ?: 0) + 1
        }
    }

    var count = 0
    for ((key, value) in s) count += value
    return count
}