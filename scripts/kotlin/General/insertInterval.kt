
/*
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.
*/

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    var idx = 0
    val result = LinkedList<IntArray>()
        
    // Skip non-overlaping intervals
    while (idx < intervals.size && intervals[idx][1] < newInterval[0]) result.add(intervals[idx++])
    // Merge overlaping intervals
    while (idx < intervals.size && intervals[idx][0] <= newInterval[1]) {
        newInterval[0] = minOf(newInterval[0], intervals[idx][0])
        newInterval[1] = maxOf(newInterval[1], intervals[idx][1])
        idx++
    }
    result.add(newInterval)
        
    // Add rest
    while (idx < intervals.size) result.add(intervals[idx++])
    return result.toTypedArray()
}