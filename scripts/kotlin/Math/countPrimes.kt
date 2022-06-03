
/*
Given an integer n, return the number of prime numbers that are strictly less than n.
*/

fun countPrimes(n: Int): Int {
    val list = BooleanArray(n) { true }
    var count = 0
    for (p in 2 until n) {
        if (list[p]) {
            count++
                
            var j = 2 * p
            while (j < n) {
                list[j] = false
                j += p
            }
        }
    }
        
    return count
}