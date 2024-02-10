
/*
An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.

Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
*/

fun findOriginalArray(changed: IntArray): IntArray {
        
    val freqs = HashMap<Int, Int>()
    for (num in changed) freqs[num] = (freqs[num] ?: 0) + 1
    
    val result = IntArray(changed.size)
    var wrtPointer = 0
    for (key in freqs.keys) {
        if (key == 0) {
            if (freqs[key]!! % 2 != 0) return IntArray(0)
            repeat(freqs[key]!! / 2) { result[wrtPointer++] = key }
        } else {
            var newKey = key
            while (newKey % 2 == 0 && newKey / 2 in freqs) newKey /= 2
            while (newKey in freqs) {
                if (freqs[newKey] ?: 0 > 0) {
                    repeat(freqs[newKey] ?: 0) { result[wrtPointer++] = newKey }
                    if ((freqs[newKey * 2] ?: 0) < (freqs[newKey] ?: 0)) return IntArray(0)
                    freqs[newKey * 2] = (freqs[newKey * 2] ?: 0) - (freqs[newKey] ?: 0)
                    freqs[newKey] = 0
                }
                newKey *= 2
            }
        }
    }
    return result.sliceArray(0 until wrtPointer)
}