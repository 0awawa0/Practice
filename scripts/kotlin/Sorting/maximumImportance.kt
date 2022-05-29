
/*
You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.

You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.

You need to assign each city with an integer value from 1 to n, where each value can only be used once. The importance of a road is then defined as the sum of the values of the two cities it connects.

Return the maximum total importance of all roads possible after assigning the values optimally.
*/

fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
    val counts = Array<IntArray>(n) { intArrayOf(it, 0) }
    for (road in roads) {
        counts[road[0]][1]++
        counts[road[1]][1]++
    }
        
    counts.sortBy { it[1] }
    var sum = 0L
    for (i in n - 1 downTo  0) sum += counts[i][1].toLong() * (i + 1).toLong()
    return sum
}