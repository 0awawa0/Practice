
/*
You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

    'A': Absent.
    'L': Late.
    'P': Present.

The student is eligible for an attendance award if they meet both of the following criteria:

    The student was absent ('A') for strictly fewer than 2 days total.
    The student was never late ('L') for 3 or more consecutive days.

Return true if the student is eligible for an attendance award, or false otherwise.
*/


fun checkRecord(s: String): Boolean {
    var absentCount = 0
    var currLate = 0
    for (char in s) {
        when (char) {
            'A' -> {
                currLate = 0
                absentCount++
                if (absentCount >= 2) return false
            }
            'L' -> {
                currLate++
                if (currLate >= 3) return false
            }
            else -> currLate = 0
        }
    }
    return true
}