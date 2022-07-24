
/*
You are given an integer array ranks and a character array suits. You have 5 cards where the ith card has a rank of ranks[i] and a suit of suits[i].

The following are the types of poker hands you can make from best to worst:

    "Flush": Five cards of the same suit.
    "Three of a Kind": Three cards of the same rank.
    "Pair": Two cards of the same rank.
    "High Card": Any single card.

Return a string representing the best type of poker hand you can make with the given cards.

Note that the return values are case-sensitive.
*/

fun bestHand(ranks: IntArray, suits: CharArray): String {
    if (suits.toSet().size == 1) return "Flush"
    val counts = HashMap<Int, Int>()
    var highestCount = 0
    for (rank in ranks) {
        val newCount = (counts[rank] ?: 0) + 1
        counts[rank] = newCount
        highestCount = maxOf(newCount, highestCount)
    }
    when (highestCount) {
        5 -> return "Three of a Kind"
        4 -> return "Three of a Kind"
        3 -> return "Three of a Kind"
        2 -> return "Pair"
        else -> return "High Card"
    }
}