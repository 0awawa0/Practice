

/*
You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the array are removed.
*/


fun minSetSize(arr: IntArray): Int {
    val frequencies = HashMap<Int, Int>()
    arr.forEach { frequencies[it] = (frequencies[it] ?: 0) + 1 }
    
    val counts = IntArray(arr.size)
    for (freq in frequencies.values) counts[freq - 1]++
    
    var removed = 0
    var steps = 0
    for (i in counts.lastIndex downTo 0) {
        while (counts[i] > 0) {
            removed += i + 1
            steps++
            counts[i]--
            if (removed * 2 >= arr.size) return steps
        }
    }
    
    return steps
}