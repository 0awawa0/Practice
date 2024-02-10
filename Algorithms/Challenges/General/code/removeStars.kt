
/*
You are given a string s, which contains stars *.

In one operation, you can:

    Choose a star in s.
    Remove the closest non-star character to its left, as well as remove the star itself.

Return the string after all stars have been removed.

Note:

    The input will be generated such that the operation is always possible.
    It can be shown that the resulting string will always be unique.
*/

fun removeStars(s: String): String {
    val indicesToRemove = HashSet<Int>()
    var starsAfter = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] == '*') {
            indicesToRemove.add(i)
            starsAfter++
        } else {
            if (starsAfter > 0) {
                indicesToRemove.add(i)
                starsAfter--
            }
        }
    }
    
    return buildString {
        for (i in s.indices) if (i !in indicesToRemove) append(s[i])
    }
}