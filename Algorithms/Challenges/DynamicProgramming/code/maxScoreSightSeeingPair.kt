
/*
You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.

The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.

Return the maximum score of a pair of sightseeing spots.
*/

fun maxScoreSightseeingPair(values: IntArray): Int {
    var anchor = 0
    var maxScore = 0
    for (i in 1 until values.size) {
        val neighborScore = values[i] + values[i - 1] - 1
        val anchorScore = values[anchor] + values[i] + anchor - i
        maxScore = maxOf(maxScore, maxOf(anchorScore, neighborScore))
        if (anchorScore < neighborScore) anchor = i - 1
    }
    
    return maxScore
}