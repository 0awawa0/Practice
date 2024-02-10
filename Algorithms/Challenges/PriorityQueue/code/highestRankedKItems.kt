

/*
You are given a 0-indexed 2D integer array grid of size m x n that represents a map of the items in a shop. The integers in the grid represent the following:

    0 represents a wall that you cannot pass through.
    1 represents an empty cell that you can freely move to and from.
    All other positive integers represent the price of an item in that cell. You may also freely move to and from these item cells.

It takes 1 step to travel between adjacent grid cells.

You are also given integer arrays pricing and start where pricing = [low, high] and start = [row, col] indicates that you start at the position (row, col) and are interested only in items with a price in the range of [low, high] (inclusive). You are further given an integer k.

You are interested in the positions of the k highest-ranked items whose prices are within the given price range. The rank is determined by the first of these criteria that is different:

    Distance, defined as the length of the shortest path from the start (shorter distance has a higher rank).
    Price (lower price has a higher rank, but it must be in the price range).
    The row number (smaller row number has a higher rank).
    The column number (smaller column number has a higher rank).

Return the k highest-ranked items within the price range sorted by their rank (highest to lowest). If there are fewer than k reachable items within the price range, return all of them.
*/

data class Rank(
  val distance: Int,
  val price: Int,
  val row: Int,
  val col: Int
): Comparable<Rank> {
        
  override fun compareTo(other: Rank): Int {
    if (this.distance == other.distance) {
      if (this.price == other.price) {
        if (this.row == other.row) {
          return this.col - other.col
        } else {
          return this.row - other.row
        }
      } else {
        return this.price - other.price
      }
    } else {
      return this.distance - other.distance
    }
  }
}
    
fun highestRankedKItems(grid: Array<IntArray>, pricing: IntArray, start: IntArray, k: Int): List<List<Int>> {
  val visited = Array<BooleanArray>(grid.size) { BooleanArray(grid[it].size) }
  val ranks = PriorityQueue<Rank>()
        
  val queue = LinkedList<Triple<Int, Int, Int>>()
  queue.add(Triple(start[0], start[1], 0))
  while (queue.isNotEmpty()) {
    val (row, col, distance) = queue.poll()
    if (row < 0 || row >= grid.size) continue
    if (col < 0 || col >= grid[row].size) continue
    if (grid[row][col] == 0) continue
    if (visited[row][col]) continue
    visited[row][col] = true
            
    if (grid[row][col] >= pricing[0] && grid[row][col] <= pricing[1]) 
      ranks.add(Rank(distance, grid[row][col], row, col))

    queue.add(Triple(row + 1, col, distance + 1))
    queue.add(Triple(row - 1, col, distance + 1))
    queue.add(Triple(row, col + 1, distance + 1))
    queue.add(Triple(row, col - 1, distance + 1))
  }
        
  val result = ArrayList<List<Int>>()
  var i = 0
  while (ranks.isNotEmpty() && i < k) {
    val rank = ranks.poll()
    result.add(listOf(rank.row, rank.col))
    i++
  }
  return result
}
