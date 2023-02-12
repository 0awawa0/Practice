
/*
You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
*/

fun minimumRecolors(blocks: String, k: Int): Int {
    var count = 0
    for (i in 0 until k) if (blocks[i] == 'W') count++
    
    var minCount = count
    for (i in k until blocks.length) {
        if (blocks[i - k] == 'W') count--
        if (blocks[i] == 'W') count++
        minCount = minOf(count, minCount)
    }
    return minCount
}