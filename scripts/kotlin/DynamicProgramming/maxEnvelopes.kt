
/*
You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.

One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.

Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).

Note: You cannot rotate an envelope.
*/

fun maxEnvelopes(envelopes: Array<IntArray>): Int {
    envelopes.sortWith(compareBy<IntArray> { it[0] }.thenByDescending { it[1] })
        
    val result = IntArray(envelopes.size + 1)
    result[0] = envelopes[0][1]
        
    var ans = 1
    for (env in envelopes) {
        val height = env[1]
        val idx = result.binarySearch(height, 0, ans)
        result[idx] = height
        if (idx == ans) ans++
    }
    return ans - 1
}
    
private fun IntArray.binarySearch(key: Int, start: Int = 0, end: Int = this.lastIndex): Int {
    var left = start
    var right = end
    var middle = left + (right - left) / 2
    while (right - left > 1) {
        if (this[middle] == key) return middle
        if (this[middle] > key) right = middle
        else left = middle
        middle = left + (right - left) / 2
    }
        
    return middle + 1
}