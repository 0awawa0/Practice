
/*
We distribute some number of candies, to a row of n = num_people people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.

Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.
*/


fun distributeCandies(candies: Int, num_people: Int): IntArray {
    var candies = candies
    var give = 1
    var pointer = 0
    val result = IntArray(num_people) { 0 }
    while (candies > 0) {
        if (candies < give) {
            result[pointer] += candies
            candies = 0
        } else {
            result[pointer] += give
            candies -= give
        }
        give += 1
        pointer = (pointer + 1) % num_people
    }
    return result
}

fun main(args: Array<String>) {
    print("Enter number of candies and number of people >> ")
    val inp = readLine()?.split(" ") ?: return
    print("Result: ${distributeCandies(inp[0].toInt(), inp[1].toInt()).joinToString(",")}")
}
