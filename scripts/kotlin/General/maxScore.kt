
/*
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
*/

fun maxScore(cardPoints: IntArray, k: Int): Int {
    var totalSum = 0L
    for (point in cardPoints) totalSum += point.toLong()
    
    val windowSize = cardPoints.size - k
    var currSum = 0L
    for (i in 0 until windowSize) currSum += cardPoints[i].toLong()
    var minSum = currSum
    
    for (i in windowSize until cardPoints.size) {
        currSum -= cardPoints[i - windowSize].toLong()
        currSum += cardPoints[i].toLong()
        minSum = minOf(minSum, currSum)
    }
    
    return (totalSum - minSum).toInt()
}