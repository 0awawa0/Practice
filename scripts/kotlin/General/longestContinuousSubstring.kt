
/*
An alphabetical continuous string is a string consisting of consecutive letters in the alphabet. In other words, it is any substring of the string "abcdefghijklmnopqrstuvwxyz".

    For example, "abc" is an alphabetical continuous string, while "acb" and "za" are not.

Given a string s consisting of lowercase letters only, return the length of the longest alphabetical continuous substring.
*/

fun longestContinuousSubstring(s: String): Int {
    var anchor = 0
    var maxLength = 1
    var expecting = s[0] + 1
    for (i in 1 until s.length) {
        if (s[i] != expecting) anchor = i
        expecting = s[i] + 1
        maxLength = maxOf(maxLength, i - anchor + 1)
    }
    return maxLength
}