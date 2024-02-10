
/*
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
*/

fun reverseString(s: CharArray): Unit {
    for (i in 0 until s.size / 2) {
        val t = s[i]
        s[i] = s[s.size - i - 1]
        s[s.size - i - 1] = t
    }
}
