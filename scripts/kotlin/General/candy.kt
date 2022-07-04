
/*
You are giving candies to these children subjected to the following requirements:

    + Each child must have at least one candy.
    + Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies to the children.
*/

fun candy(ratings: IntArray): Int {
    val candies = IntArray(ratings.size) { 1 }
    for (i in 1 until ratings.size) {
        if (ratings[i] > ratings[i - 1]) candies[i] = candies[i - 1] + 1
    }
    
    var sum = candies.last()
    for (i in ratings.lastIndex - 1 downTo 0) {
        if (ratings[i] > ratings[i + 1]) {
            candies[i] = maxOf(candies[i], candies[i + 1] + 1)
        }
        sum += candies[i]
    }
    return sum
}