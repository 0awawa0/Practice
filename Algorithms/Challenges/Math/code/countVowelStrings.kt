
/*
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
*/

fun countVowelStrings(n: Int): Int {
    // (5 + n - 1)! / (n! * 4!) = (n + 4)! / 24n! = (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24
    return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24
}