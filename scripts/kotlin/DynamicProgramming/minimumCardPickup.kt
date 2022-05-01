
/*
You are given an integer array cards where cards[i] represents the value of the ith card. A pair of cards are matching if the cards have the same value.

Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among the picked cards. If it is impossible to have matching cards, return -1.
*/

fun minimumCardPickup(cards: IntArray): Int {
    val indices = HashMap<Int, Int>()
    var minDistance = Int.MAX_VALUE
    for (i in cards.indices) {
        val card = cards[i]
        if (card in indices) minDistance = minOf(minDistance, i - indices[card]!! + 1)
        indices[card] = i
    }
    return if (minDistance == Int.MAX_VALUE) -1 else minDistance
}