


/*
You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

Return a list answer of size 2 where:

    answer[0] is a list of all players that have not lost any matches.
    answer[1] is a list of all players that have lost exactly one match.

The values in the two lists should be returned in increasing order.

Note:

    You should only consider the players that have played at least one match.
    The testcases will be generated such that no two matches will have the same outcome.
*/

fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val scores = HashMap<Int, IntArray>()
    for (match in matches) {
        val (winner, loser) = match
        if (scores[winner] == null) scores[winner] = IntArray(2)
        if (scores[loser] == null) scores[loser] = IntArray(2)
        val winArr = scores[winner]!!
        val losArr = scores[loser]!!
        winArr[0]++
        losArr[1]++
    }
        
    val wonList = LinkedList<Int>()
    val lostList = LinkedList<Int>()
        
    for (node in scores) {
        if (node.value[0] != 0 && node.value[1] == 0) wonList.add(node.key)
        if (node.value[1] == 1) lostList.add(node.key)
    }
        
    wonList.sort()
    lostList.sort()
        
    return listOf(wonList, lostList)
}