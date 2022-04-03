
/*
You are given two strings current and correct representing two 24-hour times.

24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.

In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.

Return the minimum number of operations needed to convert current to correct.
*/


fun convertTime(current: String, correct: String): Int {
    val currInt = timeToInt(current)
    val corrInt = timeToInt(correct)
    val maxTime = timeToInt("24:00")
    var diff = corrInt - currInt
    if (diff < 0) diff += maxTime
        
    var ops = 0
    while (diff > 0) {
        when {
            diff >= 60 -> diff -= 60
            diff >= 15 -> diff -= 15
            diff >= 5 -> diff -= 5
            diff >= 1 -> diff -= 1
        }
        ops++
    }
        
    return ops
}
    
private fun timeToInt(s: String): Int {
    val (h, m) = s.split(":").map { it.toInt() }
    return h * 60 + m
}