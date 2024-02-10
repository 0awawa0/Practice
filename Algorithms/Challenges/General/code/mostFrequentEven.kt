
/*
Given an integer array `nums`, return _the most frequent even element_.

If there is a tie, return the **smallest** one. If there is no such element, return `-1`.
*/

fun mostFrequentEven(nums: IntArray): Int {
    val freqs = HashMap<Int, Int>()
    var maxFreq = 0
    var elem = -1
    for (num in nums) {
        if (num % 2 == 0) {
            val newFreq = (freqs[num] ?: 0) + 1
            if (newFreq == maxFreq && elem > num) elem = num
            if (newFreq > maxFreq) {
                maxFreq = newFreq
                elem = num
            }
            freqs[num] = newFreq
        }
    }
    return elem
}