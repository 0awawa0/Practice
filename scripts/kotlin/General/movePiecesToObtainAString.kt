
/*
You are given two strings start and target, both of length n. Each string consists only of the characters 'L', 'R', and '_' where:

    + The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if there is a blank space directly to its left, and a piece 'R' can move to the right only if there is a blank space directly to its right.
    + The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.

Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times. Otherwise, return false.
*/

fun canChange(start: String, target: String): Boolean {
    var i = 0
    var j = 0
    while (true) {
        while (i < start.length && start[i] == '_') i++
        while (j < start.length && target[j] == '_') j++
        
        if (i >= start.length && j < target.length) return false
        if (j >= target.length && i < start.length) return false
        if (i >= start.length && j >= start.length) return true
        
        
        if (start[i] != target[j]) return false
        if (start[i] == 'R') if (i > j) return false
        if (start[i] == 'L') if (i < j) return false
        
        i++
        j++
    }
    return true
}