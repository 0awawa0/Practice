
/*
Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.
As the answer can be very large, return it modulo 10^9 + 7.
*/


fun threeSumMulti(arr: IntArray, target: Int): Int {
    val mod = 1_000_000_007
    val table = HashMap<Int, Int>()
    var count = 0
        
    for (i in arr.indices) {
        count = (count + (table[target - arr[i]] ?: 0)) % mod
            
        for (j in 0 until i) {
            table[arr[i] + arr[j]] = (table[arr[i] + arr[j]] ?: 0) + 1
        }
    }
        
    return count
}