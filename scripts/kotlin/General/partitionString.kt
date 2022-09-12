
/*
Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.
*/

fun partitionString(s: String): Int {
    var count = 1
    var currLetters = HashSet<Char>()
    for (char in s) {
        if (char in currLetters) {
            count++
            currLetters.clear()
        }
        currLetters.add(char)
    }
    return count
}