
/*
Alice and Bob are traveling to Rome for separate business meetings.

You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob. Alice will be in the city from the dates arriveAlice to leaveAlice (inclusive), while Bob will be in the city from the dates arriveBob to leaveBob (inclusive). Each will be a 5-character string in the format "MM-DD", corresponding to the month and day of the date.

Return the total number of days that Alice and Bob are in Rome together.

You can assume that all dates occur in the same calendar year, which is not a leap year. Note that the number of days per month can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].
*/


fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
        
    val aliceStart = dateToDayNumber(arriveAlice)
    val aliceEnd = dateToDayNumber(leaveAlice)
    val bobStart = dateToDayNumber(arriveBob)
    val bobEnd = dateToDayNumber(leaveBob)
    
    return maxOf(minOf(aliceEnd, bobEnd) - maxOf(aliceStart, bobStart) + 1, 0)
}

private fun dateToDayNumber(date: String): Int {
    val monthsLenghts = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val (month, day) = date.split("-").map { it.toInt()  }
    var dayNumber = 0
    var i = 0
    while (i < month - 1) dayNumber += monthsLenghts[i++]
    return dayNumber + day
}