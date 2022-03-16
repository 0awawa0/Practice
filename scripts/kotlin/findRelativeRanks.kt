
/*
You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

    + The 1st place athlete's rank is "Gold Medal".
    + The 2nd place athlete's rank is "Silver Medal".
    + The 3rd place athlete's rank is "Bronze Medal".
    + For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").

Return an array answer of size n where answer[i] is the rank of the ith athlete.
*/

fun findRelativeRanks(score: IntArray): Array<String> {
  val pairs = score.mapIndexed { index, value -> Pair(index, value) }.toMutableList()
  pairs.sortByDescending { it.second }
  val result = Array<String>(score.size) { "" }
  for (i in pairs.indices) {
    when (i) {
      0 -> result[pairs[i].first] = "Gold Medal"
      1 -> result[pairs[i].first] = "Silver Medal"
      2 -> result[pairs[i].first] = "Bronze Medal"
      else -> result[pairs[i].first] = "${i + 1}"
    }
  }
  return result
}
