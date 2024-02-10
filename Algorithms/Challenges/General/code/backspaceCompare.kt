
/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
*/

fun backspaceCompare(s: String, t: String): Boolean {
    var i = s.lastIndex
    var j = t.lastIndex
    var skipS = 0
    var skipT = 0
        
    while (i >= 0 || j >= 0) {
            
        while (i >= 0) {
            if (s[i] == '#')  {
                skipS++
                i--
            } else {
                if (skipS > 0) {
                    skipS--
                    i--
                } else break
            }
        }
            
        while (j >= 0) {
            if (t[j] == '#') {
                skipT++
                j--
            } else {
                if (skipT > 0) {
                    skipT--
                    j--
                } else break
            }
        }
            
        if (i >= 0 && j >= 0 && s[i] != t[j]) return false
        if ((i >= 0) != (j >= 0)) return false
        i--
        j--
    }
    return true
}