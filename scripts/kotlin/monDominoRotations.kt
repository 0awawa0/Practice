
/*
In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.

Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.

If it cannot be done, return -1.
*/

fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
  val topCounts = IntArray(6)
  val botCounts = IntArray(6)
  val bothCounts = IntArray(6)
  for (i in tops.indices) {
    if (tops[i] == bottoms[i]) bothCounts[tops[i] - 1]++
    else {
      bothCounts[tops[i] - 1]++
      bothCounts[bottoms[i] - 1]++
      topCounts[tops[i] - 1]++
      botCounts[bottoms[i] - 1]++
    }
  }
        
  for (i in 0..5) if (bothCounts[i] == tops.size) return minOf(botCounts[i], topCounts[i])
        
  return -1
}
