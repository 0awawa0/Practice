
/*
Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.
*/

fun maxProduct(words: Array<String>): Int {
    val masks = IntArray(words.size)
    for (i in words.indices) {
        var mask = 0
        for (chr in words[i]) mask = mask.or(1.shl(chr - 'a'))
        masks[i] = mask
    }
        
    var max = 0
    for (i in words.indices) {
        for (j in i + 1 until words.size) {
            if (masks[i].and(masks[j]) == 0) max = maxOf(max, words[i].length * words[j].length)
        }
    }
    return max
}